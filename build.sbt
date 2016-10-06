name := "hashingsha"

scalaVersion := "2.11.8"

organization := "io.tabmo"

version := "1"

scalaVersion := "2.11.8"
val circeVersion = "0.5.0-M1"

resolvers ++= Seq("RoundEights" at "http://maven.spikemark.net/roundeights")

libraryDependencies ++= Seq("com.roundeights" %% "hasher" % "1.2.0")

libraryDependencies +=  "ch.qos.logback" % "logback-classic" % "1.1.3"

libraryDependencies ++= Seq("circe-core", "circe-parser", "circe-generic").map("io.circe" %% _ % circeVersion)

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"


