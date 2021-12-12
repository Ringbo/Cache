diff --git a/DesktopProject/src/org/gephi/desktop/project/ProjectControllerUIImpl.java b/DesktopProject/src/org/gephi/desktop/project/ProjectControllerUIImpl.java
index 1218bdd..ffb53da 100644
--- a/DesktopProject/src/org/gephi/desktop/project/ProjectControllerUIImpl.java
+++ b/DesktopProject/src/org/gephi/desktop/project/ProjectControllerUIImpl.java
@@ -100,7 +100,7 @@
                 StatusDisplayer.getDefault().setStatusText(NbBundle.getMessage(ProjectControllerUIImpl.class, "ProjectControllerUI.status.saved", fileName));
             }
         };
-        if (saveRunnable instanceof LongTask) {
+        if (saveTask instanceof LongTask) {
             longTaskExecutor.execute((LongTask) saveTask, saveRunnable);
         } else {
             longTaskExecutor.execute(null, saveRunnable);
@@ -291,7 +291,7 @@
                 StatusDisplayer.getDefault().setStatusText(NbBundle.getMessage(ProjectControllerUIImpl.class, "ProjectControllerUI.status.opened", fileName));
             }
         };
-        if (loadRunnable instanceof LongTask) {
+        if (loadTask instanceof LongTask) {
             longTaskExecutor.execute((LongTask) loadTask, loadRunnable);
         } else {
             longTaskExecutor.execute(null, loadRunnable);
