diff --git a/app/src/main/java/com/fastaccess/ui/modules/repos/pull_requests/pull_request/details/PullRequestPagerActivity.java b/app/src/main/java/com/fastaccess/ui/modules/repos/pull_requests/pull_request/details/PullRequestPagerActivity.java
index bc2f3966..291b449 100644
--- a/app/src/main/java/com/fastaccess/ui/modules/repos/pull_requests/pull_request/details/PullRequestPagerActivity.java
+++ b/app/src/main/java/com/fastaccess/ui/modules/repos/pull_requests/pull_request/details/PullRequestPagerActivity.java
@@ -423,7 +423,7 @@
         requestModel.setCommitId(pullRequest.getHead().getSha());
         boolean isAuthor = author != null && Login.getUser().getLogin().equalsIgnoreCase(author.getLogin());
         ReviewChangesActivity.Companion.startForResult(this, view, requestModel, getPresenter().getRepoId(),
-                getPresenter().getLogin(), pullRequest.getNumber(), isAuthor);
+                getPresenter().getLogin(), pullRequest.getNumber(), isAuthor, isEnterprise());
     }
 
     private void initTabs(@NonNull PullRequest pullRequest) {
