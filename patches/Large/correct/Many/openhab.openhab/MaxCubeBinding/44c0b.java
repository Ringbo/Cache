diff --git a/bundles/binding/org.openhab.binding.maxcube/src/main/java/org/openhab/binding/maxcube/internal/MaxCubeBinding.java b/bundles/binding/org.openhab.binding.maxcube/src/main/java/org/openhab/binding/maxcube/internal/MaxCubeBinding.java
index 3d9a5df..2fc5529 100644
--- a/bundles/binding/org.openhab.binding.maxcube/src/main/java/org/openhab/binding/maxcube/internal/MaxCubeBinding.java
+++ b/bundles/binding/org.openhab.binding.maxcube/src/main/java/org/openhab/binding/maxcube/internal/MaxCubeBinding.java
@@ -261,7 +261,7 @@
 		for (MaxCubeBindingProvider provider : providers) {
 			serialNumber = provider.getSerialNumber(itemName);
 
-			if (serialNumber.equals(null))
+			if (!serialNumber.equals(null))
 				break;
 		}
 
