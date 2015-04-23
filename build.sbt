import bintray.Keys._

sbtPlugin := true

organization := "org.neolin.sbt"

name := "sbt-simple-url-update"

version := "1.0.1"

scalaVersion := "2.10.4"

resolvers += Classpaths.sbtPluginSnapshots

bintrayPublishSettings

repository in bintray := "sbt-plugins"

bintrayOrganization in bintray := None

addSbtPlugin("com.typesafe.sbt" % "sbt-web" % "1.0.0")

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

publishMavenStyle := false 

scriptedSettings

scriptedLaunchOpts += ("-Dproject.version=" + version.value)
