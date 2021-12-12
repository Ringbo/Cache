diff --git a/services/core/java/com/android/server/wm/WindowManagerService.java b/services/core/java/com/android/server/wm/WindowManagerService.java
index 0ee2a4f..4c63872 100644
--- a/services/core/java/com/android/server/wm/WindowManagerService.java
+++ b/services/core/java/com/android/server/wm/WindowManagerService.java
@@ -1629,7 +1629,7 @@
             } else if (type == TYPE_TOAST) {
                 // Apps targeting SDK above N MR1 cannot arbitrary add toast windows.
                 addToastWindowRequiresToken = doesAddToastWindowRequireToken(attrs.packageName,
-                        callingUid, attachedWindow);
+                        callingUid, parentWindow);
                 if (addToastWindowRequiresToken && token.windowType != TYPE_TOAST) {
                     Slog.w(TAG_WM, "Attempted to add a toast window with bad token "
                             + attrs.token + ".  Aborting.");
