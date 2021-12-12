diff --git a/src/com/goide/dlv/DlvDebugProcess.java b/src/com/goide/dlv/DlvDebugProcess.java
index e9cbaa9..579dbf6 100644
--- a/src/com/goide/dlv/DlvDebugProcess.java
+++ b/src/com/goide/dlv/DlvDebugProcess.java
@@ -264,7 +264,7 @@
       if (breakpointPosition == null) return;
       VirtualFile file = breakpointPosition.getFile();
       int line = breakpointPosition.getLine();
-      send(new DlvRequest.CreateBreakpoint(file.getCanonicalPath(), line + 1))
+      send(new DlvRequest.CreateBreakpoint(file.getPath(), line + 1))
         .done(new Consumer<Breakpoint>() {
           @Override
           public void consume(@NotNull Breakpoint b) {
