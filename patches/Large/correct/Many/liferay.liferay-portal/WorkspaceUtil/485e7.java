diff --git a/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/WorkspaceUtil.java b/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/WorkspaceUtil.java
index 6d6e562..0526bba 100644
--- a/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/WorkspaceUtil.java
+++ b/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/WorkspaceUtil.java
@@ -220,7 +220,7 @@
 		private String _getRepositoryName() {
 			return JenkinsResultsParserUtil.getProperty(
 				_getWorkspaceProperties(), "repository.name", _repositoryType,
-				_getParentUpstreamBranchName());
+				getUpstreamBranchName());
 		}
 
 		private String _getUpstreamGitHubURL() {
