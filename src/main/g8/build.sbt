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
  "org.scalacheck" %% "scalacheck" % "$scalacheck_version$" % Test,
)
