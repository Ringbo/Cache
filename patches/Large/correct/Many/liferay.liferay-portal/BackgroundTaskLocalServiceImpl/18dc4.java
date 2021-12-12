diff --git a/portal-impl/src/com/liferay/portal/service/impl/BackgroundTaskLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/BackgroundTaskLocalServiceImpl.java
index fd70f0a..7b8d370 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/BackgroundTaskLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/BackgroundTaskLocalServiceImpl.java
@@ -232,7 +232,8 @@
 		throws SystemException {
 
 		return backgroundTaskPersistence.findByG_N_T(
-			groupId, name, taskExecutorClassName);
+			groupId, name, taskExecutorClassName, start, end,
+			orderByComparator);
 	}
 
 	@Override
