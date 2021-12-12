diff --git a/plugins/cvs2/source/com/intellij/cvsSupport2/CvsVcs2.java b/plugins/cvs2/source/com/intellij/cvsSupport2/CvsVcs2.java
index 572bcda..3e8e825 100644
--- a/plugins/cvs2/source/com/intellij/cvsSupport2/CvsVcs2.java
+++ b/plugins/cvs2/source/com/intellij/cvsSupport2/CvsVcs2.java
@@ -219,7 +219,7 @@
   }
 
   public static void executeQuietOperation(String title, CvsOperation operation, final Project project) {
-    CvsOperationExecutor executor = new CvsOperationExecutor(project);
+    CvsOperationExecutor executor = new CvsOperationExecutor(false, project, ModalityState.defaultModalityState());
     executor.setIsQuietOperation(true);
     executor.performActionSync(new CommandCvsHandler(title, operation), CvsOperationExecutorCallback.EMPTY);
   }
