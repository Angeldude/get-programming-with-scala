// Implement a server that exposes an API that successfully replies to any request
// with a message that provides its method and path.


import cats.effect.IO
import fs2.StreamApp
import org.http4s.server.blaze.BlazeBuilder

import scala.concurrent.ExecutionContext.Implicits.global

object InfoApp extends StreamApp[IO] {

  def stream(args: List[String], requestShutdown: IO[Unit]) =
    BlazeBuilder[IO]
    .bindHttp(8000, "0.0.0.0")
    .mountService(infoService, "/")
    .serve

  private def infoService = (new InfoService).service

}

import org.http4s.HttpService
import org.http4s.dsl.Http4sDsl

class InfoService extends Http4sDsl[IO] {

  val service = HttpService[IO] {
    case method -> path => Ok(s"method is $method; path is $path")
  }

}
