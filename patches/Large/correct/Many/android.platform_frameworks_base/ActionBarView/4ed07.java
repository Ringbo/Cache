diff --git a/core/java/com/android/internal/widget/ActionBarView.java b/core/java/com/android/internal/widget/ActionBarView.java
index e3a66c5..a41b348 100644
--- a/core/java/com/android/internal/widget/ActionBarView.java
+++ b/core/java/com/android/internal/widget/ActionBarView.java
@@ -385,7 +385,7 @@
 
             if ((flagsChanged & ActionBar.DISPLAY_HOME_AS_UP) != 0) {
                 mHomeAsUpView.setVisibility((options & ActionBar.DISPLAY_HOME_AS_UP) != 0
-                        ? VISIBLE : INVISIBLE);
+                        ? VISIBLE : GONE);
             }
 
             if ((flagsChanged & ActionBar.DISPLAY_USE_LOGO) != 0) {
