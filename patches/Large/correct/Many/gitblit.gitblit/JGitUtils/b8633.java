diff --git a/src/main/java/com/gitblit/utils/JGitUtils.java b/src/main/java/com/gitblit/utils/JGitUtils.java
index 6f3b085..c6526c2 100644
--- a/src/main/java/com/gitblit/utils/JGitUtils.java
+++ b/src/main/java/com/gitblit/utils/JGitUtils.java
@@ -2329,7 +2329,7 @@
 					RefUpdate mergeRefUpdate = repository.updateRef(toBranch);
 					mergeRefUpdate.setNewObjectId(mergeCommitId);
 					mergeRefUpdate.setRefLogMessage("commit: " + mergeCommit.getShortMessage(), false);
-					RefUpdate.Result rc = mergeRefUpdate.forceUpdate();
+					RefUpdate.Result rc = mergeRefUpdate.update();
 					switch (rc) {
 					case FAST_FORWARD:
 						// successful, clean merge
