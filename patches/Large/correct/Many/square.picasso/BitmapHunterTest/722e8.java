diff --git a/picasso/src/test/java/com/squareup/picasso3/BitmapHunterTest.java b/picasso/src/test/java/com/squareup/picasso3/BitmapHunterTest.java
index 01cf215..05fa265 100644
--- a/picasso/src/test/java/com/squareup/picasso3/BitmapHunterTest.java
+++ b/picasso/src/test/java/com/squareup/picasso3/BitmapHunterTest.java
@@ -122,7 +122,7 @@
   @Test public void responseExceptionDispatchFailed() {
     Action action = mockAction(URI_KEY_1, URI_1);
     BitmapHunter hunter = new TestableBitmapHunter(picasso, dispatcher, cache, stats, action, null,
-        new NetworkRequestHandler.ResponseException(0, 504));
+        new NetworkRequestHandler.ResponseException(504, 0));
     hunter.run();
     verify(dispatcher).dispatchFailed(hunter);
   }
