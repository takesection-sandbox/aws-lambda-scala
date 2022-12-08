import sbt._

object Dependencies {
  val lambda = "com.amazonaws" % "aws-lambda-java-core" % "1.2.2"
  val appDeps = Seq(lambda)
}
