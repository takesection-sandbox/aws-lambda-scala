import sbt._

object Dependencies {
  val lambda = "com.amazonaws" % "aws-lambda-java-core" % "1.2.2"
  val crac = "io.github.crac" % "org-crac" % "0.1.3"
  val appDeps = Seq(lambda, crac)
}
