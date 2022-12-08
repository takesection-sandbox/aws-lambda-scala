import Dependencies._
import sbt.Keys._

lazy val root = (project in file(".")).
   settings(
     inThisBuild(List(
       organization := "com.pigumer",
       scalaVersion := "2.13.10",
       libraryDependencies ++= appDeps
     )),
     name := "aws-lambda-scala",
     assembly / assemblyJarName := "aws-lambda-scala.jar"
   )
