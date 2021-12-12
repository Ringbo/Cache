diff --git a/src/java/org/jivesoftware/openfire/http/HttpBindServlet.java b/src/java/org/jivesoftware/openfire/http/HttpBindServlet.java
index bfe4970..d587338 100644
--- a/src/java/org/jivesoftware/openfire/http/HttpBindServlet.java
+++ b/src/java/org/jivesoftware/openfire/http/HttpBindServlet.java
@@ -98,9 +98,9 @@
             sendLegacyError(response, BoshBindingError.badRequest);
             return;
         }
-        queryString = URLDecoder.decode(queryString, "utf-8");
+        queryString = URLDecoder.decode(queryString, "UTF-8");
 
-        parseDocument(request, response, new ByteArrayInputStream(queryString.getBytes()));
+        parseDocument(request, response, new ByteArrayInputStream(queryString.getBytes("UTF-8")));
     }
 
     private void sendLegacyError(HttpServletResponse response, BoshBindingError error)
