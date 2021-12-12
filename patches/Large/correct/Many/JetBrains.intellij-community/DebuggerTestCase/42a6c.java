diff --git a/java/testFramework/src/com/intellij/debugger/DebuggerTestCase.java b/java/testFramework/src/com/intellij/debugger/DebuggerTestCase.java
index 79d3b12..307c0b2 100644
--- a/java/testFramework/src/com/intellij/debugger/DebuggerTestCase.java
+++ b/java/testFramework/src/com/intellij/debugger/DebuggerTestCase.java
@@ -425,7 +425,7 @@
   protected void printLocation(SuspendContextImpl suspendContext) {
     try {
       Location location = suspendContext.getFrameProxy().location();
-      String message = "paused at " + location.sourcePath() + ":" + location.lineNumber();
+      String message = "paused at " + location.sourceName() + ":" + location.lineNumber();
       println(message, ProcessOutputTypes.SYSTEM);
     }
     catch (Throwable e) {
