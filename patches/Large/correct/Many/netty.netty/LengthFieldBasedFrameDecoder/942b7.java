diff --git a/src/main/java/org/jboss/netty/handler/codec/frame/LengthFieldBasedFrameDecoder.java b/src/main/java/org/jboss/netty/handler/codec/frame/LengthFieldBasedFrameDecoder.java
index 2733109..671a0f4 100644
--- a/src/main/java/org/jboss/netty/handler/codec/frame/LengthFieldBasedFrameDecoder.java
+++ b/src/main/java/org/jboss/netty/handler/codec/frame/LengthFieldBasedFrameDecoder.java
@@ -239,7 +239,7 @@
             int maxFrameLength,
             int lengthFieldOffset, int lengthFieldLength,
             int lengthAdjustment, int initialBytesToStrip) {
-        this(maxFrameLength, lengthFieldOffset, lengthFieldOffset, lengthAdjustment,
+        this(maxFrameLength, lengthFieldOffset, lengthFieldLength, lengthAdjustment,
                 initialBytesToStrip, false);
     }
 
