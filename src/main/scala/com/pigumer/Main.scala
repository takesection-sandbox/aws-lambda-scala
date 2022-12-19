package com.pigumer

import com.amazonaws.services.lambda.runtime.{Context, RequestStreamHandler}
import org.crac
import org.crac.{Core, Resource}

import java.io.{InputStream, OutputStream}
import java.nio.charset.StandardCharsets
import scala.util.Try

class Main extends RequestStreamHandler with Resource {

  Core.getGlobalContext.register(this);

  val sleep = Try(Thread.sleep(10000))

  override def handleRequest(input: InputStream, output: OutputStream, context: Context): Unit = {
    context.getLogger.log("handleRequest");
    output.write("\"Hello, World!\"".getBytes(StandardCharsets.UTF_8));
    output.flush();
  }

  override def beforeCheckpoint(context: crac.Context[_ <: Resource]): Unit = {
    System.out.println("beforeCheckpoint");
  }

  override def afterRestore(context: crac.Context[_ <: Resource]): Unit = {
    System.out.println("afterRestore");
  }
}
