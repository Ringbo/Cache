diff --git a/common/buildcraft/factory/TilePump.java b/common/buildcraft/factory/TilePump.java
index cff18ca..e6a7e9f 100644
--- a/common/buildcraft/factory/TilePump.java
+++ b/common/buildcraft/factory/TilePump.java
@@ -339,13 +339,13 @@
 	public void handleUpdatePacket(PacketUpdate packet) {
 		PacketPayloadArrays payload = (PacketPayloadArrays)packet.payload;
 		if (payload.intPayload[0] > 0) {
-			FluidStack liquid = new FluidStack(FluidRegistry.getFluid(payload.intPayload[0]), payload.intPayload[2]);
+			FluidStack liquid = new FluidStack(FluidRegistry.getFluid(payload.intPayload[0]), payload.intPayload[1]);
 			tank.setFluid(liquid);
 		} else {
 			tank.setFluid(null);
 		}
 
-		aimY = payload.intPayload[3];
+		aimY = payload.intPayload[2];
 		tubeY = payload.floatPayload[0];
 
 		setTubePosition();
