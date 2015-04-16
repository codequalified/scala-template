scalaVersion := "2.11.6"

name := "quiz"

version := "1"

assemblyJarName in assembly := "quiz.jar"


libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.4" % "test"
)
