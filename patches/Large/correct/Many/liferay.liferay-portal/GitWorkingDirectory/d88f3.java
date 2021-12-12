diff --git a/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/GitWorkingDirectory.java b/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/GitWorkingDirectory.java
index 6d77b5a..6b1d4d3 100644
--- a/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/GitWorkingDirectory.java
+++ b/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/GitWorkingDirectory.java
@@ -672,7 +672,8 @@
 			throw new RuntimeException(
 				JenkinsResultsParserUtil.combine(
 					"Unable to rebase ", targetBranch.getName(), " to ",
-					sourceBranch.getName()));
+					sourceBranch.getName(), "\n",
+					executionResult.getStandardErr()));
 		}
 	}
 
