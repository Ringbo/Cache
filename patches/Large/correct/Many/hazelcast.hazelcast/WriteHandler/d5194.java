diff --git a/hazelcast/src/main/java/com/hazelcast/nio/tcp/WriteHandler.java b/hazelcast/src/main/java/com/hazelcast/nio/tcp/WriteHandler.java
index f38da46..a90b70c 100644
--- a/hazelcast/src/main/java/com/hazelcast/nio/tcp/WriteHandler.java
+++ b/hazelcast/src/main/java/com/hazelcast/nio/tcp/WriteHandler.java
@@ -157,7 +157,7 @@
      * This call is only made by the IO thread.
      */
     private void unschedule() {
-        if (dirtyOutputBuffer()) {
+        if (dirtyOutputBuffer() || currentPacket != null) {
             // Because not all data was written to the socket, we need to register for OP_WRITE so we get
             // notified when the socketChannel is ready for more data.
             registerOp(SelectionKey.OP_WRITE);
