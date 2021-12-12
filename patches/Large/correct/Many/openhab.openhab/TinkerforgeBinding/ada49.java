diff --git a/bundles/binding/org.openhab.binding.tinkerforge/src/main/java/org/openhab/binding/tinkerforge/internal/TinkerforgeBinding.java b/bundles/binding/org.openhab.binding.tinkerforge/src/main/java/org/openhab/binding/tinkerforge/internal/TinkerforgeBinding.java
index ebc6d24..fae1592 100644
--- a/bundles/binding/org.openhab.binding.tinkerforge/src/main/java/org/openhab/binding/tinkerforge/internal/TinkerforgeBinding.java
+++ b/bundles/binding/org.openhab.binding.tinkerforge/src/main/java/org/openhab/binding/tinkerforge/internal/TinkerforgeBinding.java
@@ -606,7 +606,7 @@
         } else if (itemType.isAssignableFrom(SwitchItem.class)) {
           value = sensorValue == HighLowValue.HIGH ? OnOffType.ON : OnOffType.OFF;
         } else {
-          logger.error("{} unsupported item type {} for item {}", LoggerConstants.TFMODELUPDATE,
+          logger.trace("{} unsupported item type {} for item {}", LoggerConstants.TFMODELUPDATE,
               provider.getItem(itemName), itemName);
         }
       } else if (sensorValue instanceof OnOffValue) {
@@ -619,7 +619,7 @@
         } else if (itemType.isAssignableFrom(SwitchItem.class)) {
           value = sensorValue == OnOffValue.ON ? OnOffType.ON : OnOffType.OFF;
         } else {
-          logger.error("{} unsupported item type {} for item {}", LoggerConstants.TFMODELUPDATE,
+          logger.trace("{} unsupported item type {} for item {}", LoggerConstants.TFMODELUPDATE,
               provider.getItem(itemName), itemName);
         }
       } else if (sensorValue == UnDefValue.UNDEF || sensorValue == null) {
