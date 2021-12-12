diff --git a/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/GitBisectToolTopLevelBuildRunner.java b/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/GitBisectToolTopLevelBuildRunner.java
index 9cb7845..3439ca0 100644
--- a/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/GitBisectToolTopLevelBuildRunner.java
+++ b/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/GitBisectToolTopLevelBuildRunner.java
@@ -31,9 +31,10 @@
 
 	@Override
 	protected void prepareInvocationBuildDataList() {
-		TopLevelBuildData topLevelBuildData = getBuildData();
+		PortalTopLevelBuildData portalTopLevelBuildData = getBuildData();
 
-		String downstreamJobName = topLevelBuildData.getJobName() + "-batch";
+		String downstreamJobName =
+			portalTopLevelBuildData.getJobName() + "-batch";
 
 		for (String portalBranchSHA : _getPortalBranchSHAs()) {
 			BatchBuildData batchBuildData = BuildDataFactory.newBatchBuildData(
@@ -65,7 +66,7 @@
 	}
 
 	private String _getDownstreamBuildDescription(String portalBranchSHA) {
-		BuildData buildData = getBuildData();
+		PortalTopLevelBuildData portalTopLevelBuildData = getBuildData();
 
 		StringBuilder sb = new StringBuilder();
 
@@ -76,29 +77,30 @@
 		sb.append(JenkinsResultsParserUtil.join(",", _getTestList()));
 		sb.append(" - ");
 		sb.append("<a href=\"https://");
-		sb.append(buildData.getTopLevelMasterHostname());
+		sb.append(portalTopLevelBuildData.getTopLevelMasterHostname());
 		sb.append(".liferay.com/userContent/");
-		sb.append(buildData.getUserContentRelativePath());
+		sb.append(portalTopLevelBuildData.getUserContentRelativePath());
 		sb.append("jenkins-report.html\">Jenkins Report</a>");
 
 		return sb.toString();
 	}
 
 	private List<String> _getPortalBranchSHAs() {
-		BuildData buildData = getBuildData();
+		PortalTopLevelBuildData portalTopLevelBuildData = getBuildData();
 
 		String portalGitCommits = JenkinsResultsParserUtil.getBuildParameter(
-			buildData.getBuildURL(), "PORTAL_BRANCH_SHAS");
+			portalTopLevelBuildData.getBuildURL(), "PORTAL_BRANCH_SHAS");
 
 		return Arrays.asList(portalGitCommits.split(","));
 	}
 
 	private List<String> _getTestList() {
-		BuildData buildData = getBuildData();
+		PortalTopLevelBuildData portalTopLevelBuildData = getBuildData();
 
 		String portalBatchTestSelector =
 			JenkinsResultsParserUtil.getBuildParameter(
-				buildData.getBuildURL(), "PORTAL_BATCH_TEST_SELECTOR");
+				portalTopLevelBuildData.getBuildURL(),
+				"PORTAL_BATCH_TEST_SELECTOR");
 
 		return Arrays.asList(portalBatchTestSelector.split(","));
 	}
