diff --git a/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/test/clazz/group/PluginsBatchTestClassGroup.java b/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/test/clazz/group/PluginsBatchTestClassGroup.java
index 1c14eb0..9f6635a 100644
--- a/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/test/clazz/group/PluginsBatchTestClassGroup.java
+++ b/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/test/clazz/group/PluginsBatchTestClassGroup.java
@@ -70,7 +70,8 @@
 				newGitWorkingDirectory(
 					portalGitWorkingDirectory.getUpstreamBranchName(),
 					JenkinsResultsParserUtil.getProperty(
-						portalReleaseProperties, "lp.plugins.dir"));
+						portalReleaseProperties, "lp.plugins.dir"),
+					"liferay-plugins-ee");
 
 		excludesPathMatchers.addAll(
 			getPathMatchers(
