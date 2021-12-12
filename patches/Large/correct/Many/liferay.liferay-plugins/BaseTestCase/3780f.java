diff --git a/shared/sync-engine-shared/test/unit/com/liferay/sync/engine/BaseTestCase.java b/shared/sync-engine-shared/test/unit/com/liferay/sync/engine/BaseTestCase.java
index ba08a43..08f2162 100644
--- a/shared/sync-engine-shared/test/unit/com/liferay/sync/engine/BaseTestCase.java
+++ b/shared/sync-engine-shared/test/unit/com/liferay/sync/engine/BaseTestCase.java
@@ -68,8 +68,8 @@
 			System.getProperty("user.home") + "/liferay-sync-test");
 
 		syncAccount = SyncAccountService.addSyncAccount(
-			filePathName, 10, "test@liferay.com", "test",
-			"http://localhost:8080/api/jsonws", false);
+			filePathName, 10, "test@liferay.com", "test", false,
+			"http://localhost:8080/api/jsonws");
 
 		syncAccount.setActive(true);
 
