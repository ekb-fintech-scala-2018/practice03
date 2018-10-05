name := "practice03"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test

scalacOptions ++= Seq(
  "-feature",
  "-language:higherKinds"
)

//addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.8")