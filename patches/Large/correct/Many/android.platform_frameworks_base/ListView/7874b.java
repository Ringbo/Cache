diff --git a/core/java/android/widget/ListView.java b/core/java/android/widget/ListView.java
index a11897d..5b4a368 100644
--- a/core/java/android/widget/ListView.java
+++ b/core/java/android/widget/ListView.java
@@ -3930,7 +3930,7 @@
         super.onInitializeAccessibilityNodeInfoForItem(view, position, info);
 
         final LayoutParams lp = (LayoutParams) view.getLayoutParams();
-        final boolean isHeading = lp != null && lp.viewType != ITEM_VIEW_TYPE_HEADER_OR_FOOTER;
+        final boolean isHeading = lp != null && lp.viewType == ITEM_VIEW_TYPE_HEADER_OR_FOOTER;
         final boolean isSelected = isItemChecked(position);
         final CollectionItemInfo itemInfo = CollectionItemInfo.obtain(
                 position, 1, 0, 1, isHeading, isSelected);
