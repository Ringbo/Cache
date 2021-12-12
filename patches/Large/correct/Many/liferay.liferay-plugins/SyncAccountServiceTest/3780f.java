diff --git a/shared/sync-engine-shared/test/unit/com/liferay/sync/engine/service/SyncAccountServiceTest.java b/shared/sync-engine-shared/test/unit/com/liferay/sync/engine/service/SyncAccountServiceTest.java
index 92dfdc4..8622318 100644
--- a/shared/sync-engine-shared/test/unit/com/liferay/sync/engine/service/SyncAccountServiceTest.java
+++ b/shared/sync-engine-shared/test/unit/com/liferay/sync/engine/service/SyncAccountServiceTest.java
@@ -37,8 +37,8 @@
 	@Test
 	public void testAddAccount() throws Exception {
 		SyncAccount syncAccount = SyncAccountService.addSyncAccount(
-			filePathName, 10, "test@liferay.com", "test",
-			"http://localhost:8080/api/jsonws", false);
+			filePathName, 10, "test@liferay.com", "test", false,
+			"http://localhost:8080/api/jsonws");
 
 		_syncAccount = SyncAccountService.fetchSyncAccount(
 			syncAccount.getSyncAccountId());
