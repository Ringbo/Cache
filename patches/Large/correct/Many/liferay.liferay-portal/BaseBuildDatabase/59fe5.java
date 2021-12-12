diff --git a/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/BaseBuildDatabase.java b/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/BaseBuildDatabase.java
index e38978b..b4e1264 100644
--- a/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/BaseBuildDatabase.java
+++ b/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/BaseBuildDatabase.java
@@ -33,7 +33,7 @@
 	@Override
 	public File getBuildDatabaseJSFile() {
 		File buildDatabaseJSFile = new File(
-			_buildDataJSONFile.getParent(), "build-database.js");
+			_jsonObjectFile.getParent(), "build-database.js");
 
 		try {
 			JenkinsResultsParserUtil.write(
