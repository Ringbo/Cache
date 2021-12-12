diff --git a/liquibase-core/src/main/java/liquibase/datatype/DataTypeFactory.java b/liquibase-core/src/main/java/liquibase/datatype/DataTypeFactory.java
index 3778116..fdab0ef 100644
--- a/liquibase-core/src/main/java/liquibase/datatype/DataTypeFactory.java
+++ b/liquibase-core/src/main/java/liquibase/datatype/DataTypeFactory.java
@@ -88,7 +88,7 @@
             dataTypeName = dataTypeDefinition.replaceFirst("\\s*\\(.*\\)", "");
         }
         if (dataTypeName.matches(".+\\{.*")) {
-            dataTypeName = dataTypeDefinition.replaceFirst("\\s*\\{.*", "");
+            dataTypeName = dataTypeName.replaceFirst("\\s*\\{.*", "");
         }
         boolean primaryKey = false;
         if (dataTypeName.endsWith(" identity")) {
