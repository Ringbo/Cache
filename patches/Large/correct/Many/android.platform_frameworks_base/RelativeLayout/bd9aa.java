diff --git a/core/java/android/widget/RelativeLayout.java b/core/java/android/widget/RelativeLayout.java
index 12bb01c..e62dda5 100644
--- a/core/java/android/widget/RelativeLayout.java
+++ b/core/java/android/widget/RelativeLayout.java
@@ -558,9 +558,9 @@
                 myWidth);
         int childHeightMeasureSpec;
         if (params.width == LayoutParams.FILL_PARENT) {
-            childHeightMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.EXACTLY, myHeight);
+            childHeightMeasureSpec = MeasureSpec.makeMeasureSpec(myHeight, MeasureSpec.EXACTLY);
         } else {
-            childHeightMeasureSpec = MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED);
+            childHeightMeasureSpec = MeasureSpec.makeMeasureSpec(myHeight, MeasureSpec.AT_MOST);
         }
         child.measure(childWidthMeasureSpec, childHeightMeasureSpec);
     }
@@ -1403,7 +1403,9 @@
             /*
              * START POOL IMPLEMENTATION
              */
-            private static final int POOL_LIMIT = 12;
+            // The pool is static, so all nodes instances are shared across
+            // activities, that's why we give it a rather high limit
+            private static final int POOL_LIMIT = 100;
             private static final Pool<Node> sPool = Pools.synchronizedPool(
                     Pools.finitePool(new PoolableManager<Node>() {
                         public Node newInstance() {
