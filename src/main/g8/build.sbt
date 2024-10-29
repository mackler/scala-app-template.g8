name := "$name$"

version := "0.0.0"

scalaVersion := "$scala_version$"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio" % "$zio_version$",
  "org.scalacheck" %% "scalacheck" % "$scalacheck_version$" % Test,
)
