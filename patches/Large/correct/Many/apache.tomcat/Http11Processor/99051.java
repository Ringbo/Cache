diff --git a/java/org/apache/coyote/http11/Http11Processor.java b/java/org/apache/coyote/http11/Http11Processor.java
index 37c0df8..9df0ac7 100644
--- a/java/org/apache/coyote/http11/Http11Processor.java
+++ b/java/org/apache/coyote/http11/Http11Processor.java
@@ -815,7 +815,7 @@
             outputBuffer.addActiveFilter(outputFilters[Constants.GZIP_FILTER]);
             headers.setValue("Content-Encoding").setString("gzip");
             // Make Proxies happy via Vary (from mod_deflate)
-            headers.setValue("Vary").setString("Accept-Encoding");
+            headers.addValue("Vary").setString("Accept-Encoding");
         }
 
         // Add date header
