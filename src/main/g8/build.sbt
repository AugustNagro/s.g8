lazy val $name$ = project.in(file("."))
  .settings(commonSettings: _*)
  .settings(
    libraryDependencies ++= Seq(
      "org.scalacheck" %% "scalacheck" % "$scalacheck_version$" % "test"
    )
  )

lazy val commonSettings = Seq(
  organization := "$organization$",
  version := "$version$",
  scalaVersion := "2.12.3",
  updateOptions := updateOptions.value.withCachedResolution(true),
  scalacOptions ++= Seq(
    "-deprecation",
    "-unchecked",
    "-target:jvm-1.8",
    "-encoding", "UTF-8",
    "-Xfuture",
    "-language:existentials",
    "-language:higherKinds",
    "-language:implicitConversions",
    "-language:experimental.macros",
    "-Yno-adapted-args",
    "-Ywarn-dead-code",
    "-Ywarn-numeric-widen",
    "-Yno-adapted-args",
    "-Ywarn-value-discard",
    "-Ywarn-unused",
    "-feature",
    "-Xlint",
    "-Ypartial-unification",
    "-Yno-predef"
  )
)



