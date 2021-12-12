diff --git a/bundles/binding/org.openhab.binding.milight/src/main/java/org/openhab/binding/milight/internal/MilightBinding.java b/bundles/binding/org.openhab.binding.milight/src/main/java/org/openhab/binding/milight/internal/MilightBinding.java
index 0758542..b3938ed 100644
--- a/bundles/binding/org.openhab.binding.milight/src/main/java/org/openhab/binding/milight/internal/MilightBinding.java
+++ b/bundles/binding/org.openhab.binding.milight/src/main/java/org/openhab/binding/milight/internal/MilightBinding.java
@@ -178,8 +178,7 @@
                     } else {
                         sendColor(command, bridgeId, bulb);
                     }
-                }
-                if (command instanceof PercentType) {
+                } else if (command instanceof PercentType) {
                     sendPercent(bulb, rgbwSteps, bridgeId, (PercentType) command, BindingType.brightness);
                 }
             }
@@ -219,7 +218,7 @@
                         command.toString(), repeatCount);
                 if (command.compareTo(oldPercent) > 0) {
                     for (int i = 0; i < repeatCount; i++) {
-                        Thread.sleep(50);
+                        Thread.sleep(100);
                         if (BindingType.brightness.equals(type)) {
                             sendIncrease(bulb, rgbwSteps, bridgeId);
                         } else if (BindingType.colorTemperature.equals(type)) {
@@ -228,7 +227,7 @@
                     }
                 } else if (command.compareTo(oldPercent) < 0) {
                     for (int i = 0; i < repeatCount; i++) {
-                        Thread.sleep(50);
+                        Thread.sleep(100);
                         if (BindingType.brightness.equals(type)) {
                             sendDecrease(bulb, rgbwSteps, bridgeId);
                         } else if (BindingType.colorTemperature.equals(type)) {
@@ -716,7 +715,7 @@
             for (int i = 0; i < 10; i++) {
                 sendDecrease(bulb, 27, bridgeId);
                 try {
-                    Thread.sleep(50);
+                    Thread.sleep(100);
                 } catch (InterruptedException e) {
                 }
             }
@@ -739,7 +738,7 @@
             }
             if (bulb > 5) {
                 sendOn(bulb, bridgeId);
-                Thread.sleep(50);
+                Thread.sleep(100);
                 String messageBytes = "40:" + Integer.toHexString(milightColorNo) + ":55";
                 sendMessage(messageBytes, bridgeId);
             }
