diff --git a/java/org/apache/tomcat/util/http/LegacyCookieProcessor.java b/java/org/apache/tomcat/util/http/LegacyCookieProcessor.java
index 8cde8b1..72420c3 100644
--- a/java/org/apache/tomcat/util/http/LegacyCookieProcessor.java
+++ b/java/org/apache/tomcat/util/http/LegacyCookieProcessor.java
@@ -184,7 +184,7 @@
             if (allowHttpSepsInV0) {
                 allowedWithoutQuotes.set(sep);
             } else {
-                allowedWithoutQuotes.clear();
+                allowedWithoutQuotes.clear(sep);
             }
         }
         if (getForwardSlashIsSeparator() && !allowHttpSepsInV0) {
