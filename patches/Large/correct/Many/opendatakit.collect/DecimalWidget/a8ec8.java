diff --git a/collect_app/src/main/java/org/odk/collect/android/widgets/DecimalWidget.java b/collect_app/src/main/java/org/odk/collect/android/widgets/DecimalWidget.java
index dea5abe..22b9c45 100644
--- a/collect_app/src/main/java/org/odk/collect/android/widgets/DecimalWidget.java
+++ b/collect_app/src/main/java/org/odk/collect/android/widgets/DecimalWidget.java
@@ -85,7 +85,7 @@
 
         // disable if read only
         if (prompt.isReadOnly()) {
-            setBackgroundDrawable(null);
+            setBackground(null);
             setFocusable(false);
             setClickable(false);
         }
