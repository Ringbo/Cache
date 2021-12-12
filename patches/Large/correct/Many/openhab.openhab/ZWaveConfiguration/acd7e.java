diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/config/ZWaveConfiguration.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/config/ZWaveConfiguration.java
index 9a689ac..7eba696 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/config/ZWaveConfiguration.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/config/ZWaveConfiguration.java
@@ -390,7 +390,7 @@
                     records.add(record);
                 }
 
-                if ((ZWaveConfigurationCommandClass) node.getCommandClass(CommandClass.WAKE_UP) != null) {
+                if ((ZWaveWakeUpCommandClass) node.getCommandClass(CommandClass.WAKE_UP) != null) {
                     record = new OpenHABConfigurationRecord(domain + "wakeup/", "Wakeup Period");
                     record.addAction("Refresh", "Refresh");
                     records.add(record);
