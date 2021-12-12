diff --git a/bundles/binding/org.openhab.binding.milight/src/main/java/org/openhab/binding/milight/internal/MilightBinding.java b/bundles/binding/org.openhab.binding.milight/src/main/java/org/openhab/binding/milight/internal/MilightBinding.java
index d49d5a3..004c4e6 100644
--- a/bundles/binding/org.openhab.binding.milight/src/main/java/org/openhab/binding/milight/internal/MilightBinding.java
+++ b/bundles/binding/org.openhab.binding.milight/src/main/java/org/openhab/binding/milight/internal/MilightBinding.java
@@ -203,7 +203,7 @@
 			if (bulb < 6) {
 				if (command.compareTo(oldPercent) > 0) {
 					int repeatCount = (command.intValue() - oldPercent.intValue()) / 10;
-					for(int i = 0; i <= repeatCount; i++) {
+					for(int i = 0; i < repeatCount; i++) {
 						Thread.sleep(100);
 						if(BindingType.brightness.equals(type) && bulb < 6) {
 							sendIncrease(bulb, rgbwSteps, bridgeId);
@@ -218,7 +218,7 @@
 					}
 				} else if (command.compareTo(oldPercent) < 0) {
 					int repeatCount = (oldPercent.intValue() - command.intValue()) / 10;
-					for(int i = 0; i <= repeatCount; i++) {
+					for(int i = 0; i < repeatCount; i++) {
 						Thread.sleep(100);
 						if(BindingType.brightness.equals(type) && bulb < 6) {
 							sendDecrease(bulb, rgbwSteps, bridgeId);
