diff --git a/itests/util/src/main/java/org/apache/hadoop/hive/ql/security/authorization/plugin/sqlstd/SQLStdHiveAuthorizationValidatorForTest.java b/itests/util/src/main/java/org/apache/hadoop/hive/ql/security/authorization/plugin/sqlstd/SQLStdHiveAuthorizationValidatorForTest.java
index d883e4b..92c1292 100644
--- a/itests/util/src/main/java/org/apache/hadoop/hive/ql/security/authorization/plugin/sqlstd/SQLStdHiveAuthorizationValidatorForTest.java
+++ b/itests/util/src/main/java/org/apache/hadoop/hive/ql/security/authorization/plugin/sqlstd/SQLStdHiveAuthorizationValidatorForTest.java
@@ -119,7 +119,7 @@
       List<HivePrivilegeObject> privObjs) throws SemanticException {
     List<HivePrivilegeObject> needRewritePrivObjs = new ArrayList<>(); 
     for (HivePrivilegeObject privObj : privObjs) {
-      if (privObj.getObjectName().equals("masking_test")) {
+      if (privObj.getObjectName().equals("masking_test") || privObj.getObjectName().startsWith("masking_test_n")) {
         privObj.setRowFilterExpression("key % 2 = 0 and key < 10");
         List<String> cellValueTransformers = new ArrayList<>();
         for (String columnName : privObj.getColumns()) {
@@ -131,7 +131,7 @@
         }
         privObj.setCellValueTransformers(cellValueTransformers);
         needRewritePrivObjs.add(privObj);
-      } else if (privObj.getObjectName().equals("masking_test_view")) {
+      } else if (privObj.getObjectName().equals("masking_test_view") || privObj.getObjectName().startsWith("masking_test_view_n")) {
         privObj.setRowFilterExpression("key > 6");
         List<String> cellValueTransformers = new ArrayList<>();
         for (String columnName : privObj.getColumns()) {
@@ -143,14 +143,14 @@
         }
         privObj.setCellValueTransformers(cellValueTransformers);
         needRewritePrivObjs.add(privObj);
-      } else if (privObj.getObjectName().equals("masking_test_subq")) {
+      } else if (privObj.getObjectName().equals("masking_test_subq") || privObj.getObjectName().startsWith("masking_test_subq_n")) {
         privObj
-            .setRowFilterExpression("key in (select key from src where src.key = masking_test_subq.key)");
+            .setRowFilterExpression("key in (select key from src where src.key = " + privObj.getObjectName() + ".key)");
         needRewritePrivObjs.add(privObj);
-      } else if (privObj.getObjectName().equals("masking_acid_no_masking")) {
+      } else if (privObj.getObjectName().equals("masking_acid_no_masking") || privObj.getObjectName().startsWith("masking_acid_no_masking_n")) {
         // testing acid usage when no masking/filtering is present
         needRewritePrivObjs.add(privObj);
-      } else if (privObj.getObjectName().equals("masking_test_druid")) {
+      } else if (privObj.getObjectName().equals("masking_test_druid") || privObj.getObjectName().startsWith("masking_test_druid_n")) {
         // testing druid queries row filtering is present
         privObj.setRowFilterExpression("key > 10");
         needRewritePrivObjs.add(privObj);
