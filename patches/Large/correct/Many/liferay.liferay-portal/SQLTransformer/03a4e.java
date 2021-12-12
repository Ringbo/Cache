diff --git a/portal-impl/src/com/liferay/portal/dao/orm/common/SQLTransformer.java b/portal-impl/src/com/liferay/portal/dao/orm/common/SQLTransformer.java
index 72860f6..fcb3075 100644
--- a/portal-impl/src/com/liferay/portal/dao/orm/common/SQLTransformer.java
+++ b/portal-impl/src/com/liferay/portal/dao/orm/common/SQLTransformer.java
@@ -143,7 +143,10 @@
 		else if (_vendorFirebird || _vendorInterbase) {
 			return matcher.replaceAll("BIN_AND($1, $2)");
 		}
-		else if (_vendorMySQL) {
+		else if (
+			_vendorMySQL || _vendorPostgreSQL || _vendorSQLServer ||
+			_vendorSybase) {
+
 			return matcher.replaceAll("($1 & $2)");
 		}
 		else {
