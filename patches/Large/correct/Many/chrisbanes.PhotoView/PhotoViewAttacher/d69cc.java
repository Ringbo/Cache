diff --git a/photoview/src/main/java/com/github/chrisbanes/photoview/PhotoViewAttacher.java b/photoview/src/main/java/com/github/chrisbanes/photoview/PhotoViewAttacher.java
index 0972646..67042c1 100644
--- a/photoview/src/main/java/com/github/chrisbanes/photoview/PhotoViewAttacher.java
+++ b/photoview/src/main/java/com/github/chrisbanes/photoview/PhotoViewAttacher.java
@@ -181,7 +181,7 @@
                     }
 
                     if (e1.getPointerCount() > SINGLE_TOUCH
-                            || e1.getPointerCount() > SINGLE_TOUCH) {
+                            || e2.getPointerCount() > SINGLE_TOUCH) {
                         return false;
                     }
 
