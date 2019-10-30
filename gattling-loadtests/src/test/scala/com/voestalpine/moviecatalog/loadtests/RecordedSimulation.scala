package com.voestalpine.moviecatalog.loadtests

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

  val httpProtocol = http
    .baseUrl("http://movie-catalog-test.apps.ocp-test.voestalpine.net")
    .inferHtmlResources()
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("de,de-DE;q=0.9,en-US;q=0.8,en;q=0.7")
    .doNotTrackHeader("1")
    .upgradeInsecureRequestsHeader("1")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.120 Safari/537.36")

  val headers_0 = Map("Proxy-Connection" -> "keep-alive")

  val scn = scenario("RecordedSimulation")
    .exec(http("request_0")
      .get("/catalog/foo")
      .headers(headers_0))

//  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
    setUp(scn.inject(rampUsers(10000) during(100 seconds))).protocols(httpProtocol)
}