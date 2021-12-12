diff --git a/components/camel-csv/src/main/java/org/apache/camel/dataformat/csv/CsvDataFormat.java b/components/camel-csv/src/main/java/org/apache/camel/dataformat/csv/CsvDataFormat.java
index 5473049..fbc0a80 100644
--- a/components/camel-csv/src/main/java/org/apache/camel/dataformat/csv/CsvDataFormat.java
+++ b/components/camel-csv/src/main/java/org/apache/camel/dataformat/csv/CsvDataFormat.java
@@ -46,7 +46,7 @@
         Map map = ExchangeHelper.convertToMandatoryType(exchange, Map.class, object);
         OutputStreamWriter out = new OutputStreamWriter(outputStream);
         try {
-            CSVConfig conf = createConfig();
+            CSVConfig conf = getConfig();
             // lets add fields
             Set set = map.keySet();
             for (Object value : set) {
