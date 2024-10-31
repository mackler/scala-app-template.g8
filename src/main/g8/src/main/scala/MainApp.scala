import $if(use_zio.truthy)$zio$else$cats.effect$endif$.*

object MainApp extends $if(use_zio.truthy)$ZIOAppDefault$else$IOApp.Simple$endif$:
  override val run = $if(use_zio.truthy)$Console.printLine$else$IO.println$endif$("Hello, World!")
