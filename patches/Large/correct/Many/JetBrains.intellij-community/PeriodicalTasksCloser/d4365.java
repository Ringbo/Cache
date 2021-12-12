diff --git a/platform/vcs-api/src/com/intellij/lifecycle/PeriodicalTasksCloser.java b/platform/vcs-api/src/com/intellij/lifecycle/PeriodicalTasksCloser.java
index bcfa19c..ff73cfd 100644
--- a/platform/vcs-api/src/com/intellij/lifecycle/PeriodicalTasksCloser.java
+++ b/platform/vcs-api/src/com/intellij/lifecycle/PeriodicalTasksCloser.java
@@ -165,7 +165,7 @@
   private void throwCanceledException(final Project project, final Throwable t) {
     synchronized (myLock) {
       // allow NPE & assertion catch only if project is closed and being disposed
-      if (myStates.containsKey(project)) {
+      if (! myStates.containsKey(project)) {
         Rethrow.reThrowRuntime(t);
       }
     }
