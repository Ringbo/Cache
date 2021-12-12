diff --git a/services/core/java/com/android/server/wm/DimLayerController.java b/services/core/java/com/android/server/wm/DimLayerController.java
index 3a6e328..4100446 100644
--- a/services/core/java/com/android/server/wm/DimLayerController.java
+++ b/services/core/java/com/android/server/wm/DimLayerController.java
@@ -200,8 +200,9 @@
                 // TODO: This is a work around for b/34395537 as the dim user should have cleaned-up
                 // it self when it was detached from the display. Need to investigate how the dim
                 // user is leaking...
-                Slog.wtfStack(TAG_WM, "Leaked dim user=" + user.toShortString()
-                        + " state=" + state);
+                //Slog.wtfStack(TAG_WM, "Leaked dim user=" + user.toShortString()
+                //        + " state=" + state);
+                Slog.w(TAG_WM, "Leaked dim user=" + user.toShortString() + " state=" + state);
                 removeDimLayerUser(user);
                 continue;
             }
