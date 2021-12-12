diff --git a/common/buildcraft/factory/client/render/RenderPump.java b/common/buildcraft/factory/client/render/RenderPump.java
index 4af71a4..5015c45 100644
--- a/common/buildcraft/factory/client/render/RenderPump.java
+++ b/common/buildcraft/factory/client/render/RenderPump.java
@@ -80,7 +80,7 @@
         }
 
         SpriteHolder spriteTubeMiddle = SpriteHolderRegistry.getHolder("buildcraftfactory:blocks/pump/tube");
-        LaserRow cap = new LaserRow(spriteTubeMiddle, 0, 8, 8, 8);
+        LaserRow cap = new LaserRow(spriteTubeMiddle, 0, 8, 8, 16);
         LaserRow middle = new LaserRow(spriteTubeMiddle, 0, 0, 16, 8);
 
         LaserRow[] middles = { middle };
