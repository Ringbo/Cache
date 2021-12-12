diff --git a/core/src/main/java/io/undertow/io/UndertowOutputStream.java b/core/src/main/java/io/undertow/io/UndertowOutputStream.java
index ede6e53..37af6f2 100644
--- a/core/src/main/java/io/undertow/io/UndertowOutputStream.java
+++ b/core/src/main/java/io/undertow/io/UndertowOutputStream.java
@@ -249,7 +249,7 @@
             throw UndertowMessages.MESSAGES.streamIsClosed();
         }
         if (buffer != null && buffer.position() != 0) {
-            writeBufferBlocking(true);
+            writeBufferBlocking(false);
         }
         if (channel == null) {
             channel = exchange.getResponseChannel();
