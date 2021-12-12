diff --git a/datavec-data/datavec-data-image/src/main/java/org/datavec/image/loader/ImageLoader.java b/datavec-data/datavec-data-image/src/main/java/org/datavec/image/loader/ImageLoader.java
index 1d97bb7..67f56ba 100644
--- a/datavec-data/datavec-data-image/src/main/java/org/datavec/image/loader/ImageLoader.java
+++ b/datavec-data/datavec-data-image/src/main/java/org/datavec/image/loader/ImageLoader.java
@@ -266,7 +266,7 @@
 
             for (int i = 0; i < h; i++) {
                 for (int j = 0; j < w; j++) {
-                    ret.putScalar(new int[]{i, j}, image.getRGB(i, j));
+                    ret.putScalar(new int[]{i, j}, image.getRGB(j, i));
                 }
             }
             return ret;
