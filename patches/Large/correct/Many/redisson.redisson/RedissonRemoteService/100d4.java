diff --git a/src/main/java/org/redisson/RedissonRemoteService.java b/src/main/java/org/redisson/RedissonRemoteService.java
index ba99b01..d424128 100644
--- a/src/main/java/org/redisson/RedissonRemoteService.java
+++ b/src/main/java/org/redisson/RedissonRemoteService.java
@@ -95,15 +95,15 @@
                 }
                 subscribe(remoteInterface, requestQueue);
                 
-                RemoteServiceRequest request = future.getNow();
+                final RemoteServiceRequest request = future.getNow();
                 if (System.currentTimeMillis() - request.getDate() > request.getAckTimeout()) {
                     log.debug("request: {} has been skipped due to ackTimeout");
                     return;
                 }
                 
-                RemoteServiceMethod method = beans.get(new RemoteServiceKey(remoteInterface, request.getMethodName()));
+                final RemoteServiceMethod method = beans.get(new RemoteServiceKey(remoteInterface, request.getMethodName()));
                 String responseName = "redisson_remote_service:{" + remoteInterface.getName() + "}:" + request.getRequestId();
-                RTopic<RRemoteServiceResponse> topic = redisson.getTopic(responseName);
+                final RTopic<RRemoteServiceResponse> topic = redisson.getTopic(responseName);
                 Future<Long> ackClientsFuture = topic.publishAsync(new RemoteServiceAck());
                 ackClientsFuture.addListener(new FutureListener<Long>() {
                     @Override
@@ -125,7 +125,7 @@
         });
     }
 
-    private void invokeMethod(RemoteServiceRequest request, RemoteServiceMethod method,
+    private void invokeMethod(final RemoteServiceRequest request, RemoteServiceMethod method,
             RTopic<RRemoteServiceResponse> topic) {
         final AtomicReference<RemoteServiceResponse> responseHolder = new AtomicReference<RemoteServiceResponse>();
         try {
