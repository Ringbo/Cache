diff --git a/explosionfield/src/main/java/tyrantgit/explosionfield/ExplosionField.java b/explosionfield/src/main/java/tyrantgit/explosionfield/ExplosionField.java
index 1011f64..f4f06e1 100644
--- a/explosionfield/src/main/java/tyrantgit/explosionfield/ExplosionField.java
+++ b/explosionfield/src/main/java/tyrantgit/explosionfield/ExplosionField.java
@@ -90,7 +90,7 @@
         view.getGlobalVisibleRect(r);
         int[] location = new int[2];
         getLocationOnScreen(location);
-        r.offset(location[0], -location[1]);
+        r.offset(-location[0], -location[1]);
         r.inset(-mExpandInset[0], -mExpandInset[1]);
         int startDelay = 100;
         ValueAnimator animator = ValueAnimator.ofFloat(0f, 1f).setDuration(150);
