diff --git a/lib-core-slh/src/main/java/com/nhaarman/listviewanimations/util/StickyListHeadersListViewWrapper.java b/lib-core-slh/src/main/java/com/nhaarman/listviewanimations/util/StickyListHeadersListViewWrapper.java
index e12ad6b..a450885 100644
--- a/lib-core-slh/src/main/java/com/nhaarman/listviewanimations/util/StickyListHeadersListViewWrapper.java
+++ b/lib-core-slh/src/main/java/com/nhaarman/listviewanimations/util/StickyListHeadersListViewWrapper.java
@@ -41,7 +41,7 @@
     @Nullable
     @Override
     public View getChildAt(final int index) {
-        return mListView.getChildAt(index);
+        return mListView.getListChildAt(index);
     }
 
     @Override
