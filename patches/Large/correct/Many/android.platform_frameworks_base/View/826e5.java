diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 393b166..49dc572 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -6161,7 +6161,7 @@
                 mPrivateFlags3 |= PFLAG3_FITTING_SYSTEM_WINDOWS;
                 return !dispatchApplyWindowInsets(new WindowInsets(insets)).hasInsets();
             } finally {
-                mPrivateFlags3 &= PFLAG3_FITTING_SYSTEM_WINDOWS;
+                mPrivateFlags3 &= ~PFLAG3_FITTING_SYSTEM_WINDOWS;
             }
         } else {
             // We're being called from the newer apply insets path.
