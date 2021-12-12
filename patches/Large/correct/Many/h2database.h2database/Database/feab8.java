diff --git a/h2/src/main/org/h2/engine/Database.java b/h2/src/main/org/h2/engine/Database.java
index 37bcf72..13df48d 100644
--- a/h2/src/main/org/h2/engine/Database.java
+++ b/h2/src/main/org/h2/engine/Database.java
@@ -1440,7 +1440,7 @@
             }
         }
         reconnectModified(false);
-        if (mvStore != null) {
+        if (mvStore != null && !mvStore.getStore().isClosed()) {
             long maxCompactTime = dbSettings.maxCompactTime;
             if (compactMode == CommandInterface.SHUTDOWN_COMPACT) {
                 mvStore.compactFile(dbSettings.maxCompactTime);
