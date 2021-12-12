diff --git a/application/src/main/java/org/thingsboard/server/actors/device/DeviceActorMessageProcessor.java b/application/src/main/java/org/thingsboard/server/actors/device/DeviceActorMessageProcessor.java
index 85b3285..9527171 100644
--- a/application/src/main/java/org/thingsboard/server/actors/device/DeviceActorMessageProcessor.java
+++ b/application/src/main/java/org/thingsboard/server/actors/device/DeviceActorMessageProcessor.java
@@ -294,7 +294,7 @@
     private void handleGetAttributesRequest(DeviceToDeviceActorMsg src) {
         GetAttributesRequest request = (GetAttributesRequest) src.getPayload();
         ListenableFuture<List<AttributeKvEntry>> clientAttributesFuture = getAttributeKvEntries(deviceId, DataConstants.CLIENT_SCOPE, request.getClientAttributeNames());
-        ListenableFuture<List<AttributeKvEntry>> sharedAttributesFuture = getAttributeKvEntries(deviceId, DataConstants.SHARED_SCOPE, request.getClientAttributeNames());
+        ListenableFuture<List<AttributeKvEntry>> sharedAttributesFuture = getAttributeKvEntries(deviceId, DataConstants.SHARED_SCOPE, request.getSharedAttributeNames());
 
         Futures.addCallback(Futures.allAsList(Arrays.asList(clientAttributesFuture, sharedAttributesFuture)), new FutureCallback<List<List<AttributeKvEntry>>>() {
             @Override
