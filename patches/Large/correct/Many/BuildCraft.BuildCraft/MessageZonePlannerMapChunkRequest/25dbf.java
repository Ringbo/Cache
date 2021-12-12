diff --git a/common/buildcraft/robotics/MessageZonePlannerMapChunkRequest.java b/common/buildcraft/robotics/MessageZonePlannerMapChunkRequest.java
index c330755..471e21f 100644
--- a/common/buildcraft/robotics/MessageZonePlannerMapChunkRequest.java
+++ b/common/buildcraft/robotics/MessageZonePlannerMapChunkRequest.java
@@ -34,7 +34,7 @@
         @Override
         public IMessage onMessage(MessageZonePlannerMapChunkRequest message, MessageContext ctx) {
             ctx.getServerHandler().playerEntity.mcServer.addScheduledTask(() -> {
-                ZonePlannerMapDataServer.instance.loadChunk(ctx.getServerHandler().playerEntity.worldObj, message.chunkX, message.chunkZ, zonePlannerMapChunk -> {
+                ZonePlannerMapDataServer.instance.getChunk(ctx.getServerHandler().playerEntity.worldObj, message.chunkX, message.chunkZ, zonePlannerMapChunk -> {
                     BCMessageHandler.netWrapper.sendTo(new MessageZonePlannerMapChunkResponse(message.chunkX, message.chunkZ, zonePlannerMapChunk), ctx.getServerHandler().playerEntity);
                 });
             });
