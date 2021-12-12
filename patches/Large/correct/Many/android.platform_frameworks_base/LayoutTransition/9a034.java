diff --git a/core/java/android/animation/LayoutTransition.java b/core/java/android/animation/LayoutTransition.java
index 7f0ea99..894f428 100644
--- a/core/java/android/animation/LayoutTransition.java
+++ b/core/java/android/animation/LayoutTransition.java
@@ -321,13 +321,13 @@
     public long getStartDelay(int transitionType) {
         switch (transitionType) {
             case CHANGE_APPEARING:
-                return mChangingAppearingDuration;
+                return mChangingAppearingDelay;
             case CHANGE_DISAPPEARING:
-                return mChangingDisappearingDuration;
+                return mChangingDisappearingDelay;
             case APPEARING:
-                return mAppearingDuration;
+                return mAppearingDelay;
             case DISAPPEARING:
-                return mDisappearingDuration;
+                return mDisappearingDelay;
         }
         // shouldn't reach here
         return 0;
