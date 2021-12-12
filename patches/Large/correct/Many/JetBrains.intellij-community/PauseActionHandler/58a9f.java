diff --git a/debugger/impl/com/intellij/debugger/actions/PauseActionHandler.java b/debugger/impl/com/intellij/debugger/actions/PauseActionHandler.java
index cb8b9d3..f73e3f4 100644
--- a/debugger/impl/com/intellij/debugger/actions/PauseActionHandler.java
+++ b/debugger/impl/com/intellij/debugger/actions/PauseActionHandler.java
@@ -22,8 +22,8 @@
            );
   }
 
-  private boolean isSingleThreadSuspended(final DebuggerSession debuggerSession) {
+  private static boolean isSingleThreadSuspended(final DebuggerSession debuggerSession) {
     final SuspendContextImpl suspendContext = debuggerSession.getContextManager().getContext().getSuspendContext();
-    return suspendContext != null && suspendContext.getSuspendPolicy() == EventRequest.SUSPEND_EVENT_THREAD;
+    return suspendContext != null && !suspendContext.isResumed() && suspendContext.getSuspendPolicy() == EventRequest.SUSPEND_EVENT_THREAD;
   }
 }
