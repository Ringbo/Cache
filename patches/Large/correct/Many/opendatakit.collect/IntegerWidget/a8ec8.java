diff --git a/collect_app/src/main/java/org/odk/collect/android/widgets/IntegerWidget.java b/collect_app/src/main/java/org/odk/collect/android/widgets/IntegerWidget.java
index a7320c7..9131bed 100644
--- a/collect_app/src/main/java/org/odk/collect/android/widgets/IntegerWidget.java
+++ b/collect_app/src/main/java/org/odk/collect/android/widgets/IntegerWidget.java
@@ -68,7 +68,7 @@
         mAnswer.setFilters(fa);
 
         if (prompt.isReadOnly()) {
-            setBackgroundDrawable(null);
+            setBackground(null);
             setFocusable(false);
             setClickable(false);
         }
