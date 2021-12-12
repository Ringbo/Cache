diff --git a/shared/sync-engine-shared/test/unit/com/liferay/sync/engine/service/SyncAccountServiceTest.java b/shared/sync-engine-shared/test/unit/com/liferay/sync/engine/service/SyncAccountServiceTest.java
index 13f9047..b2d281e 100644
--- a/shared/sync-engine-shared/test/unit/com/liferay/sync/engine/service/SyncAccountServiceTest.java
+++ b/shared/sync-engine-shared/test/unit/com/liferay/sync/engine/service/SyncAccountServiceTest.java
@@ -37,7 +37,7 @@
 	@Test
 	public void testAddAccount() throws Exception {
 		SyncAccount syncAccount = SyncAccountService.addSyncAccount(
-			filePathName, "test@liferay.com", "test",
+			filePathName, 10, "test@liferay.com", "test",
 			"http://localhost:8080/api/jsonws");
 
 		_syncAccount = SyncAccountService.fetchSyncAccount(
