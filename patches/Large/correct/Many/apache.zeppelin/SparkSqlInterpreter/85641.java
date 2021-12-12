diff --git a/spark/src/main/java/com/nflabs/zeppelin/spark/SparkSqlInterpreter.java b/spark/src/main/java/com/nflabs/zeppelin/spark/SparkSqlInterpreter.java
index 25d3e79..9b84b89 100644
--- a/spark/src/main/java/com/nflabs/zeppelin/spark/SparkSqlInterpreter.java
+++ b/spark/src/main/java/com/nflabs/zeppelin/spark/SparkSqlInterpreter.java
@@ -76,11 +76,11 @@
     this.maxResult = conf.getInt("ZEPPELIN_SPARK_MAX_RESULT",
         "zeppelin.spark.maxResult",
         Integer.parseInt(getProperty("zeppelin.spark.maxResult")));
-    OpenSparkInterpreter(true);
+    openSparkInterpreter(true);
   }
 
   private SparkInterpreter getSparkInterpreter(){
-    return OpenSparkInterpreter(false);
+    return openSparkInterpreter(false);
   }
 
   private SparkInterpreter openSparkInterpreter(boolean open) {
