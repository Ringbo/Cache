diff --git a/rajawali/src/main/java/org/rajawali3d/Geometry3D.java b/rajawali/src/main/java/org/rajawali3d/Geometry3D.java
index 5be7b8b..d5bfde9 100644
--- a/rajawali/src/main/java/org/rajawali3d/Geometry3D.java
+++ b/rajawali/src/main/java/org/rajawali3d/Geometry3D.java
@@ -310,7 +310,7 @@
         if(mVerticesArray != null) {
             index_offset = (mVerticesArray.length / 3);
         }
-        if(addIndies != null) {
+        if (addIndices != null) {
             for (int i = 0, j = addIndices.length; i < j; ++i) {
                 addIndices[i] += index_offset;
             }
