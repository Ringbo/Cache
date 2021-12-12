diff --git a/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/GitBisectToolBuild.java b/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/GitBisectToolBuild.java
index 3f70ba4..5029e8c 100644
--- a/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/GitBisectToolBuild.java
+++ b/modules/test/jenkins-results-parser/src/main/java/com/liferay/jenkins/results/parser/GitBisectToolBuild.java
@@ -129,7 +129,7 @@
 		}
 
 		if (currentGitCommitGroup.size() <= 1) {
-			return getEmptyCell();
+			return getEmptyCellElement();
 		}
 
 		LocalGitCommit firstNextLocalGitCommit = nextGitCommitGroup.get(0);
