diff --git a/lottie/src/main/java/com/airbnb/lottie/BaseStrokeContent.java b/lottie/src/main/java/com/airbnb/lottie/BaseStrokeContent.java
index 5a47590..b5d23e3 100644
--- a/lottie/src/main/java/com/airbnb/lottie/BaseStrokeContent.java
+++ b/lottie/src/main/java/com/airbnb/lottie/BaseStrokeContent.java
@@ -203,7 +203,7 @@
     for (int i = 0; i < pathGroups.size(); i++) {
       PathGroup pathGroup = pathGroups.get(i);
       for (int j = 0; j < pathGroup.paths.size(); j++) {
-        path.addPath(pathGroup.paths.get(i).getPath(), parentMatrix);
+        path.addPath(pathGroup.paths.get(j).getPath(), parentMatrix);
       }
     }
     path.computeBounds(rect, false);
