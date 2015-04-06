scalaVersion := "2.11.6"

name := "codequalified-quiz"

version := "1"

resolvers ++= Seq("spray repo" at "http://repo.spray.io")

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.4" % "test"
)
