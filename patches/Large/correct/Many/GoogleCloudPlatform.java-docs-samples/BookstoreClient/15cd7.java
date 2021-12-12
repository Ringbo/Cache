diff --git a/endpoints/bookstore-grpc/client/src/main/java/com/google/endpoints/examples/bookstore/BookstoreClient.java b/endpoints/bookstore-grpc/client/src/main/java/com/google/endpoints/examples/bookstore/BookstoreClient.java
index cac08ce..1ff9cd7 100644
--- a/endpoints/bookstore-grpc/client/src/main/java/com/google/endpoints/examples/bookstore/BookstoreClient.java
+++ b/endpoints/bookstore-grpc/client/src/main/java/com/google/endpoints/examples/bookstore/BookstoreClient.java
@@ -156,14 +156,14 @@
     @Override
     public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(
         MethodDescriptor<ReqT,RespT> method, CallOptions callOptions, Channel next) {
-      logger.info("Intercepted " + method.getFullMethodName());
+      LOGGER.info("Intercepted " + method.getFullMethodName());
       ClientCall<ReqT, RespT> call = next.newCall(method, callOptions);
 
       call = new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(call) {
         @Override
         public void start(Listener<RespT> responseListener, Metadata headers) {
           if (apiKey != null && !apiKey.isEmpty()) {
-            logger.info("Attaching API Key: " + apiKey);
+            LOGGER.info("Attaching API Key: " + apiKey);
             headers.put(API_KEY_HEADER, apiKey);
           }
           if (authToken != null && !authToken.isEmpty()) {
