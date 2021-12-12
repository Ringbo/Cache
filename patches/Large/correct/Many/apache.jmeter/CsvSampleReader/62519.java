diff --git a/src/core/org/apache/jmeter/report/core/CsvSampleReader.java b/src/core/org/apache/jmeter/report/core/CsvSampleReader.java
index 84e8510..0e00eb3 100644
--- a/src/core/org/apache/jmeter/report/core/CsvSampleReader.java
+++ b/src/core/org/apache/jmeter/report/core/CsvSampleReader.java
@@ -162,7 +162,7 @@
             data = CSVSaveService.csvReadFile(reader, separator);
             Sample sample = null;
             if (data.length > 0) {
-                if (data.length < columnCount) {
+                if (data.length != columnCount) {
                     throw new SampleException("Mismatch between expected number of columns:"+columnCount+" and columns in CSV file:"+data.length+
                             ", check your jmeter.save.saveservice.* configuration");
                 }
