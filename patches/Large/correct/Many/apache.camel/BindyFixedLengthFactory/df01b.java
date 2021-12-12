diff --git a/components/camel-bindy/src/main/java/org/apache/camel/dataformat/bindy/BindyFixedLengthFactory.java b/components/camel-bindy/src/main/java/org/apache/camel/dataformat/bindy/BindyFixedLengthFactory.java
index f7d889f..fc3e0f3 100644
--- a/components/camel-bindy/src/main/java/org/apache/camel/dataformat/bindy/BindyFixedLengthFactory.java
+++ b/components/camel-bindy/src/main/java/org/apache/camel/dataformat/bindy/BindyFixedLengthFactory.java
@@ -563,7 +563,7 @@
                 LOG.debug("Carriage return defined for the CSV: {}", crlf);
                 
                 eol = record.eol();
-                LOG.debug("EOL(end-of-line) defined for the CSV: {}", crlf);
+                LOG.debug("EOL(end-of-line) defined for the CSV: {}", eol);
 
                 // Get header parameter
                 header =  record.header();
