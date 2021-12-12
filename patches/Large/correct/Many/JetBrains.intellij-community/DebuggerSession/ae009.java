diff --git a/java/debugger/impl/src/com/intellij/debugger/impl/DebuggerSession.java b/java/debugger/impl/src/com/intellij/debugger/impl/DebuggerSession.java
index b33789a..7b5681e 100644
--- a/java/debugger/impl/src/com/intellij/debugger/impl/DebuggerSession.java
+++ b/java/debugger/impl/src/com/intellij/debugger/impl/DebuggerSession.java
@@ -388,7 +388,7 @@
   public void dispose() {
     getProcess().dispose();
     Disposer.dispose(myUpdateAlarm);
-    DebuggerInvocationUtil.invokeLater(getProject(), new Runnable() {
+    DebuggerInvocationUtil.swingInvokeLater(getProject(), new Runnable() {
       @Override
       public void run() {
         getContextManager().setState(SESSION_EMPTY_CONTEXT, State.DISPOSED, Event.DISPOSE, null);
