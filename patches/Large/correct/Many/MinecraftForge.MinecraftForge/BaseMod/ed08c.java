diff --git a/fml/server/net/minecraft/src/BaseMod.java b/fml/server/net/minecraft/src/BaseMod.java
index 88b9a47..1d6d01b 100644
--- a/fml/server/net/minecraft/src/BaseMod.java
+++ b/fml/server/net/minecraft/src/BaseMod.java
@@ -39,7 +39,7 @@
         if (tick==TickType.WORLD && tickEnd) {
             return onTickInGame((MinecraftServer)minecraftInstance);
         } else {
-            return false;
+            return true;
         }
     }
 
