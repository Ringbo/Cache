diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenParentProjectFileProcessor.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenParentProjectFileProcessor.java
index 73bf9e2..543b71d 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenParentProjectFileProcessor.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenParentProjectFileProcessor.java
@@ -56,7 +56,7 @@
     if (result == null) {
       File parentIoFile = MavenArtifactUtil.getArtifactFile(generalSettings.getEffectiveLocalRepository(),
                                                             parentDesc.getParentId(), "pom");
-      parentFile = LocalFileSystem.getInstance().refreshAndFindFileByIoFile(parentIoFile);
+      parentFile = LocalFileSystem.getInstance().findFileByIoFile(parentIoFile);
       if (parentFile != null) {
         result = processRepositoryParent(parentFile);
       }
