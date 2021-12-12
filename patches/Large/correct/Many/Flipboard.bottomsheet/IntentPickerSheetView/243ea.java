diff --git a/bottomsheet-commons/src/main/java/com/flipboard/bottomsheet/commons/IntentPickerSheetView.java b/bottomsheet-commons/src/main/java/com/flipboard/bottomsheet/commons/IntentPickerSheetView.java
index 5cef4e0..41af2c1 100644
--- a/bottomsheet-commons/src/main/java/com/flipboard/bottomsheet/commons/IntentPickerSheetView.java
+++ b/bottomsheet-commons/src/main/java/com/flipboard/bottomsheet/commons/IntentPickerSheetView.java
@@ -158,7 +158,7 @@
 
         @Override
         public long getItemId(int position) {
-            return activityInfos.get(position).label.hashCode();
+            return activityInfos.get(position).componentName.hashCode();
         }
 
         @Override
