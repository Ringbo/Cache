diff --git a/transport/src/main/java/io/netty/channel/DefaultChannelPipeline.java b/transport/src/main/java/io/netty/channel/DefaultChannelPipeline.java
index 0d3307a..8a6f6da 100644
--- a/transport/src/main/java/io/netty/channel/DefaultChannelPipeline.java
+++ b/transport/src/main/java/io/netty/channel/DefaultChannelPipeline.java
@@ -1331,7 +1331,7 @@
         private final Unsafe unsafe;
 
         HeadContext(DefaultChannelPipeline pipeline) {
-            super(pipeline, null, HEAD_NAME, false, true);
+            super(pipeline, null, HEAD_NAME, true, true);
             unsafe = pipeline.channel().unsafe();
             setAddComplete();
         }
