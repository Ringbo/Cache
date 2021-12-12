diff --git a/modules/sdk/project-templates/src/test/java/com/liferay/project/templates/ProjectTemplatesTest.java b/modules/sdk/project-templates/src/test/java/com/liferay/project/templates/ProjectTemplatesTest.java
index c08fb3a..d38c0bf 100644
--- a/modules/sdk/project-templates/src/test/java/com/liferay/project/templates/ProjectTemplatesTest.java
+++ b/modules/sdk/project-templates/src/test/java/com/liferay/project/templates/ProjectTemplatesTest.java
@@ -156,7 +156,8 @@
 			"public class BarActivator implements BundleActivator {");
 
 		File mavenProjectDir = _buildTemplateWithMaven(
-			"activator", "bar-activator", "-DclassName=BarActivator");
+			"activator", "bar-activator", "-DclassName=BarActivator",
+			"-Dpackage=bar.activator");
 
 		_buildProjects(
 			gradleProjectDir, mavenProjectDir,
