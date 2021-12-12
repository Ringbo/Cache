diff --git a/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/breakpoints/XLineBreakpointManager.java b/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/breakpoints/XLineBreakpointManager.java
index 806ca73..4888bd2 100644
--- a/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/breakpoints/XLineBreakpointManager.java
+++ b/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/breakpoints/XLineBreakpointManager.java
@@ -200,7 +200,7 @@
           if (line >= 0 && line < document.getLineCount() && file != null) {
             ApplicationManager.getApplication().invokeLater(new Runnable() {
               public void run() {
-                if (!myProject.isDisposed() && file.isValid()) {
+                if (!myProject.isDisposed() && myProject.isInitialized() && file.isValid()) {
                   XDebuggerUtil.getInstance().toggleLineBreakpoint(myProject, file, line);
                 }
               }
