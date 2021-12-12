diff --git a/android/core/src/processing/android/core/GLModel.java b/android/core/src/processing/android/core/GLModel.java
index d8ecce1..db5bdb1 100644
--- a/android/core/src/processing/android/core/GLModel.java
+++ b/android/core/src/processing/android/core/GLModel.java
@@ -217,7 +217,7 @@
       throw new RuntimeException("GLModel: call beginUpdate()");
     }
     
-    if (lastUpdateIdx < firstUpdateIdx) return;  
+    if (updateElement != GROUPS && lastUpdateIdx < firstUpdateIdx) return;  
     
     if (updateElement == VERTICES) {
       if (updateVertexArray == null) {
