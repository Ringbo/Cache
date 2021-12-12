diff --git a/portal-impl/src/com/liferay/portal/service/impl/ResourcePermissionLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/ResourcePermissionLocalServiceImpl.java
index 7742382..9810267 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/ResourcePermissionLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/ResourcePermissionLocalServiceImpl.java
@@ -333,7 +333,7 @@
 		}
 		else {
 			resourcePermission = resourcePermissionPersistence.fetchByC_N_S_P_R(
-				companyId, name, scope, primKey, roleId, false);
+				companyId, name, scope, primKey, roleId);
 		}
 
 		long oldActionIds = 0;
