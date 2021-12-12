diff --git a/plugins/stream-debugger/src/com/intellij/debugger/streams/action/TraceStreamAction.java b/plugins/stream-debugger/src/com/intellij/debugger/streams/action/TraceStreamAction.java
index eb62664..074a51e 100644
--- a/plugins/stream-debugger/src/com/intellij/debugger/streams/action/TraceStreamAction.java
+++ b/plugins/stream-debugger/src/com/intellij/debugger/streams/action/TraceStreamAction.java
@@ -109,7 +109,7 @@
     return false;
   }
 
-  private void runTrace(@NotNull StreamChain chain, @NotNull XDebugSession session) {
+  private static void runTrace(@NotNull StreamChain chain, @NotNull XDebugSession session) {
     final EvaluationAwareTraceWindow window = new EvaluationAwareTraceWindow(session, chain);
     ApplicationManager.getApplication().invokeLater(window::show);
     final Project project = session.getProject();
@@ -143,7 +143,7 @@
   }
 
   @Nullable
-  private XDebugSession getCurrentSession(@NotNull AnActionEvent e) {
+  private static XDebugSession getCurrentSession(@NotNull AnActionEvent e) {
     final Project project = e.getProject();
     return project == null ? null : XDebuggerManager.getInstance(project).getCurrentSession();
   }
