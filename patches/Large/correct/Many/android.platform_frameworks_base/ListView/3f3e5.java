diff --git a/core/java/android/widget/ListView.java b/core/java/android/widget/ListView.java
index 51a1ef2..912dd5e 100644
--- a/core/java/android/widget/ListView.java
+++ b/core/java/android/widget/ListView.java
@@ -138,7 +138,7 @@
 
     // the single allocated result per list view; kinda cheesey but avoids
     // allocating these thingies too often.
-    private ArrowScrollFocusResult mArrowScrollFocusResult = new ArrowScrollFocusResult();
+    private final ArrowScrollFocusResult mArrowScrollFocusResult = new ArrowScrollFocusResult();
 
     public ListView(Context context) {
         this(context, null);
@@ -1040,7 +1040,8 @@
             childWidth = child.getMeasuredWidth();
             childHeight = child.getMeasuredHeight();
 
-            if (recycleOnMeasure()) {
+            if (recycleOnMeasure() && mRecycler.shouldRecycleViewType(
+                    ((LayoutParams) child.getLayoutParams()).viewType)) {
                 mRecycler.addScrapView(child);
             }
         }
@@ -1155,7 +1156,8 @@
             }
 
             // Recycle the view before we possibly return from the method
-            if (recyle) {
+            if (recyle && recycleBin.shouldRecycleViewType(
+                    ((LayoutParams) child.getLayoutParams()).viewType)) {
                 recycleBin.addScrapView(child);
             }
 
