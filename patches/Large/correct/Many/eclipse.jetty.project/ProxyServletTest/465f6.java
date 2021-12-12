diff --git a/jetty-proxy/src/test/java/org/eclipse/jetty/proxy/ProxyServletTest.java b/jetty-proxy/src/test/java/org/eclipse/jetty/proxy/ProxyServletTest.java
index 669142b..d21ec4f 100644
--- a/jetty-proxy/src/test/java/org/eclipse/jetty/proxy/ProxyServletTest.java
+++ b/jetty-proxy/src/test/java/org/eclipse/jetty/proxy/ProxyServletTest.java
@@ -694,7 +694,7 @@
     {
         final String target = "/test";
         final String query = "a=1&b=2&c=1234%205678&d=hello+world";
-        prepareServer(new HttpServlet()
+        startServer(new HttpServlet()
         {
             @Override
             protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
