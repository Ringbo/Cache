diff --git a/portal-kernel/test/unit/com/liferay/portal/modules/ModulesStructureTest.java b/portal-kernel/test/unit/com/liferay/portal/modules/ModulesStructureTest.java
index f9841f8..bd65a6b 100644
--- a/portal-kernel/test/unit/com/liferay/portal/modules/ModulesStructureTest.java
+++ b/portal-kernel/test/unit/com/liferay/portal/modules/ModulesStructureTest.java
@@ -426,7 +426,7 @@
 			_getGitRepoBuildGradle(dirPath, buildGradleTemplate), buildGradle);
 
 		if (!gradlePropertiesExists) {
-			Assert.fail("Missing " + gradlePropertiesExists);
+			Assert.fail("Missing " + gradlePropertiesPath);
 		}
 
 		String gradleProperties = _read(gradlePropertiesPath);
