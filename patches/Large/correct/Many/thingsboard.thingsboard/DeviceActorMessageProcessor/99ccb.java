diff --git a/application/src/main/java/org/thingsboard/server/actors/device/DeviceActorMessageProcessor.java b/application/src/main/java/org/thingsboard/server/actors/device/DeviceActorMessageProcessor.java
index 00af046..14ff096 100644
--- a/application/src/main/java/org/thingsboard/server/actors/device/DeviceActorMessageProcessor.java
+++ b/application/src/main/java/org/thingsboard/server/actors/device/DeviceActorMessageProcessor.java
@@ -164,7 +164,7 @@
         } else {
             logger.debug("[{}] No pending RPC messages for new async session [{}]", deviceId, sessionId);
         }
-        Set<UUID> sentOneWayIds = new HashSet<>();
+        Set<Integer> sentOneWayIds = new HashSet<>();
         if (type == SessionType.ASYNC) {
             rpcPendingMap.entrySet().forEach(processPendingRpc(context, sessionId, server, sentOneWayIds));
         } else {
@@ -174,12 +174,12 @@
         sentOneWayIds.forEach(rpcPendingMap::remove);
     }
 
-    private Consumer<Map.Entry<Integer, ToDeviceRpcRequestMetadata>> processPendingRpc(ActorContext context, SessionId sessionId, Optional<ServerAddress> server, Set<UUID> sentOneWayIds) {
+    private Consumer<Map.Entry<Integer, ToDeviceRpcRequestMetadata>> processPendingRpc(ActorContext context, SessionId sessionId, Optional<ServerAddress> server, Set<Integer> sentOneWayIds) {
         return entry -> {
             ToDeviceRpcRequest request = entry.getValue().getMsg().getMsg();
             ToDeviceRpcRequestBody body = request.getBody();
             if (request.isOneway()) {
-                sentOneWayIds.add(request.getId());
+                sentOneWayIds.add(entry.getKey());
                 ToPluginRpcResponseDeviceMsg responsePluginMsg = toPluginRpcResponseMsg(entry.getValue().getMsg(), (String) null);
                 context.parent().tell(responsePluginMsg, ActorRef.noSender());
             }
