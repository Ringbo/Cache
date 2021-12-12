diff --git a/java/libraries/net/src/processing/net/Client.java b/java/libraries/net/src/processing/net/Client.java
index 61bdfa9..6e343f2 100644
--- a/java/libraries/net/src/processing/net/Client.java
+++ b/java/libraries/net/src/processing/net/Client.java
@@ -46,7 +46,7 @@
  */
 public class Client implements Runnable {
 
-  protected static final int MAX_BUFFER_SIZE = 2 << 27; // 128 MB
+  protected static final int MAX_BUFFER_SIZE = 1 << 27; // 128 MB
 
   PApplet parent;
   Method clientEventMethod;
@@ -222,7 +222,7 @@
     byte[] readBuffer;
     { // make the read buffer same size as socket receive buffer so that
       // we don't waste cycles calling listeners when there is more data waiting
-      int readBufferSize = 2 << 16; // 64 KB (default socket receive buffer size)
+      int readBufferSize = 1 << 16; // 64 KB (default socket receive buffer size)
       try {
         readBufferSize = socket.getReceiveBufferSize();
       } catch (SocketException ignore) { }
