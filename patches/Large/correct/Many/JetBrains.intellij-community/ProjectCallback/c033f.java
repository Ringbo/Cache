diff --git a/plugins/android/src/org/jetbrains/android/uipreview/ProjectCallback.java b/plugins/android/src/org/jetbrains/android/uipreview/ProjectCallback.java
index 230e018..7ce87cc 100644
--- a/plugins/android/src/org/jetbrains/android/uipreview/ProjectCallback.java
+++ b/plugins/android/src/org/jetbrains/android/uipreview/ProjectCallback.java
@@ -252,7 +252,7 @@
       int first = fqcn.indexOf('.');
       first = fqcn.indexOf('.', first + 1);
       int last = fqcn.lastIndexOf('.');
-      if (last > first) {
+      if (last > first && first >= 0) {
         return fqcn.substring(0, first) + ".." + fqcn.substring(last);
       }
     }
