diff --git a/spark/src/main/java/org/apache/zeppelin/spark/SparkInterpreter.java b/spark/src/main/java/org/apache/zeppelin/spark/SparkInterpreter.java
index f3c45ab..6dc13ad 100644
--- a/spark/src/main/java/org/apache/zeppelin/spark/SparkInterpreter.java
+++ b/spark/src/main/java/org/apache/zeppelin/spark/SparkInterpreter.java
@@ -528,8 +528,8 @@
     if (getProperty("master").equals("yarn-client")) {
       System.setProperty("SPARK_YARN_MODE", "true");
     }
-    if (getProperty().contains("spark.yarn.keytab") &&
-            getProperty().contains("spark.yarn.principal")) {
+    if (getProperty().containsKey("spark.yarn.keytab") &&
+            getProperty().containsKey("spark.yarn.principal")) {
       try {
         String keytab = getProperty().getProperty("spark.yarn.keytab");
         String principal = getProperty().getProperty("spark.yarn.principal");
