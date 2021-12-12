diff --git a/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/PassExecutorService.java b/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/PassExecutorService.java
index 1e300fc..de0a661 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/PassExecutorService.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/PassExecutorService.java
@@ -479,7 +479,7 @@
                                               @NotNull final AtomicInteger threadsToStartCountdown,
                                               @NotNull Runnable callbackOnApplied) {
     ApplicationManager.getApplication().invokeLater((DumbAwareRunnable)() -> {
-      if (isDisposed() || myProject.isDisposed()) {
+      if (isDisposed() || myProject.isDisposed() || !fileEditor.isValid()) {
         updateProgress.cancel();
       }
       if (updateProgress.isCanceled()) {
