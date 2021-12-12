diff --git a/bundles/binding/org.openhab.binding.withings/src/main/java/org/openhab/binding/withings/internal/WithingsGenericBindingProvider.java b/bundles/binding/org.openhab.binding.withings/src/main/java/org/openhab/binding/withings/internal/WithingsGenericBindingProvider.java
index b3992ff..1fd65b3 100644
--- a/bundles/binding/org.openhab.binding.withings/src/main/java/org/openhab/binding/withings/internal/WithingsGenericBindingProvider.java
+++ b/bundles/binding/org.openhab.binding.withings/src/main/java/org/openhab/binding/withings/internal/WithingsGenericBindingProvider.java
@@ -47,7 +47,7 @@
 		MeasureType measureType = null;
 		
 		if (configElements.length == 1) {
-			measureType = MeasureType.valueOf(configElements[1].toUpperCase());
+			measureType = MeasureType.valueOf(configElements[0].toUpperCase());
 		}
 		else if (configElements.length == 2) {
 			accountId = configElements[0];
