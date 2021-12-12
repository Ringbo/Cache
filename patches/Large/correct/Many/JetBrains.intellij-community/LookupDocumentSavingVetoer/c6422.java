diff --git a/platform/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupDocumentSavingVetoer.java b/platform/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupDocumentSavingVetoer.java
index 103fcfe..614c464 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupDocumentSavingVetoer.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupDocumentSavingVetoer.java
@@ -30,7 +30,7 @@
   @Override
   public boolean maySaveDocument(@NotNull Document document) {
     for (Project project : ProjectManager.getInstance().getOpenProjects()) {
-      if (LookupManager.getInstance(project).getActiveLookup() != null) {
+      if (!project.isDisposed() && LookupManager.getInstance(project).getActiveLookup() != null) {
         return false;
       }
     }
