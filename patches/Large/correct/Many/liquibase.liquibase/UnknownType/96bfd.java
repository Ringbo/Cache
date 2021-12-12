diff --git a/liquibase-core/src/main/java/liquibase/datatype/core/UnknownType.java b/liquibase-core/src/main/java/liquibase/datatype/core/UnknownType.java
index 4a7a690..e7c7c50 100644
--- a/liquibase-core/src/main/java/liquibase/datatype/core/UnknownType.java
+++ b/liquibase-core/src/main/java/liquibase/datatype/core/UnknownType.java
@@ -62,7 +62,11 @@
         }
 
         if (database instanceof OracleDatabase) {
-            if (getName().equalsIgnoreCase("LONG") || getName().equalsIgnoreCase("NCLOB")) {
+            if (getName().equalsIgnoreCase("LONG")
+                    || getName().equalsIgnoreCase("NCLOB")
+                    || getName().equalsIgnoreCase("BFILE")
+                    || getName().equalsIgnoreCase("ROWID")
+                    ) {
                 parameters = new Object[0];
             } else if (getName().toUpperCase().startsWith("INTERVAL ")) {
                 return new DatabaseDataType(getName().replaceAll("\\(\\d+\\)", ""));
