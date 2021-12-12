diff --git a/java/debugger/impl/src/com/intellij/debugger/memory/toolwindow/MemoryViewToolWindowFactory.java b/java/debugger/impl/src/com/intellij/debugger/memory/toolwindow/MemoryViewToolWindowFactory.java
index f614b1c..5b79d19 100644
--- a/java/debugger/impl/src/com/intellij/debugger/memory/toolwindow/MemoryViewToolWindowFactory.java
+++ b/java/debugger/impl/src/com/intellij/debugger/memory/toolwindow/MemoryViewToolWindowFactory.java
@@ -121,7 +121,7 @@
     if (javaProcess instanceof DebugProcessImpl) {
       final DebugProcessImpl processImpl = (DebugProcessImpl)javaProcess;
       final ClassesFilteredView classesFilteredView = new ClassesFilteredView(debugProcess.getSession());
-      myDispatcher.addListener(visible -> classesFilteredView.setActive(visible), project);
+      myDispatcher.addListener(visible -> classesFilteredView.setActive(visible), classesFilteredView);
 
       final MemoryViewDebugProcessData data = new MemoryViewDebugProcessData(classesFilteredView);
       final ToolWindow toolWindow = getToolWindow(processImpl.getProject());
