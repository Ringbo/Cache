diff --git a/modules/util/sync-engine/src/com/liferay/sync/engine/util/IODeltaUtil.java b/modules/util/sync-engine/src/com/liferay/sync/engine/util/IODeltaUtil.java
index 37250d91..a5d3846 100644
--- a/modules/util/sync-engine/src/com/liferay/sync/engine/util/IODeltaUtil.java
+++ b/modules/util/sync-engine/src/com/liferay/sync/engine/util/IODeltaUtil.java
@@ -101,7 +101,7 @@
 			Path sourceChecksumsFilePath = getChecksumsFilePath(sourceSyncFile);
 
 			if (Files.notExists(sourceChecksumsFilePath)) {
-				checksums(targetSyncFile);
+				checksums(sourceSyncFile);
 			}
 
 			Path targetChecksumsFilePath = getChecksumsFilePath(targetSyncFile);
