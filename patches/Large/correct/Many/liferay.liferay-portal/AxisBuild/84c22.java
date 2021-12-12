diff --git a/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/AxisBuild.java b/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/AxisBuild.java
index 15cb435..5a0a923 100644
--- a/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/AxisBuild.java
+++ b/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/AxisBuild.java
@@ -281,7 +281,7 @@
 			for (TestResult testResult : getTestResults(null)) {
 				String testStatus = testResult.getStatus();
 
-				if (testStatus.equals("PASSED") ||
+				if (testStatus.equals("FIXED") || testStatus.equals("PASSED") ||
 					testStatus.equals("SKIPPED")) {
 
 					continue;
