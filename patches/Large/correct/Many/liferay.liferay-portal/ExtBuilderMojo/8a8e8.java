diff --git a/support-maven/plugins/liferay-maven-plugin/src/main/java/com/liferay/maven/plugins/ExtBuilderMojo.java b/support-maven/plugins/liferay-maven-plugin/src/main/java/com/liferay/maven/plugins/ExtBuilderMojo.java
index 7719a48..3e1a245 100644
--- a/support-maven/plugins/liferay-maven-plugin/src/main/java/com/liferay/maven/plugins/ExtBuilderMojo.java
+++ b/support-maven/plugins/liferay-maven-plugin/src/main/java/com/liferay/maven/plugins/ExtBuilderMojo.java
@@ -256,7 +256,7 @@
 			File srcFile, File destDir, String[] excludes, String[] includes)
 		throws Exception {
 
-		UnArchiver unArchiver = archiverManager.getUnArchiver(src);
+		UnArchiver unArchiver = archiverManager.getUnArchiver(srcFile);
 
 		unArchiver.setDestDirectory(destDir);
 		unArchiver.setSourceFile(srcFile);
