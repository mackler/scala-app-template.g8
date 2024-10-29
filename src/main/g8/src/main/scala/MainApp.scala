import zio.*
import java.io.IOException

object MainApp extends ZIOAppDefault:
  override def run: IO[IOException, Unit] =
    Console.printLine("Hello, World!")
