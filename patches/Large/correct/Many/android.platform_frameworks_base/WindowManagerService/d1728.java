diff --git a/services/core/java/com/android/server/wm/WindowManagerService.java b/services/core/java/com/android/server/wm/WindowManagerService.java
index 1b72876..00d9cd5 100644
--- a/services/core/java/com/android/server/wm/WindowManagerService.java
+++ b/services/core/java/com/android/server/wm/WindowManagerService.java
@@ -1191,7 +1191,9 @@
         int i;
         for (i = N - 1; i >= 0; --i) {
             WindowState w = windows.get(i);
-            if (w.mBaseLayer <= myLayer) {
+            // Dock divider shares the base layer with application windows, but we want to always
+            // keep it above the application windows.
+            if (w.mBaseLayer <= myLayer && w.mAttrs.type != TYPE_DOCK_DIVIDER) {
                 break;
             }
         }
