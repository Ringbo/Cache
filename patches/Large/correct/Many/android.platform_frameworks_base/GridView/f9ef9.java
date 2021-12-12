diff --git a/core/java/android/widget/GridView.java b/core/java/android/widget/GridView.java
index ee73092..1321221 100644
--- a/core/java/android/widget/GridView.java
+++ b/core/java/android/widget/GridView.java
@@ -2404,7 +2404,7 @@
         }
 
         final LayoutParams lp = (LayoutParams) view.getLayoutParams();
-        final boolean isHeading = lp != null && lp.viewType != ITEM_VIEW_TYPE_HEADER_OR_FOOTER;
+        final boolean isHeading = lp != null && lp.viewType == ITEM_VIEW_TYPE_HEADER_OR_FOOTER;
         final boolean isSelected = isItemChecked(position);
         final CollectionItemInfo itemInfo = CollectionItemInfo.obtain(
                 row, 1, column, 1, isHeading, isSelected);
