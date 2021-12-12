diff --git a/core/java/android/app/Activity.java b/core/java/android/app/Activity.java
index 890e67d..cb17be3 100644
--- a/core/java/android/app/Activity.java
+++ b/core/java/android/app/Activity.java
@@ -4271,7 +4271,8 @@
     private Bundle transferSpringboardActivityOptions(Bundle options) {
         if (options == null && (mWindow != null && !mWindow.isActive())) {
             final ActivityOptions activityOptions = getActivityOptions();
-            if (activityOptions.getAnimationType() == ActivityOptions.ANIM_SCENE_TRANSITION) {
+            if (activityOptions != null &&
+                    activityOptions.getAnimationType() == ActivityOptions.ANIM_SCENE_TRANSITION) {
                 return activityOptions.toBundle();
             }
         }
