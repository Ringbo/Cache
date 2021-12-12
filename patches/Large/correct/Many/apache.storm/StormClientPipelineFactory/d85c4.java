diff --git a/storm-core/src/jvm/backtype/storm/messaging/netty/StormClientPipelineFactory.java b/storm-core/src/jvm/backtype/storm/messaging/netty/StormClientPipelineFactory.java
index 6bad8e3..e6e8b3d 100644
--- a/storm-core/src/jvm/backtype/storm/messaging/netty/StormClientPipelineFactory.java
+++ b/storm-core/src/jvm/backtype/storm/messaging/netty/StormClientPipelineFactory.java
@@ -37,7 +37,7 @@
         // Encoder
         pipeline.addLast("encoder", new MessageEncoder());
         // business logic.
-        pipeline.addLast("handler", new StormClientHandler(client));
+        pipeline.addLast("handler", new StormClientErrorHandler(client.name()));
 
         return pipeline;
     }
