package repro

import calico.IOWebApp
import calico.html.io.{*, given}
import cats.effect.*
import fs2.dom.*

object Main extends IOWebApp:
  override def render: Resource[IO, HtmlElement[IO]] =
    div(i("hello"))