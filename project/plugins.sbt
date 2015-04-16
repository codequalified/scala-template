resolvers ++= Seq(Resolver.sonatypeRepo("releases"),"spray repo" at "http://repo.spray.io")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "3.0.0")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.13.0")
