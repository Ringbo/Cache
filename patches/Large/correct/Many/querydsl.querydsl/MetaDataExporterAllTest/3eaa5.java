diff --git a/querydsl-sql-codegen/src/test/java/com/querydsl/sql/codegen/MetaDataExporterAllTest.java b/querydsl-sql-codegen/src/test/java/com/querydsl/sql/codegen/MetaDataExporterAllTest.java
index 4ff8ddd..ccc2c6d 100644
--- a/querydsl-sql-codegen/src/test/java/com/querydsl/sql/codegen/MetaDataExporterAllTest.java
+++ b/querydsl-sql-codegen/src/test/java/com/querydsl/sql/codegen/MetaDataExporterAllTest.java
@@ -77,7 +77,7 @@
                                             for (boolean exportColumns : booleans) {
                                                 for (boolean schemaToPackage : booleans) {
                                                     if (withBeans) {
-                                                        if (!beanPrefix.isEmpty() | !beanSuffix.isEmpty() |
+                                                        if (!beanPrefix.isEmpty() || !beanSuffix.isEmpty() ||
                                                             beanPackageName != null) {
                                                             continue;
                                                         }
