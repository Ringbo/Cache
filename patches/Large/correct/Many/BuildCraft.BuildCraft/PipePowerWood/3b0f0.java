diff --git a/common/buildcraft/transport/pipes/PipePowerWood.java b/common/buildcraft/transport/pipes/PipePowerWood.java
index 2603866..71f62c2 100644
--- a/common/buildcraft/transport/pipes/PipePowerWood.java
+++ b/common/buildcraft/transport/pipes/PipePowerWood.java
@@ -199,7 +199,7 @@
 	@Override
 	public int receiveEnergy(ForgeDirection from, int maxReceive,
 			boolean simulate) {
-		if (from.ordinal() < 6 && container.getNeighborTile(from) instanceof IRedstoneEngineReceiver) {
+		if (from.ordinal() < 6 && container.getNeighborTile(from) instanceof IRedstoneEngine) {
 			allowExtraction = true;
 			return maxReceive;
 		}
