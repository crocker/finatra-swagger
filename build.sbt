name := "finatra-swagger"

organization := "com.jakehschwartz"

scalaVersion := "2.12.6"

sbtVersion := "0.13.16"

libraryDependencies ++= Seq(
  "com.twitter" %% "finatra-http" % "18.6.0",
  "io.swagger" % "swagger-core" % "1.5.19",
  "io.swagger" %% "swagger-scala-module" % "1.0.4",
  "org.webjars" % "swagger-ui" % "3.13.3",
  "net.bytebuddy" % "byte-buddy" % "1.8.12",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-language:existentials",
  "-language:implicitConversions"
)

pomIncludeRepository := { _ => false }

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

// License of your choice
licenses := Seq("Apache 2" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))
homepage := Some(url("https://(your project url)"))
scmInfo := Some(
  ScmInfo(
    browseUrl = url("https://github.com/jakehschwartz/finatra-swagger"),
    connection = "https://github.com/jakehschwartz/finatra-swagger.git"
  )
)
developers := List(
  Developer(id="jakehschwartz", name="Jake Schwartz", email="jakehschwartz@gmail.com", url=url("https://www.jakehschwartz.com")),
  Developer(id="xiaodongw", name="Xiaodong Wang", email="xiaodongw79@gmail.com", url=url("https://github.com/xiaodongw"))
)
