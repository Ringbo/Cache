diff --git a/common/buildcraft/robotics/client/render/RenderZonePlanner.java b/common/buildcraft/robotics/client/render/RenderZonePlanner.java
index cebb780..e15924a 100644
--- a/common/buildcraft/robotics/client/render/RenderZonePlanner.java
+++ b/common/buildcraft/robotics/client/render/RenderZonePlanner.java
@@ -97,7 +97,7 @@
                 for(int textureY = 0; textureY < textureHeight; textureY++) {
                     int posX = -1;
                     int posZ = -1;
-                    int scale = 1;
+                    int scale = 4;
                     int offset1 = (textureX - textureWidth / 2) * scale;
                     int offset2 = (textureY - textureHeight / 2) * scale;
                     switch(side) {
