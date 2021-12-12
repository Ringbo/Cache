diff --git a/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/PortalBatchBuildRunner.java b/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/PortalBatchBuildRunner.java
index a56b5da..e5bbab0 100644
--- a/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/PortalBatchBuildRunner.java
+++ b/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/PortalBatchBuildRunner.java
@@ -72,10 +72,11 @@
 			return;
 		}
 
-		BuildData buildData = getBuildData();
+		PortalBatchBuildData portalBatchBuildData = getBuildData();
 
 		File target = new File(
-			buildData.getWorkspaceDir(), "test-results/TESTS-TestSuites.xml");
+			portalBatchBuildData.getWorkspaceDir(),
+			"test-results/TESTS-TestSuites.xml");
 
 		try {
 			JenkinsResultsParserUtil.copy(source, target);
