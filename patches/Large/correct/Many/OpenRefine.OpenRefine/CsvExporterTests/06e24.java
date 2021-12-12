diff --git a/main/tests/server/src/com/google/refine/tests/exporters/CsvExporterTests.java b/main/tests/server/src/com/google/refine/tests/exporters/CsvExporterTests.java
index 7b87870..dc130ef 100644
--- a/main/tests/server/src/com/google/refine/tests/exporters/CsvExporterTests.java
+++ b/main/tests/server/src/com/google/refine/tests/exporters/CsvExporterTests.java
@@ -198,7 +198,7 @@
     
     @Test
     public void exportDateColumns(){
-        CreateGrid(1,1);
+        CreateGrid(1,2);
         Calendar calendar = Calendar.getInstance();
         Date date = new Date();
 
