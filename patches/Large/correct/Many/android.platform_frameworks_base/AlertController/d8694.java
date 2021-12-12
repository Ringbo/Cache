diff --git a/core/java/com/android/internal/app/AlertController.java b/core/java/com/android/internal/app/AlertController.java
index 43a02cf..fe532b0 100644
--- a/core/java/com/android/internal/app/AlertController.java
+++ b/core/java/com/android/internal/app/AlertController.java
@@ -572,7 +572,7 @@
             if (whichButtons == BIT_BUTTON_POSITIVE) {
                 centerButton(mButtonPositive);
             } else if (whichButtons == BIT_BUTTON_NEGATIVE) {
-                centerButton(mButtonNeutral);
+                centerButton(mButtonNegative);
             } else if (whichButtons == BIT_BUTTON_NEUTRAL) {
                 centerButton(mButtonNeutral);
             }
