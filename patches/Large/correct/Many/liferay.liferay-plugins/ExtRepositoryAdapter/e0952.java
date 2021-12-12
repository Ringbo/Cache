diff --git a/shared/dl-repository-shared/src/com/liferay/repository/external/ExtRepositoryAdapter.java b/shared/dl-repository-shared/src/com/liferay/repository/external/ExtRepositoryAdapter.java
index 53bd4ca..bb5e76a 100644
--- a/shared/dl-repository-shared/src/com/liferay/repository/external/ExtRepositoryAdapter.java
+++ b/shared/dl-repository-shared/src/com/liferay/repository/external/ExtRepositoryAdapter.java
@@ -1153,7 +1153,7 @@
 		RepositoryEntry repositoryEntry = RepositoryEntryUtil.fetchByUUID_G(
 			entryUuid, getGroupId(), true);
 
-		if (repositoryEntry != null) {
+		if (repositoryEntry == null) {
 			throw new NoSuchRepositoryEntryException(
 				"No repository entry exits with {Uuid='" + entryUuid + "}");
 		}
