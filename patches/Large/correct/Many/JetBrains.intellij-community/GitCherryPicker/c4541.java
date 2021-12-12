diff --git a/plugins/git4idea/src/git4idea/cherrypick/GitCherryPicker.java b/plugins/git4idea/src/git4idea/cherrypick/GitCherryPicker.java
index eda7470..cd5973a 100644
--- a/plugins/git4idea/src/git4idea/cherrypick/GitCherryPicker.java
+++ b/plugins/git4idea/src/git4idea/cherrypick/GitCherryPicker.java
@@ -79,7 +79,7 @@
   @NotNull
   private String createCommitMessage(@NotNull GitRepository repository, @NotNull VcsFullCommitDetails commit) {
     String message = commit.getFullMessage();
-    if (shouldAddSuffix(repository, commit.getId())) message += "\n\n(cherry picked from commit " + commit.getId().toShortString() + ")";
+    if (shouldAddSuffix(repository, commit.getId())) message += "\n\n(cherry picked from commit " + commit.getId().asString() + ")";
     return message;
   }
 
