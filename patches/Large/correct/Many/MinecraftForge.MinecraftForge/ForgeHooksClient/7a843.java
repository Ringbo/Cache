diff --git a/src/main/java/net/minecraftforge/client/ForgeHooksClient.java b/src/main/java/net/minecraftforge/client/ForgeHooksClient.java
index 166a4b9..14c1a01 100644
--- a/src/main/java/net/minecraftforge/client/ForgeHooksClient.java
+++ b/src/main/java/net/minecraftforge/client/ForgeHooksClient.java
@@ -288,7 +288,7 @@
         int multiplier = (r / divider & 255) << 16 | (g / divider & 255) << 8 | b / divider & 255;
 
         skyX = center.getX();
-        skyZ = center.getY();
+        skyZ = center.getZ();
         skyRGBMultiplier = multiplier;
         return skyRGBMultiplier;
     }
