diff --git a/bundles/binding/org.openhab.binding.tellstick/src/main/java/org/openhab/binding/tellstick/internal/TellstickController.java b/bundles/binding/org.openhab.binding.tellstick/src/main/java/org/openhab/binding/tellstick/internal/TellstickController.java
index efd8bd2..3735aaf 100644
--- a/bundles/binding/org.openhab.binding.tellstick/src/main/java/org/openhab/binding/tellstick/internal/TellstickController.java
+++ b/bundles/binding/org.openhab.binding.tellstick/src/main/java/org/openhab/binding/tellstick/internal/TellstickController.java
@@ -72,14 +72,14 @@
 		if (strValue != null) {
 			 value = Double.valueOf(strValue);
 		}
-		int precent = (int) Math.round((value / 255) * 100);
+		int percent = (int) Math.round((value / 255) * 100);
 		if (IncreaseDecreaseType.INCREASE == increaseDecreaseType) {			
-			precent = Math.min(precent + 10, 100);			
+			percent = Math.min(percent + 10, 100);			
 		} else if (IncreaseDecreaseType.DECREASE == increaseDecreaseType) {
-			precent = Math.max(precent - 10, 0);				
+			percent = Math.max(percent - 10, 0);				
 		}
 		
-		dim(dev, new PercentType(precent));
+		dim(dev, new PercentType(percent));
 	}
 
 	private void dim(TellstickDevice dev, PercentType command) throws TellstickException {
