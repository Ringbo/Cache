diff --git a/src/java/org/jivesoftware/wildfire/http/HttpBindManager.java b/src/java/org/jivesoftware/wildfire/http/HttpBindManager.java
index 93f94b6..72c1745 100644
--- a/src/java/org/jivesoftware/wildfire/http/HttpBindManager.java
+++ b/src/java/org/jivesoftware/wildfire/http/HttpBindManager.java
@@ -171,7 +171,7 @@
      */
     public Map<HttpServlet, String> getServlets() {
         Map<HttpServlet, String> servlets = new HashMap<HttpServlet, String>();
-        servlets.put(new JavaScriptServlet(), "/http-bind/js/");
+        servlets.put(new ResourceServlet(), "/http-bind/js/");
 
         return servlets;
     }
