diff --git a/services/core/java/com/android/server/wm/WindowManagerService.java b/services/core/java/com/android/server/wm/WindowManagerService.java
index cdc6bd6..3cf8500 100644
--- a/services/core/java/com/android/server/wm/WindowManagerService.java
+++ b/services/core/java/com/android/server/wm/WindowManagerService.java
@@ -1153,7 +1153,9 @@
         int i;
         for (i = windows.size() - 1; i >= 0; --i) {
             WindowState w = windows.get(i);
-            if (w.mBaseLayer <= myLayer) {
+            // Dock divider shares the base layer with application windows, but we want to always
+            // keep it above the application windows.
+            if (w.mBaseLayer <= myLayer && w.mAttrs.type != TYPE_DOCK_DIVIDER) {
                 break;
             }
         }
