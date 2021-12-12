diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/ZWaveActiveBinding.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/ZWaveActiveBinding.java
index d67d23b..a00aad4 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/ZWaveActiveBinding.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/ZWaveActiveBinding.java
@@ -111,7 +111,7 @@
 		if (zProvider != null) {
 			ZWaveBindingConfig bindingConfig = zProvider.getZwaveBindingConfig(itemName);
 			
-			if (bindingConfig != null) {
+			if (bindingConfig != null && converterHandler != null) {
 					converterHandler.executeRefresh(zProvider, itemName, true);
 			}
 		}
