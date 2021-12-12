diff --git a/common/buildcraft/transport/PipeTransportFluids.java b/common/buildcraft/transport/PipeTransportFluids.java
index 3604b62..df799ba 100644
--- a/common/buildcraft/transport/PipeTransportFluids.java
+++ b/common/buildcraft/transport/PipeTransportFluids.java
@@ -469,7 +469,7 @@
 	public void sendDescriptionPacket() {
 		super.sendDescriptionPacket();
 
-		initClient = 60;
+		initClient = 6;
 	}
 
 	public FluidStack getStack(ForgeDirection direction) {
