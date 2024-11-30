name := "$name$"

version := "0.0.0"

scalaVersion := "$scala_version$"

Compile / run / fork := true

libraryDependencies ++= Seq(
$if(use_zio.truthy)$
  "dev.zio" %% "zio" % "$zio_version$",
$else$
  "org.typelevel" %% "cats-effect" % "$cats_version$",
$endif$
  "org.scalatest" %% "scalatest" % "3.2.19" % "test",
  "org.scalatestplus" %% "scalacheck-1-18" % "3.2.19.0" % Test,
)
