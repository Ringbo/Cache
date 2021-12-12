diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 3d7d805..058e163 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -4661,13 +4661,13 @@
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
