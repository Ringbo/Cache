diff --git a/kylin-it/src/test/java/org/apache/kylin/query/KylinTestBase.java b/kylin-it/src/test/java/org/apache/kylin/query/KylinTestBase.java
index 7724123..8f143c7 100644
--- a/kylin-it/src/test/java/org/apache/kylin/query/KylinTestBase.java
+++ b/kylin-it/src/test/java/org/apache/kylin/query/KylinTestBase.java
@@ -263,8 +263,8 @@
         } catch (SQLException sqlException) {
             List<List<String>> results = Lists.newArrayList();
             List<SelectedColumnMeta> columnMetas = Lists.newArrayList();
-            boolean b = PushDownUtil.doPushDownQuery(ProjectInstance.DEFAULT_PROJECT_NAME, "DEFAULT", sql, results, columnMetas,
-                    sqlException);
+            boolean b = PushDownUtil.doPushDownQuery(ProjectInstance.DEFAULT_PROJECT_NAME, sql, "DEFAULT", results,
+                    columnMetas, sqlException);
             if (!b) {
                 throw sqlException;
             }
