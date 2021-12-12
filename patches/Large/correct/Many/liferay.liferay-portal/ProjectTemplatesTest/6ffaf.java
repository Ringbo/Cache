diff --git a/modules/sdk/project-templates/project-templates/src/test/java/com/liferay/project/templates/ProjectTemplatesTest.java b/modules/sdk/project-templates/project-templates/src/test/java/com/liferay/project/templates/ProjectTemplatesTest.java
index c6948af..d9f8480 100644
--- a/modules/sdk/project-templates/project-templates/src/test/java/com/liferay/project/templates/ProjectTemplatesTest.java
+++ b/modules/sdk/project-templates/project-templates/src/test/java/com/liferay/project/templates/ProjectTemplatesTest.java
@@ -113,7 +113,7 @@
 		FileSystem fileSystem = FileSystems.getDefault();
 
 		_pathMatcherOutputFiles = fileSystem.getPathMatcher(
-			"glob:**/*.{jar,war}");
+			"glob:**/{build/libs,target}/*.{jar,war}");
 
 		_projectTemplateVersions = FileUtil.readProperties(
 			Paths.get("build", "project-template-versions.properties"));
@@ -1804,7 +1804,8 @@
 		File mavenOutputDir = new File(mavenProjectDir, "target");
 
 		_buildProjects(
-			gradleProjectDir, mavenProjectDir, gradleOutputDir, mavenOutputDir);
+			gradleProjectDir, mavenProjectDir, gradleOutputDir, mavenOutputDir,
+			_GRADLE_TASK_PATH_BUILD);
 	}
 
 	private static void _buildProjects(
