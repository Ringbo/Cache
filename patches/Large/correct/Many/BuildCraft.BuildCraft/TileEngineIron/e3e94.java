diff --git a/common/buildcraft/energy/TileEngineIron.java b/common/buildcraft/energy/TileEngineIron.java
index b5309fc..a591564 100644
--- a/common/buildcraft/energy/TileEngineIron.java
+++ b/common/buildcraft/energy/TileEngineIron.java
@@ -117,7 +117,7 @@
 	@Override
 	public void burn() {
 		FluidStack fuel = this.fuelTank.getFluid();
-		if (currentFuel == null) {
+		if (currentFuel == null && fuel != null) {
 			currentFuel = IronEngineFuel.getFuelForFluid(fuel.getFluid());
 		}
 
