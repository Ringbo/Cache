diff --git a/src/main/java/com/gitblit/utils/JGitUtils.java b/src/main/java/com/gitblit/utils/JGitUtils.java
index c6526c2..0cee70d 100644
--- a/src/main/java/com/gitblit/utils/JGitUtils.java
+++ b/src/main/java/com/gitblit/utils/JGitUtils.java
@@ -711,7 +711,7 @@
 		try {
 			// resolve object id
 			ObjectId branchObject;
-			if (StringUtils.isEmpty(objectId)) {
+			if (StringUtils.isEmpty(objectId) || "HEAD".equalsIgnoreCase(objectId)) {
 				branchObject = getDefaultBranch(repository);
 			} else {
 				branchObject = repository.resolve(objectId);
