diff --git a/library/src/main/java/com/mikepenz/materialdrawer/adapter/BaseDrawerAdapter.java b/library/src/main/java/com/mikepenz/materialdrawer/adapter/BaseDrawerAdapter.java
index 5e6625d..0b0b828 100644
--- a/library/src/main/java/com/mikepenz/materialdrawer/adapter/BaseDrawerAdapter.java
+++ b/library/src/main/java/com/mikepenz/materialdrawer/adapter/BaseDrawerAdapter.java
@@ -108,7 +108,7 @@
 
         //fix wrong remembered position
         if (position < previousSelection) {
-            previousSelection = previousSelection + 1;
+            previousSelection = previousSelection - 1;
         }
     }
 
