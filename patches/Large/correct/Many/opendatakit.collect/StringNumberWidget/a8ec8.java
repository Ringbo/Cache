diff --git a/collect_app/src/main/java/org/odk/collect/android/widgets/StringNumberWidget.java b/collect_app/src/main/java/org/odk/collect/android/widgets/StringNumberWidget.java
index 86340f4..c32fb73 100644
--- a/collect_app/src/main/java/org/odk/collect/android/widgets/StringNumberWidget.java
+++ b/collect_app/src/main/java/org/odk/collect/android/widgets/StringNumberWidget.java
@@ -51,7 +51,7 @@
         });
 
         if (prompt.isReadOnly()) {
-            setBackgroundDrawable(null);
+            setBackground(null);
             setFocusable(false);
             setClickable(false);
         }
