diff --git a/main/src/main/java/com/google/android/apps/muzei/settings/AboutActivity.java b/main/src/main/java/com/google/android/apps/muzei/settings/AboutActivity.java
index 3acb340..cfbfc4a 100644
--- a/main/src/main/java/com/google/android/apps/muzei/settings/AboutActivity.java
+++ b/main/src/main/java/com/google/android/apps/muzei/settings/AboutActivity.java
@@ -109,7 +109,7 @@
         mAnimator = demoContainerView.animate()
                 .alpha(1)
                 .setStartDelay(250)
-                .setDuration(10000)
+                .setDuration(1000)
                 .withEndAction(new Runnable() {
                     @Override
                     public void run() {
