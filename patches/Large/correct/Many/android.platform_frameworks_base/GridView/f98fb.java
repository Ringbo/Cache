diff --git a/core/java/android/widget/GridView.java b/core/java/android/widget/GridView.java
index d263625..efd6fc0 100644
--- a/core/java/android/widget/GridView.java
+++ b/core/java/android/widget/GridView.java
@@ -2356,7 +2356,7 @@
         final int rowsCount = getCount() / columnsCount;
         final int selectionMode = getSelectionModeForAccessibility();
         final CollectionInfo collectionInfo = CollectionInfo.obtain(
-                columnsCount, rowsCount, false, selectionMode);
+                rowsCount, columnsCount, false, selectionMode);
         info.setCollectionInfo(collectionInfo);
     }
 
@@ -2385,7 +2385,7 @@
         final boolean isHeading = lp != null && lp.viewType != ITEM_VIEW_TYPE_HEADER_OR_FOOTER;
         final boolean isSelected = isItemChecked(position);
         final CollectionItemInfo itemInfo = CollectionItemInfo.obtain(
-                column, 1, row, 1, isHeading, isSelected);
+                row, 1, column, 1, isHeading, isSelected);
         info.setCollectionItemInfo(itemInfo);
     }
 }
