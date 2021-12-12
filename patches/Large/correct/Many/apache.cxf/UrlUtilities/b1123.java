diff --git a/rt/core/src/main/java/org/apache/cxf/transport/http/UrlUtilities.java b/rt/core/src/main/java/org/apache/cxf/transport/http/UrlUtilities.java
index 9cdf420..243b6c4 100644
--- a/rt/core/src/main/java/org/apache/cxf/transport/http/UrlUtilities.java
+++ b/rt/core/src/main/java/org/apache/cxf/transport/http/UrlUtilities.java
@@ -61,11 +61,11 @@
      */
     public static String getStem(String baseURI) {
         URI uri = URI.create(baseURI);
-        baseURI = uri.getPath();
+        baseURI = uri.getRawPath();
         int idx = baseURI.lastIndexOf('/');
         if (idx != -1) {
             baseURI = baseURI.substring(0, idx);
         }
-        return baseURI;
+        return URI.create(baseURI).getPath();
     }
 }
