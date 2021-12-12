diff --git a/batch/chunk-csv-database/src/main/java/org/javaee7/batch/chunk/csv/database/MyItemReader.java b/batch/chunk-csv-database/src/main/java/org/javaee7/batch/chunk/csv/database/MyItemReader.java
index 03c1799..3709eca 100644
--- a/batch/chunk-csv-database/src/main/java/org/javaee7/batch/chunk/csv/database/MyItemReader.java
+++ b/batch/chunk-csv-database/src/main/java/org/javaee7/batch/chunk/csv/database/MyItemReader.java
@@ -21,12 +21,7 @@
     public void open(Serializable checkpoint) throws Exception {
         reader = new BufferedReader(
                 new InputStreamReader(
-                    this
-                    .getClass()
-                    .getClassLoader()
-                    .getResourceAsStream("/META-INF/mydata.csv")
-                )
-            );
+                        Thread.currentThread().getContextClassLoader().getResourceAsStream("/META-INF/mydata.csv")));
     }
 
     @Override
