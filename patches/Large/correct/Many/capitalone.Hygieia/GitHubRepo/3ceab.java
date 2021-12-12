diff --git a/GitHubSourceCodeCollector/src/main/java/com/capitalone/dashboard/model/GitHubRepo.java b/GitHubSourceCodeCollector/src/main/java/com/capitalone/dashboard/model/GitHubRepo.java
index c5ff3fe..3b7f0f6 100644
--- a/GitHubSourceCodeCollector/src/main/java/com/capitalone/dashboard/model/GitHubRepo.java
+++ b/GitHubSourceCodeCollector/src/main/java/com/capitalone/dashboard/model/GitHubRepo.java
@@ -67,7 +67,7 @@
 
         GitHubRepo gitHubRepo = (GitHubRepo) o;
 
-        return getRepoUrl().equals(gitHubRepo.getRepoUrl()) & getBranch().equals(gitHubRepo.getBranch());
+        return getRepoUrl().equals(gitHubRepo.getRepoUrl()) && getBranch().equals(gitHubRepo.getBranch());
     }
 
     @Override
