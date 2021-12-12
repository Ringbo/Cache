diff --git a/pinot-transport/src/main/java/com/linkedin/pinot/routing/HelixExternalViewBasedRouting.java b/pinot-transport/src/main/java/com/linkedin/pinot/routing/HelixExternalViewBasedRouting.java
index 03ef9c5..8352703 100644
--- a/pinot-transport/src/main/java/com/linkedin/pinot/routing/HelixExternalViewBasedRouting.java
+++ b/pinot-transport/src/main/java/com/linkedin/pinot/routing/HelixExternalViewBasedRouting.java
@@ -116,7 +116,7 @@
     int externalViewRecordVersion = externalView.getRecord().getVersion();
     if (_routingTableLastKnownZkVersionMap.containsKey(tableName)) {
       long lastKnownZkVersion = _routingTableLastKnownZkVersionMap.get(tableName);
-      if (externalViewRecordVersion <= lastKnownZkVersion) {
+      if (externalViewRecordVersion == lastKnownZkVersion) {
         LOGGER.info(
             "No change on routing table version (current version {}, last known version {}), do nothing for table {}",
             externalViewRecordVersion, lastKnownZkVersion, tableName);
