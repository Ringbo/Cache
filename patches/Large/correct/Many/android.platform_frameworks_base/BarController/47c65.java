diff --git a/policy/src/com/android/internal/policy/impl/BarController.java b/policy/src/com/android/internal/policy/impl/BarController.java
index 49e1072..bfbd60d 100644
--- a/policy/src/com/android/internal/policy/impl/BarController.java
+++ b/policy/src/com/android/internal/policy/impl/BarController.java
@@ -121,7 +121,7 @@
                 }
             } else {
                 vis = (vis & ~mTranslucentFlag) | (oldVis & mTranslucentFlag);
-                vis = (vis & View.SYSTEM_UI_TRANSPARENT) | (oldVis & View.SYSTEM_UI_TRANSPARENT);
+                vis = (vis & ~View.SYSTEM_UI_TRANSPARENT) | (oldVis & View.SYSTEM_UI_TRANSPARENT);
             }
         }
         return vis;
