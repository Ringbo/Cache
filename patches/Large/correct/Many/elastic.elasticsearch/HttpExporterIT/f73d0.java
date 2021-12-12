diff --git a/plugin/src/test/java/org/elasticsearch/xpack/monitoring/exporter/http/HttpExporterIT.java b/plugin/src/test/java/org/elasticsearch/xpack/monitoring/exporter/http/HttpExporterIT.java
index 3baffba..d922b70 100644
--- a/plugin/src/test/java/org/elasticsearch/xpack/monitoring/exporter/http/HttpExporterIT.java
+++ b/plugin/src/test/java/org/elasticsearch/xpack/monitoring/exporter/http/HttpExporterIT.java
@@ -139,7 +139,7 @@
 
     public void testExportWithHeaders() throws Exception {
         final String headerValue = randomAlphaOfLengthBetween(3, 9);
-        final String[] array = generateRandomStringArray(2, 4, false);
+        final String[] array = generateRandomStringArray(2, 4, false, false);
 
         final Map<String, String[]> headers = new HashMap<>();
 
@@ -176,7 +176,7 @@
         final boolean useHeaders = randomBoolean();
 
         final String headerValue = randomAlphaOfLengthBetween(3, 9);
-        final String[] array = generateRandomStringArray(2, 4, false);
+        final String[] array = generateRandomStringArray(2, 4, false, false);
 
         final Map<String, String[]> headers = new HashMap<>();
 
