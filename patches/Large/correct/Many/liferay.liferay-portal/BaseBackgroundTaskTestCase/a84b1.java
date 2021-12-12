diff --git a/modules/portal/portal-background-task-test/test/unit/com/liferay/portal/background/task/internal/BaseBackgroundTaskTestCase.java b/modules/portal/portal-background-task-test/test/unit/com/liferay/portal/background/task/internal/BaseBackgroundTaskTestCase.java
index addf134..75dacd3 100644
--- a/modules/portal/portal-background-task-test/test/unit/com/liferay/portal/background/task/internal/BaseBackgroundTaskTestCase.java
+++ b/modules/portal/portal-background-task-test/test/unit/com/liferay/portal/background/task/internal/BaseBackgroundTaskTestCase.java
@@ -74,7 +74,7 @@
 			Mockito.mock(User.class)
 		);
 
-		_backgroundTaskThreadLocalManagerImpl.setUserLocalService(
+		backgroundTaskThreadLocalManagerImpl.setUserLocalService(
 			userLocalService);
 
 		_companyId = 1234l;
