diff --git a/services/core/java/com/android/server/wm/WindowManagerService.java b/services/core/java/com/android/server/wm/WindowManagerService.java
index 467b9a4..8437d52 100644
--- a/services/core/java/com/android/server/wm/WindowManagerService.java
+++ b/services/core/java/com/android/server/wm/WindowManagerService.java
@@ -9598,7 +9598,7 @@
                 for (i=N-1; i>=0; i--) {
                     WindowState w = windows.get(i);
                     final TaskStack stack = w.getStack();
-                    if (stack == null) {
+                    if (stack == null && w.getAttrs().type != TYPE_PRIVATE_PRESENTATION) {
                         continue;
                     }
 
@@ -9610,7 +9610,7 @@
                         handleNotObscuredLocked(w, currentTime, innerDw, innerDh);
                     }
 
-                    if (!stack.testDimmingTag()) {
+                    if (stack != null && !stack.testDimmingTag()) {
                         handleFlagDimBehind(w);
                     }
 
