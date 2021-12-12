diff --git a/portal-impl/src/com/liferay/portal/service/impl/ResourceBlockLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/ResourceBlockLocalServiceImpl.java
index dcc954d..8949413 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/ResourceBlockLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/ResourceBlockLocalServiceImpl.java
@@ -790,7 +790,7 @@
 			updateGroupScopeResourceTypePermissions(
 				companyId, groupId, name, roleId, actionIdsLong, operator);
 
-		PermissionCacheUtil.clearResourceBlockCache(companyId, groupId, name);
+		PermissionCacheUtil.clearResourceCache();
 	}
 
 	@Override
