diff --git a/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/TopLevelBuildRunner.java b/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/TopLevelBuildRunner.java
index bce3958..d746914 100644
--- a/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/TopLevelBuildRunner.java
+++ b/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/TopLevelBuildRunner.java
@@ -104,13 +104,13 @@
 		Element jenkinsReportElement = _topLevelBuild.getJenkinsReportElement();
 
 		try {
-			BuildData buildData = getBuildData();
+			TopLevelBuildData topLevelBuildData = getBuildData();
 
 			String jenkinsReportString = StringEscapeUtils.unescapeXml(
 				Dom4JUtil.format(jenkinsReportElement, true));
 
 			File jenkinsReportFile = new File(
-				buildData.getWorkspaceDir(), "jenkins-report.html");
+				topLevelBuildData.getWorkspaceDir(), "jenkins-report.html");
 
 			JenkinsResultsParserUtil.write(
 				jenkinsReportFile, jenkinsReportString);
@@ -120,7 +120,7 @@
 			}
 
 			String userContentRelativePath =
-				buildData.getUserContentRelativePath();
+				topLevelBuildData.getUserContentRelativePath();
 
 			userContentRelativePath = userContentRelativePath.replace(
 				")", "\\)");
@@ -130,7 +130,7 @@
 			try {
 				String command = JenkinsResultsParserUtil.combine(
 					"ssh -o NumberOfPasswordPrompts=0 ",
-					buildData.getMasterHostname(),
+					topLevelBuildData.getMasterHostname(),
 					" 'mkdir -p /opt/java/jenkins/userContent/",
 					userContentRelativePath, "'");
 
@@ -150,7 +150,7 @@
 					String command = JenkinsResultsParserUtil.combine(
 						"time rsync -Iqs --chmod=go=rx --timeout=1200 ",
 						jenkinsReportFile.getCanonicalPath(), " ",
-						buildData.getMasterHostname(), "::usercontent/",
+						topLevelBuildData.getMasterHostname(), "::usercontent/",
 						userContentRelativePath);
 
 					JenkinsResultsParserUtil.executeBashCommands(command);
@@ -255,9 +255,9 @@
 			}
 		}
 
-		BuildData buildData = getBuildData();
+		TopLevelBuildData topLevelBuildData = getBuildData();
 
-		return buildData.getJenkinsGitHubURL();
+		return topLevelBuildData.getJenkinsGitHubURL();
 	}
 
 	private void _invokeBuild(
