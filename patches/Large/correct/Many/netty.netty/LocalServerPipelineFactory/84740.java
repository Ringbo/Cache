diff --git a/src/main/java/org/jboss/netty/example/local/LocalServerPipelineFactory.java b/src/main/java/org/jboss/netty/example/local/LocalServerPipelineFactory.java
index d389884..9778024 100644
--- a/src/main/java/org/jboss/netty/example/local/LocalServerPipelineFactory.java
+++ b/src/main/java/org/jboss/netty/example/local/LocalServerPipelineFactory.java
@@ -37,17 +37,17 @@
  */
 public class LocalServerPipelineFactory implements ChannelPipelineFactory {
 
-    private final Executor eventExecutor;
+    private final ExecutionHandler executionHandler;
 
     public LocalServerPipelineFactory(Executor eventExecutor) {
-        this.eventExecutor = eventExecutor;
+        executionHandler = new ExecutionHandler(eventExecutor);
     }
 
     public ChannelPipeline getPipeline() throws Exception {
         final ChannelPipeline pipeline = Channels.pipeline();
         pipeline.addLast("decoder", new StringDecoder());
         pipeline.addLast("encoder", new StringEncoder());
-        pipeline.addLast("executor", new ExecutionHandler(eventExecutor));
+        pipeline.addLast("executor", executionHandler);
         pipeline.addLast("handler", new EchoCloseServerHandler());
         return pipeline;
     }
