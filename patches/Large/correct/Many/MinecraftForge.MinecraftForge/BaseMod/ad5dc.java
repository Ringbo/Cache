diff --git a/fml/bukkit/net/minecraft/server/BaseMod.java b/fml/bukkit/net/minecraft/server/BaseMod.java
index c9fe2ae..19100cd 100644
--- a/fml/bukkit/net/minecraft/server/BaseMod.java
+++ b/fml/bukkit/net/minecraft/server/BaseMod.java
@@ -33,7 +33,7 @@
         if (tick==TickType.WORLD && tickEnd) {
             return onTickInGame((MinecraftServer)minecraftInstance);
         } else {
-            return false;
+            return true;
         }
     }
 
