diff --git a/android/core/src/processing/core/PGraphicsAndroid3D.java b/android/core/src/processing/core/PGraphicsAndroid3D.java
index 949fb64..dcd6dea 100644
--- a/android/core/src/processing/core/PGraphicsAndroid3D.java
+++ b/android/core/src/processing/core/PGraphicsAndroid3D.java
@@ -5677,11 +5677,13 @@
       this.setCache(a3d, texture);
       this.setParams(a3d, params);
       
+      // The texture crop should also take into account
+      // the Y inversion, this is why using hight and -height.
       texCrop = new int[4];
       texCrop[0] = 0;
-      texCrop[1] = 0;
+      texCrop[1] = height;
       texCrop[2] = width;
-      texCrop[3] = height;     
+      texCrop[3] = -height;     
     }
   }  
   
