diff --git a/library-core/src/main/java/com/mikepenz/iconics/animation/IconicsAnimationProcessor.java b/library-core/src/main/java/com/mikepenz/iconics/animation/IconicsAnimationProcessor.java
index 967b72d..ccc54f0 100644
--- a/library-core/src/main/java/com/mikepenz/iconics/animation/IconicsAnimationProcessor.java
+++ b/library-core/src/main/java/com/mikepenz/iconics/animation/IconicsAnimationProcessor.java
@@ -485,7 +485,7 @@
         mDrawable = null;
         onDrawableDetached();
 
-        if (mDrawable != null) {
+        if (drawable != null) {
             mDrawable = drawable;
             onDrawableAttached();
 
