diff --git a/angel-ps/core/src/main/java/com/tencent/angel/psagent/matrix/transport/MatrixTransportClient.java b/angel-ps/core/src/main/java/com/tencent/angel/psagent/matrix/transport/MatrixTransportClient.java
index 78d8d4d..57a7529 100644
--- a/angel-ps/core/src/main/java/com/tencent/angel/psagent/matrix/transport/MatrixTransportClient.java
+++ b/angel-ps/core/src/main/java/com/tencent/angel/psagent/matrix/transport/MatrixTransportClient.java
@@ -137,7 +137,7 @@
 
     msgQueue = new LinkedBlockingQueue<ByteBuf>();
     stopped = new AtomicBoolean(false);
-    clientThreadPool = Executors.newCachedThreadPool();
+    clientThreadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() / 2);
 
     Configuration conf = PSAgentContext.get().getConf();
     timer = new Timer();
