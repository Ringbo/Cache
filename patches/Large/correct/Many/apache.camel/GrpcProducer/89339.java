diff --git a/components/camel-grpc/src/main/java/org/apache/camel/component/grpc/GrpcProducer.java b/components/camel-grpc/src/main/java/org/apache/camel/component/grpc/GrpcProducer.java
index fcc2ed7..2a2030a 100644
--- a/components/camel-grpc/src/main/java/org/apache/camel/component/grpc/GrpcProducer.java
+++ b/components/camel-grpc/src/main/java/org/apache/camel/component/grpc/GrpcProducer.java
@@ -72,10 +72,10 @@
         if (channel == null) {
             initializeChannel();
             if (endpoint.isSynchronous()) {
-                LOG.info("Getting synchronous method stub from channel");
+                LOG.debug("Getting synchronous method stub from channel");
                 grpcStub = GrpcUtils.constructGrpcBlockingStub(configuration.getServicePackage(), configuration.getServiceName(), channel, endpoint.getCamelContext());
             } else {
-                LOG.info("Getting asynchronous method stub from channel");
+                LOG.debug("Getting asynchronous method stub from channel");
                 grpcStub = GrpcUtils.constructGrpcAsyncStub(configuration.getServicePackage(), configuration.getServiceName(), channel, endpoint.getCamelContext());
             }
         }
@@ -84,7 +84,7 @@
     @Override
     protected void doStop() throws Exception {
         if (channel != null) {
-            LOG.trace("Terminating channel to the remote gRPC server");
+            LOG.debug("Terminating channel to the remote gRPC server");
             channel.shutdown().shutdownNow();
             channel = null;
             grpcStub = null;
