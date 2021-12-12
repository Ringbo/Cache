diff --git a/collect_app/src/main/java/org/odk/collect/android/widgets/QuestionWidget.java b/collect_app/src/main/java/org/odk/collect/android/widgets/QuestionWidget.java
index 47769d3..2913e15 100644
--- a/collect_app/src/main/java/org/odk/collect/android/widgets/QuestionWidget.java
+++ b/collect_app/src/main/java/org/odk/collect/android/widgets/QuestionWidget.java
@@ -148,7 +148,7 @@
             try {
                 mPlayColor = Color.parseColor(playColorString);
             } catch (IllegalArgumentException e) {
-                Timber.e(e, "Argument %s is incorrect", playColorString, e.getMessage());
+                Timber.e(e, "Argument %s is incorrect");
             }
         }
         questionMediaLayout.setPlayTextColor(mPlayColor);
@@ -159,7 +159,7 @@
             try {
                 mPlayBackgroundColor = Color.parseColor(playBackgroundColorString);
             } catch (IllegalArgumentException e) {
-                Timber.e(e, "Argument %s is incorrect", playBackgroundColorString, e.getMessage());
+                Timber.e(e, "Argument %s is incorrect", playBackgroundColorString);
             }
         }
         questionMediaLayout.setPlayTextBackgroundColor(mPlayBackgroundColor);
