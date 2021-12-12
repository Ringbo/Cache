diff --git a/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/BatchBuild.java b/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/BatchBuild.java
index fef24e1..bc7476b 100644
--- a/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/BatchBuild.java
+++ b/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/BatchBuild.java
@@ -479,7 +479,8 @@
 				for (TestResult testResult : getTestResults(null)) {
 					String testStatus = testResult.getStatus();
 
-					if (testStatus.equals("PASSED") ||
+					if (testStatus.equals("FIXED") ||
+						testStatus.equals("PASSED") ||
 						testStatus.equals("SKIPPED")) {
 
 						continue;
