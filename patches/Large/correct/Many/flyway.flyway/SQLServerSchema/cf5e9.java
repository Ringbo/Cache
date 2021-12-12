diff --git a/flyway-core/src/main/java/org/flywaydb/core/internal/dbsupport/sqlserver/SQLServerSchema.java b/flyway-core/src/main/java/org/flywaydb/core/internal/dbsupport/sqlserver/SQLServerSchema.java
index 9785246..b1fb2c4 100644
--- a/flyway-core/src/main/java/org/flywaydb/core/internal/dbsupport/sqlserver/SQLServerSchema.java
+++ b/flyway-core/src/main/java/org/flywaydb/core/internal/dbsupport/sqlserver/SQLServerSchema.java
@@ -146,7 +146,7 @@
     protected boolean doEmpty() throws SQLException {
 
 
-        boolean empty  = queryDBObjects(ObjectType.SCALAR_FUNCTION,
+        boolean empty  = queryDBObjects(ObjectType.SCALAR_FUNCTION, ObjectType.AGGREGATE,
                 ObjectType.CLR_SCALAR_FUNCTION, ObjectType.CLR_TABLE_VALUED_FUNCTION, ObjectType.TABLE_VALUED_FUNCTION,
                 ObjectType.STORED_PROCEDURE, ObjectType.CLR_STORED_PROCEDURE, ObjectType.USER_TABLE,
                 ObjectType.SYNONYM, ObjectType.SEQUENCE_OBJECT, ObjectType.FOREIGN_KEY, ObjectType.VIEW).isEmpty();
