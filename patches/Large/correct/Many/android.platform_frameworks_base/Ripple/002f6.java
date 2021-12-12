diff --git a/graphics/java/android/graphics/drawable/Ripple.java b/graphics/java/android/graphics/drawable/Ripple.java
index 3446000..218a057 100644
--- a/graphics/java/android/graphics/drawable/Ripple.java
+++ b/graphics/java/android/graphics/drawable/Ripple.java
@@ -299,7 +299,7 @@
      */
     public void cancel() {
         if (mInner != null) {
-            mInner.end();
+            mInner.cancel();
         }
 
         if (mOuter != null) {
@@ -307,7 +307,7 @@
         }
 
         if (mAlpha != null) {
-            mAlpha.end();
+            mAlpha.cancel();
         }
     }
 
