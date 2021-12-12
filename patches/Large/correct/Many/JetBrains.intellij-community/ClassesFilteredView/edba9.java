diff --git a/java/debugger/impl/src/com/intellij/debugger/memory/ui/ClassesFilteredView.java b/java/debugger/impl/src/com/intellij/debugger/memory/ui/ClassesFilteredView.java
index f3d0af6..3fb5b94 100644
--- a/java/debugger/impl/src/com/intellij/debugger/memory/ui/ClassesFilteredView.java
+++ b/java/debugger/impl/src/com/intellij/debugger/memory/ui/ClassesFilteredView.java
@@ -325,7 +325,7 @@
   private void handleClassSelection(@Nullable ReferenceType ref) {
     final XDebugSession debugSession = XDebuggerManager.getInstance(myProject).getCurrentSession();
     if (ref != null && debugSession != null && debugSession.isSuspended()) {
-      if (ref.virtualMachine().canGetInstanceInfo()) {
+      if (!ref.virtualMachine().canGetInstanceInfo()) {
         XDebuggerManagerImpl.NOTIFICATION_GROUP
           .createNotification("The virtual machine implementation does not provide an ability to get instances",
                               NotificationType.INFORMATION).notify(debugSession.getProject());
