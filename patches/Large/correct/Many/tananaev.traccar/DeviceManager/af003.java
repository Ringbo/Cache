diff --git a/src/org/traccar/database/DeviceManager.java b/src/org/traccar/database/DeviceManager.java
index ba360f1..6637df9 100644
--- a/src/org/traccar/database/DeviceManager.java
+++ b/src/org/traccar/database/DeviceManager.java
@@ -306,7 +306,7 @@
             }
             for (Long cachedGroupId : groupsById.keySet()) {
                 if (!databaseGroupsIds.contains(cachedGroupId)) {
-                    devicesById.remove(cachedGroupId);
+                    groupsById.remove(cachedGroupId);
                 }
             }
             databaseGroupsIds.clear();
