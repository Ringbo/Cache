diff --git a/liquibase-core/src/main/java/liquibase/datatype/core/TimestampType.java b/liquibase-core/src/main/java/liquibase/datatype/core/TimestampType.java
index 76833f1..e14daf2 100644
--- a/liquibase-core/src/main/java/liquibase/datatype/core/TimestampType.java
+++ b/liquibase-core/src/main/java/liquibase/datatype/core/TimestampType.java
@@ -13,7 +13,7 @@
     @Override
     public DatabaseDataType toDatabaseDataType(Database database) {
         if (database instanceof MySQLDatabase) {
-            if (getRawDefinition().contains(" ")) {
+            if (getRawDefinition().contains(" ") || getRawDefinition().contains("(")) {
                 return new DatabaseDataType(getRawDefinition());
             }
             return new DatabaseDataType("TIMESTAMP");
