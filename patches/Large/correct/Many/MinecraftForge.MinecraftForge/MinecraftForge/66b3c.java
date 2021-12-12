diff --git a/forge/forge_common/net/minecraft/src/forge/MinecraftForge.java b/forge/forge_common/net/minecraft/src/forge/MinecraftForge.java
index 3dfc3fc..c9586f1 100755
--- a/forge/forge_common/net/minecraft/src/forge/MinecraftForge.java
+++ b/forge/forge_common/net/minecraft/src/forge/MinecraftForge.java
@@ -891,7 +891,7 @@
         {
             if (entry.getKey().isInstance(entity))
             {
-                if (!checkSupers || entry.getKey() == entry.getClass())
+                if (!checkSupers || entry.getKey() == entity.getClass())
                 {
                     return entry.getValue();
                 }
