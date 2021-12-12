diff --git a/components/camel-grpc/src/main/java/org/apache/camel/component/grpc/GrpcConsumer.java b/components/camel-grpc/src/main/java/org/apache/camel/component/grpc/GrpcConsumer.java
index a964c06..7b69c96 100644
--- a/components/camel-grpc/src/main/java/org/apache/camel/component/grpc/GrpcConsumer.java
+++ b/components/camel-grpc/src/main/java/org/apache/camel/component/grpc/GrpcConsumer.java
@@ -71,7 +71,7 @@
     @Override
     protected void doStop() throws Exception {
         if (server != null) {
-            LOG.trace("Terminating gRPC server");
+            LOG.debug("Terminating gRPC server");
             server.shutdown().shutdownNow();
             server = null;
         }
@@ -93,10 +93,10 @@
         }
         
         if (!ObjectHelper.isEmpty(configuration.getHost()) && !ObjectHelper.isEmpty(configuration.getPort())) {
-            LOG.info("Building gRPC server on " + configuration.getHost() + ":" + configuration.getPort());
+            LOG.debug("Building gRPC server on " + configuration.getHost() + ":" + configuration.getPort());
             serverBuilder = NettyServerBuilder.forAddress(new InetSocketAddress(configuration.getHost(), configuration.getPort()));
         } else if (ObjectHelper.isEmpty(configuration.getHost()) && !ObjectHelper.isEmpty(configuration.getPort())) {
-            LOG.info("Building gRPC server on <any address>" + ":" + configuration.getPort());
+            LOG.debug("Building gRPC server on <any address>" + ":" + configuration.getPort());
             serverBuilder = NettyServerBuilder.forPort(configuration.getPort());
         } else {
             throw new IllegalArgumentException("No server start properties (host, port) specified");
