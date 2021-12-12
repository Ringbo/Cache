diff --git a/source/com/intellij/openapi/vcs/impl/ProjectLevelVcsManagerImpl.java b/source/com/intellij/openapi/vcs/impl/ProjectLevelVcsManagerImpl.java
index 3fec815..04fc18a 100644
--- a/source/com/intellij/openapi/vcs/impl/ProjectLevelVcsManagerImpl.java
+++ b/source/com/intellij/openapi/vcs/impl/ProjectLevelVcsManagerImpl.java
@@ -372,7 +372,7 @@
     if (upToDateRevisionProvider == null) return;
 
     try {
-      String lastUpToDateContent = upToDateRevisionProvider.getLastUpToDateContentFor(virtualFile);
+      String lastUpToDateContent = upToDateRevisionProvider.getLastUpToDateContentFor(virtualFile, true);
       if (lastUpToDateContent == null) return;
 
       setUpToDateContent(document, lastUpToDateContent);
