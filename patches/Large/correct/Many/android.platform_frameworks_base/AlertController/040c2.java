diff --git a/core/java/com/android/internal/app/AlertController.java b/core/java/com/android/internal/app/AlertController.java
index 8d6caa1..2061c90 100644
--- a/core/java/com/android/internal/app/AlertController.java
+++ b/core/java/com/android/internal/app/AlertController.java
@@ -438,7 +438,7 @@
             LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                     LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
             
-            topPanel.addView(mCustomTitleView, lp);
+            topPanel.addView(mCustomTitleView, 0, lp);
             
             // Hide the title template
             View titleTemplate = mWindow.findViewById(R.id.title_template);
