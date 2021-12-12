diff --git a/library/src/main/java/com/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration.java b/library/src/main/java/com/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration.java
index f4a067d..bf2c6de 100644
--- a/library/src/main/java/com/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration.java
+++ b/library/src/main/java/com/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration.java
@@ -84,7 +84,7 @@
         int childCount = mShowLastDivider ? parent.getChildCount() : parent.getChildCount() - 1;
         for (int i = 0; i < childCount; i++) {
             View child = parent.getChildAt(i);
-            int childPosition = parent.getChildAdapterPosition(child);
+            int childPosition = parent.getChildPosition(child);
             if (mVisibilityProvider.shouldHideDivider(childPosition, parent)) {
                 continue;
             }
@@ -114,7 +114,7 @@
 
     @Override
     public void getItemOffsets(Rect rect, View v, RecyclerView parent, RecyclerView.State state) {
-        int position = parent.getChildAdapterPosition(v);
+        int position = parent.getChildPosition(v);
         setItemOffsets(rect, position, parent);
     }
 
