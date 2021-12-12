diff --git a/plugins/plugin-git/che-plugin-git-ext-git/src/main/java/org/eclipse/che/ide/ext/git/client/commit/CommitPresenter.java b/plugins/plugin-git/che-plugin-git-ext-git/src/main/java/org/eclipse/che/ide/ext/git/client/commit/CommitPresenter.java
index 1f22262..52f9bf6 100644
--- a/plugins/plugin-git/che-plugin-git-ext-git/src/main/java/org/eclipse/che/ide/ext/git/client/commit/CommitPresenter.java
+++ b/plugins/plugin-git/che-plugin-git-ext-git/src/main/java/org/eclipse/che/ide/ext/git/client/commit/CommitPresenter.java
@@ -115,7 +115,7 @@
         view.setEnableAmendCheckBox(true);
         view.setEnablePushAfterCommitCheckBox(true);
         view.setEnableRemoteBranchesDropDownLis(false);
-        service.diff(appContext.getDevMachine(), project.getLocation(), null, NAME_STATUS, false, 0, "HEAD", false)
+        service.diff(appContext.getDevMachine(), project.getLocation(), null, NAME_STATUS, true, 0, "HEAD", false)
                .then(diff -> {
                    service.log(appContext.getDevMachine(), project.getLocation(), null, -1, 1, false)
                           .then(arg -> {
