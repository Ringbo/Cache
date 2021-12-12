diff --git a/java/debugger/impl/src/com/intellij/debugger/ui/impl/UpdatableDebuggerView.java b/java/debugger/impl/src/com/intellij/debugger/ui/impl/UpdatableDebuggerView.java
index f042bf2..45cdada 100644
--- a/java/debugger/impl/src/com/intellij/debugger/ui/impl/UpdatableDebuggerView.java
+++ b/java/debugger/impl/src/com/intellij/debugger/ui/impl/UpdatableDebuggerView.java
@@ -35,7 +35,7 @@
   private final DebuggerStateManager myStateManager;
   private volatile boolean myRefreshNeeded = true;
   private final java.util.List<Disposable> myDisposables = new ArrayList<Disposable>();
-  private boolean myUpdateEnabled;
+  private volatile boolean myUpdateEnabled;
 
   protected UpdatableDebuggerView(final Project project, final DebuggerStateManager stateManager) {
     setLayout(new BorderLayout());
@@ -64,7 +64,7 @@
   }
 
   protected final boolean isUpdateEnabled() {
-    return myUpdateEnabled || isShowing();
+    return myUpdateEnabled;
   }
 
   public final void setUpdateEnabled(final boolean enabled) {
