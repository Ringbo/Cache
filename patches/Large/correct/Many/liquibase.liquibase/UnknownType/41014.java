diff --git a/liquibase-core/src/main/java/liquibase/datatype/core/UnknownType.java b/liquibase-core/src/main/java/liquibase/datatype/core/UnknownType.java
index 12357de..a36f0e2 100644
--- a/liquibase-core/src/main/java/liquibase/datatype/core/UnknownType.java
+++ b/liquibase-core/src/main/java/liquibase/datatype/core/UnknownType.java
@@ -26,7 +26,7 @@
     @Override
     public DatabaseDataType toDatabaseDataType(Database database) {
         int dataTypeMaxParameters;
-        if (getName().equalsIgnoreCase("enum")) {
+        if (getName().equalsIgnoreCase("enum") || getName().equalsIgnoreCase("set")) {
             dataTypeMaxParameters = Integer.MAX_VALUE;
         } else {
             dataTypeMaxParameters = database.getDataTypeMaxParameters(getName());
