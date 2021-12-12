diff --git a/collect_app/src/main/java/org/odk/collect/android/widgets/StringWidget.java b/collect_app/src/main/java/org/odk/collect/android/widgets/StringWidget.java
index d00cc88..9b26a0e 100644
--- a/collect_app/src/main/java/org/odk/collect/android/widgets/StringWidget.java
+++ b/collect_app/src/main/java/org/odk/collect/android/widgets/StringWidget.java
@@ -100,7 +100,7 @@
         }
 
         if (mReadOnly) {
-            mAnswer.setBackgroundDrawable(null);
+            mAnswer.setBackground(null);
             mAnswer.setFocusable(false);
             mAnswer.setClickable(false);
         }
