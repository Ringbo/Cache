diff --git a/collect_app/src/main/java/org/odk/collect/android/adapters/SelectMultipleListAdapter.java b/collect_app/src/main/java/org/odk/collect/android/adapters/SelectMultipleListAdapter.java
index 14efaa5..60a7ed3 100644
--- a/collect_app/src/main/java/org/odk/collect/android/adapters/SelectMultipleListAdapter.java
+++ b/collect_app/src/main/java/org/odk/collect/android/adapters/SelectMultipleListAdapter.java
@@ -66,7 +66,7 @@
 
         for (Selection selectedItem : selectedItems) {
             // match based on value, not key
-            if (items.get(index).getValue().equals(selectedItem.getValue())) {
+            if (filteredItems.get(index).getValue().equals(selectedItem.getValue())) {
                 checkBox.setChecked(true);
                 break;
             }
