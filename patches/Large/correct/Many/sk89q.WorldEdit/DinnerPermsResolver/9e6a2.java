diff --git a/src/main/java/com/sk89q/bukkit/migration/DinnerPermsResolver.java b/src/main/java/com/sk89q/bukkit/migration/DinnerPermsResolver.java
index 6ed5f32..4eefcd3 100644
--- a/src/main/java/com/sk89q/bukkit/migration/DinnerPermsResolver.java
+++ b/src/main/java/com/sk89q/bukkit/migration/DinnerPermsResolver.java
@@ -40,7 +40,7 @@
     }
 
     public boolean hasPermission(String name, String permission) {
-        Player player = server.getPlayer(name);
+        Player player = server.getPlayerExact(name);
         if (player == null) {
             return false; // Permissions are only registered for online players
         }
