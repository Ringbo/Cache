diff --git a/core/java/android/app/Activity.java b/core/java/android/app/Activity.java
index a69f101..ad38db1 100644
--- a/core/java/android/app/Activity.java
+++ b/core/java/android/app/Activity.java
@@ -4275,7 +4275,8 @@
     private Bundle transferSpringboardActivityOptions(Bundle options) {
         if (options == null && (mWindow != null && !mWindow.isActive())) {
             final ActivityOptions activityOptions = getActivityOptions();
-            if (activityOptions.getAnimationType() == ActivityOptions.ANIM_SCENE_TRANSITION) {
+            if (activityOptions != null &&
+                    activityOptions.getAnimationType() == ActivityOptions.ANIM_SCENE_TRANSITION) {
                 return activityOptions.toBundle();
             }
         }
