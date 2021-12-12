diff --git a/jme3-core/src/main/java/com/jme3/texture/pbr/CubeMapWrapper.java b/jme3-core/src/main/java/com/jme3/texture/pbr/CubeMapWrapper.java
index 5e7dcdd..3a07aff 100644
--- a/jme3-core/src/main/java/com/jme3/texture/pbr/CubeMapWrapper.java
+++ b/jme3-core/src/main/java/com/jme3/texture/pbr/CubeMapWrapper.java
@@ -76,7 +76,7 @@
             sizes = new int[1];
             sizes[0] = image.getWidth();
         }
-        raster = new DefaultImageRaster(image, 0);
+        raster = new DefaultImageRaster(image, 0,0 , false);
     }
 
     /**
