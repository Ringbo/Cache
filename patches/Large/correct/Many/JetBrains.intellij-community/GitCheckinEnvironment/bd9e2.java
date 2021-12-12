diff --git a/plugins/git4idea/src/git4idea/checkin/GitCheckinEnvironment.java b/plugins/git4idea/src/git4idea/checkin/GitCheckinEnvironment.java
index 1642628..00bb6d6 100644
--- a/plugins/git4idea/src/git4idea/checkin/GitCheckinEnvironment.java
+++ b/plugins/git4idea/src/git4idea/checkin/GitCheckinEnvironment.java
@@ -266,7 +266,7 @@
       List<GitRepository> preselectedRepositories = newArrayList(repositories);
       GuiUtils.invokeLaterIfNeeded(
         () -> new VcsPushDialog(myProject, preselectedRepositories, GitBranchUtil.getCurrentRepository(myProject)).show(),
-        modality);
+        modality, myProject.getDisposed());
     }
     return exceptions;
   }
