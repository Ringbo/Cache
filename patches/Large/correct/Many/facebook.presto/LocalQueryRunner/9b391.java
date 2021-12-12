diff --git a/presto-main/src/main/java/com/facebook/presto/testing/LocalQueryRunner.java b/presto-main/src/main/java/com/facebook/presto/testing/LocalQueryRunner.java
index 3ce2afa..65f2208 100644
--- a/presto-main/src/main/java/com/facebook/presto/testing/LocalQueryRunner.java
+++ b/presto-main/src/main/java/com/facebook/presto/testing/LocalQueryRunner.java
@@ -207,7 +207,7 @@
         connectorManager.createConnection(catalogName, connectorFactory, properties);
     }
 
-    public QueryRunner printPlan()
+    public LocalQueryRunner printPlan()
     {
         printPlan = true;
         return this;
