diff --git a/spark/interpreter/src/main/java/org/apache/zeppelin/spark/IPySparkInterpreter.java b/spark/interpreter/src/main/java/org/apache/zeppelin/spark/IPySparkInterpreter.java
index c7253fb..37896f9 100644
--- a/spark/interpreter/src/main/java/org/apache/zeppelin/spark/IPySparkInterpreter.java
+++ b/spark/interpreter/src/main/java/org/apache/zeppelin/spark/IPySparkInterpreter.java
@@ -51,9 +51,10 @@
         PySparkInterpreter.getPythonExec(getProperties()));
     sparkInterpreter = getSparkInterpreter();
     SparkConf conf = sparkInterpreter.getSparkContext().getConf();
-    // only set PYTHONPATH in local or yarn-client mode.
+    // only set PYTHONPATH in embedded, local or yarn-client mode.
     // yarn-cluster will setup PYTHONPATH automatically.
-    if (!conf.get("spark.submit.deployMode").equals("cluster")) {
+    if (!conf.contains("spark.submit.deployMode") ||
+        !conf.get("spark.submit.deployMode").equals("cluster")) {
       setAdditionalPythonPath(PythonUtils.sparkPythonPath());
       setAddBulitinPy4j(false);
     }
