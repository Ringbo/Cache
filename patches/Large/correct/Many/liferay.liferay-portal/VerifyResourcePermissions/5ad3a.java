diff --git a/portal-impl/src/com/liferay/portal/verify/VerifyResourcePermissions.java b/portal-impl/src/com/liferay/portal/verify/VerifyResourcePermissions.java
index da90994..bb0e199 100644
--- a/portal-impl/src/com/liferay/portal/verify/VerifyResourcePermissions.java
+++ b/portal-impl/src/com/liferay/portal/verify/VerifyResourcePermissions.java
@@ -87,8 +87,8 @@
 					_verifiableResourcedModels) {
 
 				verifyResourcedModel(
-					role, verifiableResourcedModel.getTableName(),
-					verifiableResourcedModel.getModelName(),
+					role, verifiableResourcedModel.getModelName(),
+					verifiableResourcedModel.getTableName(),
 					verifiableResourcedModel.getPrimaryKeyColumnName());
 			}
 
