diff --git a/webs/sync-web/docroot/WEB-INF/src/com/liferay/sync/hook/upgrade/UpgradeProcess.java b/webs/sync-web/docroot/WEB-INF/src/com/liferay/sync/hook/upgrade/UpgradeProcess.java
index 715170c..4cb9a53 100644
--- a/webs/sync-web/docroot/WEB-INF/src/com/liferay/sync/hook/upgrade/UpgradeProcess.java
+++ b/webs/sync-web/docroot/WEB-INF/src/com/liferay/sync/hook/upgrade/UpgradeProcess.java
@@ -28,7 +28,7 @@
 
 			// SYNC-1453
 
-			if (!tableHasData("SyncDLObject")) {
+			if (!hasRows("SyncDLObject")) {
 				return;
 			}
 
