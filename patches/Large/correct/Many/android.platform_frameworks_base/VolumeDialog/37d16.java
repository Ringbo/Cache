diff --git a/packages/SystemUI/src/com/android/systemui/volume/VolumeDialog.java b/packages/SystemUI/src/com/android/systemui/volume/VolumeDialog.java
index 0b225c2..8ca277e 100644
--- a/packages/SystemUI/src/com/android/systemui/volume/VolumeDialog.java
+++ b/packages/SystemUI/src/com/android/systemui/volume/VolumeDialog.java
@@ -870,7 +870,7 @@
                 if (row.anim != null) {
                     row.anim.cancel();
                 }
-                row.slider.setProgress(newProgress);
+                row.slider.setProgress(newProgress, true);
             }
         }
     }
