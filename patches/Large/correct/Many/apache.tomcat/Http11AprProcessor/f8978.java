diff --git a/java/org/apache/coyote/http11/Http11AprProcessor.java b/java/org/apache/coyote/http11/Http11AprProcessor.java
index 7e80637..124a72c 100644
--- a/java/org/apache/coyote/http11/Http11AprProcessor.java
+++ b/java/org/apache/coyote/http11/Http11AprProcessor.java
@@ -816,7 +816,7 @@
                     Socket.timeoutSet(socket, soTimeout * 1000);
                 }
                 if (!inputBuffer.parseRequestLine
-                        (keptAlive && (endpoint.getCurrentThreadsBusy() > limit))) {
+                        (keptAlive && (endpoint.getCurrentThreadsBusy() >= limit))) {
                     // This means that no data is available right now
                     // (long keepalive), so that the processor should be recycled
                     // and the method should return true
