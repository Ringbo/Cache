diff --git a/components/camel-netty/src/main/java/org/apache/camel/component/netty/ClientPipelineFactory.java b/components/camel-netty/src/main/java/org/apache/camel/component/netty/ClientPipelineFactory.java
index 4dbbdf4..f986bcc 100644
--- a/components/camel-netty/src/main/java/org/apache/camel/component/netty/ClientPipelineFactory.java
+++ b/components/camel-netty/src/main/java/org/apache/camel/component/netty/ClientPipelineFactory.java
@@ -46,7 +46,7 @@
         this.callback = callback;
     }
 
-    public synchronized ChannelPipeline getPipeline() throws Exception {
+    public ChannelPipeline getPipeline() throws Exception {
         // create a new pipeline
         ChannelPipeline channelPipeline = Channels.pipeline();
 
