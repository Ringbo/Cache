diff --git a/services/core/java/com/android/server/wm/WindowManagerService.java b/services/core/java/com/android/server/wm/WindowManagerService.java
index 658d34c..3b11c4e 100644
--- a/services/core/java/com/android/server/wm/WindowManagerService.java
+++ b/services/core/java/com/android/server/wm/WindowManagerService.java
@@ -9418,7 +9418,7 @@
                     mStackIdToStack.valueAt(stackNdx).mExitingAppTokens;
             for (i = exitingAppTokens.size() - 1; i >= 0; i--) {
                 AppWindowToken token = exitingAppTokens.get(i);
-                if (!token.hasVisible && !mClosingApps.contains(token)) {
+                if (!token.hasVisible && !mClosingApps.contains(token) && !token.mDeferRemoval) {
                     // Make sure there is no animation running on this token,
                     // so any windows associated with it will be removed as
                     // soon as their animations are complete
