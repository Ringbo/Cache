diff --git a/components/camel-bindy/src/main/java/org/apache/camel/dataformat/bindy/fixed/BindyFixedLengthDataFormat.java b/components/camel-bindy/src/main/java/org/apache/camel/dataformat/bindy/fixed/BindyFixedLengthDataFormat.java
index afb0c96..180b982 100644
--- a/components/camel-bindy/src/main/java/org/apache/camel/dataformat/bindy/fixed/BindyFixedLengthDataFormat.java
+++ b/components/camel-bindy/src/main/java/org/apache/camel/dataformat/bindy/fixed/BindyFixedLengthDataFormat.java
@@ -103,7 +103,7 @@
         
         // add the footer if it is in the exchange header
         Map<String, Object> footerRow = (Map<String, Object>) exchange.getIn().getHeader(CAMEL_BINDY_FIXED_LENGTH_FOOTER);
-        if (headerRow != null) {
+        if (footerRow != null) {
             models.add(models.size(), footerRow);
         }
 
