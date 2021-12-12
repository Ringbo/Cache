diff --git a/java/org/apache/catalina/connector/Request.java b/java/org/apache/catalina/connector/Request.java
index 6c4f697..f713edb 100644
--- a/java/org/apache/catalina/connector/Request.java
+++ b/java/org/apache/catalina/connector/Request.java
@@ -1895,7 +1895,7 @@
         //and normalized candidate path is the same as the canonical path.
         String candidate = uri.substring(0, pos);
         if (pos > 0) {
-            candidate = UDecoder.URLDecode(candidate);
+            candidate = UDecoder.URLDecode(candidate, connector.getURIEncoding());
             candidate = org.apache.tomcat.util.http.RequestUtil.normalize(candidate);
         }
         while (!canonicalContextPath.equals(candidate)) {
@@ -1904,7 +1904,7 @@
                 return uri;
             }
             candidate = uri.substring(0, pos);
-            candidate = UDecoder.URLDecode(candidate);
+            candidate = UDecoder.URLDecode(candidate, connector.getURIEncoding());
             candidate = org.apache.tomcat.util.http.RequestUtil.normalize(candidate);
         }
         return uri.substring(0, pos);
