diff --git a/common/net/minecraft/src/buildcraft/transport/PipeTransportSolids.java b/common/net/minecraft/src/buildcraft/transport/PipeTransportSolids.java
index 740fa5e..3b4521b 100644
--- a/common/net/minecraft/src/buildcraft/transport/PipeTransportSolids.java
+++ b/common/net/minecraft/src/buildcraft/transport/PipeTransportSolids.java
@@ -84,9 +84,8 @@
 
 		if (APIProxy.isServerSide())
 			if (item.synchroTracker.markTimeIfDelay(worldObj, 6 * BuildCraftCore.updateFactor))
-				CoreProxy.sendToPlayers(createItemPacket(item, orientation),
-						xCoord, yCoord, zCoord, 50,
-						mod_BuildCraftTransport.instance);
+				CoreProxy.sendToPlayers(createItemPacket(item, orientation), container.worldObj, 
+						xCoord, yCoord, zCoord, 50, mod_BuildCraftTransport.instance);
 
 		if (travelingEntities.size() > BuildCraftTransport.groupItemsTrigger) {
 			groupEntities();
