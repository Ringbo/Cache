diff --git a/common/buildcraft/core/fluids/TankManager.java b/common/buildcraft/core/fluids/TankManager.java
index 25633d1..0b14f07 100644
--- a/common/buildcraft/core/fluids/TankManager.java
+++ b/common/buildcraft/core/fluids/TankManager.java
@@ -112,7 +112,7 @@
 	public void writeData(DataOutputStream data) throws IOException {
 		for (Tank tank : tanks) {
 			FluidStack fluidStack = tank.getFluid();
-			if (fluidStack != null) {
+			if (fluidStack != null && fluidStack.getFluid() != null) {
 				data.writeShort(fluidStack.getFluid().getID());
 				data.writeInt(fluidStack.amount);
 			} else {
