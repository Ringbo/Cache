diff --git a/src/main/java/com/sk89q/worldedit/bukkit/BukkitConfiguration.java b/src/main/java/com/sk89q/worldedit/bukkit/BukkitConfiguration.java
index 4376196..6b10681 100644
--- a/src/main/java/com/sk89q/worldedit/bukkit/BukkitConfiguration.java
+++ b/src/main/java/com/sk89q/worldedit/bukkit/BukkitConfiguration.java
@@ -82,7 +82,7 @@
 
         noOpPermissions = config.getBoolean("no-op-permissions", false);
         
-        LocalSession.MAX_HISTORY_SIZE = Math.max(0, config.getInt("history.size", 0));
+        LocalSession.MAX_HISTORY_SIZE = Math.max(0, config.getInt("history.size", 15));
         LocalSession.EXPIRATION_GRACE = config.getInt("history.expiration", 10) * 60 * 1000;
         
         String snapshotsDir = config.getString("snapshots.directory", "");
