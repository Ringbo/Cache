diff --git a/core/java/android/transition/Visibility.java b/core/java/android/transition/Visibility.java
index bac668a..8b74a1e 100644
--- a/core/java/android/transition/Visibility.java
+++ b/core/java/android/transition/Visibility.java
@@ -557,7 +557,7 @@
                 if (mIsForcedVisibility) {
                     mView.setTransitionAlpha(0);
                 } else {
-                    mView.setTransitionVisibility(mFinalVisibility);
+                    mView.setVisibility(mFinalVisibility);
                 }
             }
         }
