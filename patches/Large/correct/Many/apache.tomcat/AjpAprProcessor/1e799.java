diff --git a/java/org/apache/coyote/ajp/AjpAprProcessor.java b/java/org/apache/coyote/ajp/AjpAprProcessor.java
index 275f255..96ded17 100644
--- a/java/org/apache/coyote/ajp/AjpAprProcessor.java
+++ b/java/org/apache/coyote/ajp/AjpAprProcessor.java
@@ -507,13 +507,13 @@
         long socketRef = socket.getSocket().longValue();
         
         if (outputBuffer.position() > 0) {
-            if (Socket.sendbb(socketRef, 0, outputBuffer.position()) < 0) {
+            if ((socketRef != 0) && Socket.sendbb(socketRef, 0, outputBuffer.position()) < 0) {
                 throw new IOException(sm.getString("ajpprocessor.failedsend"));
             }
             outputBuffer.clear();
         }
         // Send explicit flush message
-        if (explicit && !finished) {
+        if (explicit && !finished &&  (socketRef != 0)) {
             if (Socket.send(socketRef, flushMessageArray, 0,
                     flushMessageArray.length) < 0) {
                 throw new IOException(sm.getString("ajpprocessor.failedflush"));
