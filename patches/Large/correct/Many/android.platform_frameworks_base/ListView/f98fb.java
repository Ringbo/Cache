diff --git a/core/java/android/widget/ListView.java b/core/java/android/widget/ListView.java
index 1368cd3..2e9858c 100644
--- a/core/java/android/widget/ListView.java
+++ b/core/java/android/widget/ListView.java
@@ -3882,9 +3882,10 @@
         super.onInitializeAccessibilityNodeInfo(info);
         info.setClassName(ListView.class.getName());
 
-        final int count = getCount();
+        final int rowsCount = getCount();
         final int selectionMode = getSelectionModeForAccessibility();
-        final CollectionInfo collectionInfo = CollectionInfo.obtain(1, count, false, selectionMode);
+        final CollectionInfo collectionInfo = CollectionInfo.obtain(
+                rowsCount, 1, false, selectionMode);
         info.setCollectionInfo(collectionInfo);
     }
 
@@ -3897,7 +3898,7 @@
         final boolean isHeading = lp != null && lp.viewType != ITEM_VIEW_TYPE_HEADER_OR_FOOTER;
         final boolean isSelected = isItemChecked(position);
         final CollectionItemInfo itemInfo = CollectionItemInfo.obtain(
-                0, 1, position, 1, isHeading, isSelected);
+                position, 1, 0, 1, isHeading, isSelected);
         info.setCollectionItemInfo(itemInfo);
     }
 }
