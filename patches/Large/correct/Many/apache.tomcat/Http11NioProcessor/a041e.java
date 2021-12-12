diff --git a/java/org/apache/coyote/http11/Http11NioProcessor.java b/java/org/apache/coyote/http11/Http11NioProcessor.java
index 1b728cf..36fb605 100644
--- a/java/org/apache/coyote/http11/Http11NioProcessor.java
+++ b/java/org/apache/coyote/http11/Http11NioProcessor.java
@@ -832,7 +832,7 @@
                     socket.getIOChannel().socket().setSoTimeout((int)soTimeout);
                     inputBuffer.readTimeout = soTimeout;
                 }
-                if (!inputBuffer.parseRequestLine(keptAlive && (endpoint.getCurrentThreadsBusy() > limit))) {
+                if (!inputBuffer.parseRequestLine(keptAlive && (endpoint.getCurrentThreadsBusy() >= limit))) {
                     // This means that no data is available right now
                     // (long keepalive), so that the processor should be recycled
                     // and the method should return true
