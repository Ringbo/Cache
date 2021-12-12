diff --git a/codeInsight/impl/com/intellij/codeInsight/ExternalAnnotationsManagerImpl.java b/codeInsight/impl/com/intellij/codeInsight/ExternalAnnotationsManagerImpl.java
index 6e2be44..9005b39 100644
--- a/codeInsight/impl/com/intellij/codeInsight/ExternalAnnotationsManagerImpl.java
+++ b/codeInsight/impl/com/intellij/codeInsight/ExternalAnnotationsManagerImpl.java
@@ -524,7 +524,7 @@
       super(project, MESSAGE, ProjectBundle.message("external.annotation.prompt"), Messages.getQuestionIcon());
       myProject = project;
       init();
-      Disposer.register(myDisposable, myProject);
+      Disposer.register(myProject, myDisposable);
     }
 
     protected String getOkActionName() {
