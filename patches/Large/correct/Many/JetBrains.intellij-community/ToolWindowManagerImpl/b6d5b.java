diff --git a/platform-impl/src/com/intellij/openapi/wm/impl/ToolWindowManagerImpl.java b/platform-impl/src/com/intellij/openapi/wm/impl/ToolWindowManagerImpl.java
index 97085db..c91983b 100644
--- a/platform-impl/src/com/intellij/openapi/wm/impl/ToolWindowManagerImpl.java
+++ b/platform-impl/src/com/intellij/openapi/wm/impl/ToolWindowManagerImpl.java
@@ -1773,7 +1773,7 @@
 
     fixStickingDialogs();
 
-    LaterInvocator.invokeLater(new Runnable() {
+    SwingUtilities.invokeLater(new Runnable() {
       public void run() {
         if (checkForRejectOrByPass(command, forced, result)) return;
 
