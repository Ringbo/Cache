diff --git a/providers/grizzly/src/main/java/org/asynchttpclient/providers/grizzly/bodyhandler/BodyGeneratorBodyHandler.java b/providers/grizzly/src/main/java/org/asynchttpclient/providers/grizzly/bodyhandler/BodyGeneratorBodyHandler.java
index b8f3437..287f309 100644
--- a/providers/grizzly/src/main/java/org/asynchttpclient/providers/grizzly/bodyhandler/BodyGeneratorBodyHandler.java
+++ b/providers/grizzly/src/main/java/org/asynchttpclient/providers/grizzly/bodyhandler/BodyGeneratorBodyHandler.java
@@ -44,7 +44,7 @@
         final BodyGenerator generator = request.getBodyGenerator();
         final Body bodyLocal = generator.createBody();
         final long len = bodyLocal.getContentLength();
-        if (len > 0) {
+        if (len >= 0) {
             requestPacket.setContentLengthLong(len);
         } else {
             requestPacket.setChunked(true);
