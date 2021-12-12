diff --git a/core/java/com/android/internal/policy/PhoneWindow.java b/core/java/com/android/internal/policy/PhoneWindow.java
index ab372d3..75ad916a 100644
--- a/core/java/com/android/internal/policy/PhoneWindow.java
+++ b/core/java/com/android/internal/policy/PhoneWindow.java
@@ -3705,13 +3705,14 @@
         }
 
         /**
-         * Returns true if the Window is free floating and has a shadow. Note that non overlapping
-         * windows do not have a shadow since it could not be seen anyways (a small screen / tablet
+         * Returns true if the Window is free floating and has a shadow (although at some times
+         * it might not be displaying it, e.g. during a resize). Note that non overlapping windows
+         * do not have a shadow since it could not be seen anyways (a small screen / tablet
          * "tiles" the windows side by side but does not overlap them).
          * @return Returns true when the window has a shadow created by the non client decor.
          **/
         private boolean windowHasShadow() {
-            return windowHasNonClientDecor() && getElevation() > 0;
+            return windowHasNonClientDecor() && nonClientDecorHasShadow(mWindow.mWorkspaceId);
         }
 
         void setWindow(PhoneWindow phoneWindow) {
@@ -5417,7 +5418,7 @@
      * @param workspaceId The Id of the workspace which contains this window.
      * @Return Returns true if the window should show a shadow.
      **/
-    private boolean nonClientDecorHasShadow(int workspaceId) {
+    private static boolean nonClientDecorHasShadow(int workspaceId) {
         return workspaceId == FREEFORM_WORKSPACE_STACK_ID;
     }
 
