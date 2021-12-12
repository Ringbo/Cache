diff --git a/java/org/apache/coyote/http11/Http11NioProcessor.java b/java/org/apache/coyote/http11/Http11NioProcessor.java
index 9d9a442..506cfd8 100644
--- a/java/org/apache/coyote/http11/Http11NioProcessor.java
+++ b/java/org/apache/coyote/http11/Http11NioProcessor.java
@@ -1159,7 +1159,7 @@
             outputBuffer.addActiveFilter(outputFilters[Constants.GZIP_FILTER]);
             headers.setValue("Content-Encoding").setString("gzip");
             // Make Proxies happy via Vary (from mod_deflate)
-            headers.setValue("Vary").setString("Accept-Encoding");
+            headers.addValue("Vary").setString("Accept-Encoding");
         }
 
         // Add date header
