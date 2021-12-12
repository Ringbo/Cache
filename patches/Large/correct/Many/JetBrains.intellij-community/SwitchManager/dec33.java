diff --git a/platform/platform-api/src/com/intellij/ui/switcher/SwitchManager.java b/platform/platform-api/src/com/intellij/ui/switcher/SwitchManager.java
index af2b4d5..7a5c24a 100644
--- a/platform/platform-api/src/com/intellij/ui/switcher/SwitchManager.java
+++ b/platform/platform-api/src/com/intellij/ui/switcher/SwitchManager.java
@@ -51,7 +51,10 @@
     myQa = quickAccess;
   }
 
-  boolean dispatchKeyEvent(@NotNull KeyEvent e) {
+  /**
+   * internal use only
+   */
+  public boolean dispatchKeyEvent(@NotNull KeyEvent e) {
     if (isSessionActive()) {
       return false;
     }
