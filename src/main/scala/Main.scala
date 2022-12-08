import com.amazonaws.services.lambda.runtime.{Context, RequestStreamHandler}

import java.io.{InputStream, OutputStream}
import java.nio.charset.StandardCharsets
import scala.util.Try

trait Main extends RequestStreamHandler {

  val sleep = Try(Thread.sleep(10000))

  override def handleRequest(input: InputStream, output: OutputStream, context: Context): Unit = {
    output.write("\"Hello, World!\"".getBytes(StandardCharsets.UTF_8));
    output.flush();
  }
}
