diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/config/ZWaveConfiguration.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/config/ZWaveConfiguration.java
index 75c4b8b..9a689ac 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/config/ZWaveConfiguration.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/config/ZWaveConfiguration.java
@@ -384,7 +384,7 @@
                     records.add(record);
                 }
 
-                if ((ZWaveConfigurationCommandClass) node.getCommandClass(CommandClass.ASSOCIATION) != null) {
+                if ((ZWaveAssociationCommandClass) node.getCommandClass(CommandClass.ASSOCIATION) != null) {
                     record = new OpenHABConfigurationRecord(domain + "associations/", "Association Groups");
                     record.addAction("Refresh", "Refresh");
                     records.add(record);
