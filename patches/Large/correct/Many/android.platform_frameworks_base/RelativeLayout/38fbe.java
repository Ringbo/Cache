diff --git a/core/java/android/widget/RelativeLayout.java b/core/java/android/widget/RelativeLayout.java
index 5f46d89..6d40180 100644
--- a/core/java/android/widget/RelativeLayout.java
+++ b/core/java/android/widget/RelativeLayout.java
@@ -741,7 +741,7 @@
 
         final int layoutDirection = getLayoutDirection();
         int[] rules = params.getRules(layoutDirection);
-        params.onResolveLayoutDirection(layoutDirection);
+        params.resolveLayoutDirection(layoutDirection);
 
         if (params.mLeft < 0 && params.mRight >= 0) {
             // Right is fixed, but left varies
@@ -995,7 +995,7 @@
             if (child.getVisibility() != GONE) {
                 RelativeLayout.LayoutParams st =
                         (RelativeLayout.LayoutParams) child.getLayoutParams();
-                st.onResolveLayoutDirection(getLayoutDirection());
+                st.resolveLayoutDirection(getLayoutDirection());
                 child.layout(st.mLeft, st.mTop, st.mRight, st.mBottom);
             }
         }
@@ -1405,7 +1405,7 @@
         }
 
         @Override
-        public void onResolveLayoutDirection(int layoutDirection) {
+        public void resolveLayoutDirection(int layoutDirection) {
             final boolean isLayoutRtl = isLayoutRtl();
             if (isLayoutRtl) {
                 if (mStart != DEFAULT_RELATIVE) mRight = mStart;
@@ -1419,7 +1419,7 @@
                 resolveRules(layoutDirection);
             }
             // This will set the layout direction
-            super.onResolveLayoutDirection(layoutDirection);
+            super.resolveLayoutDirection(layoutDirection);
         }
     }
 
