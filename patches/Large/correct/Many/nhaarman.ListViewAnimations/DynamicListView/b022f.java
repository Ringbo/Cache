diff --git a/library/src/com/nhaarman/listviewanimations/widget/DynamicListView.java b/library/src/com/nhaarman/listviewanimations/widget/DynamicListView.java
index 151d9b9..b7a5647 100644
--- a/library/src/com/nhaarman/listviewanimations/widget/DynamicListView.java
+++ b/library/src/com/nhaarman/listviewanimations/widget/DynamicListView.java
@@ -483,7 +483,7 @@
                 return;
             }
 
-            if (getPositionForView(switchView) < getHeaderViewsCount()) {
+            if (getPositionForView(switchView) < getHeaderViewsCount() || getPositionForView(switchView) >= (getAdapter().getCount() - getHeaderViewsCount() - getFooterViewsCount())) {
                 return;
             }
             swapElements(originalItem, getPositionForView(switchView));
