diff --git a/java/org/apache/coyote/http11/Http11AprProcessor.java b/java/org/apache/coyote/http11/Http11AprProcessor.java
index a53076b..6d73e6e 100644
--- a/java/org/apache/coyote/http11/Http11AprProcessor.java
+++ b/java/org/apache/coyote/http11/Http11AprProcessor.java
@@ -1660,7 +1660,7 @@
             outputBuffer.addActiveFilter(outputFilters[Constants.GZIP_FILTER]);
             headers.setValue("Content-Encoding").setString("gzip");
             // Make Proxies happy via Vary (from mod_deflate)
-            headers.setValue("Vary").setString("Accept-Encoding");
+            headers.addValue("Vary").setString("Accept-Encoding");
         }
 
         // Add date header
