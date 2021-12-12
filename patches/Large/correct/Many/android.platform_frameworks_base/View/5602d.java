diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 2befcce..9fa67ac 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -4676,13 +4676,13 @@
         }
 
         RectF position = mAttachInfo.mTmpTransformRect;
-        position.setEmpty();
+        position.set(0, 0, mRight - mLeft, mBottom - mTop);
 
         if (!hasIdentityMatrix()) {
             getMatrix().mapRect(position);
         }
 
-        position.offset(mLeft, mRight);
+        position.offset(mLeft, mTop);
 
         ViewParent parent = mParent;
         while (parent instanceof View) {
