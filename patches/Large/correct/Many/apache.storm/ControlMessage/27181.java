diff --git a/storm-netty/src/jvm/backtype/storm/messaging/netty/ControlMessage.java b/storm-netty/src/jvm/backtype/storm/messaging/netty/ControlMessage.java
index 9a7f8cc..ec2292f 100644
--- a/storm-netty/src/jvm/backtype/storm/messaging/netty/ControlMessage.java
+++ b/storm-netty/src/jvm/backtype/storm/messaging/netty/ControlMessage.java
@@ -31,11 +31,10 @@
 
     /**
      * encode the current Control Message into a channel buffer
-     * @param bout
      * @throws Exception
      */
     ChannelBuffer buffer() throws Exception {
-        ChannelBufferOutputStream bout = new ChannelBufferOutputStream(ChannelBuffers.dynamicBuffer());      
+        ChannelBufferOutputStream bout = new ChannelBufferOutputStream(ChannelBuffers.buffer(2));      
         write(bout);
         bout.close();
         return bout.buffer();
