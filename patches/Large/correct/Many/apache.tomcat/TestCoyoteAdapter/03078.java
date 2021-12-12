diff --git a/test/org/apache/catalina/connector/TestCoyoteAdapter.java b/test/org/apache/catalina/connector/TestCoyoteAdapter.java
index 521bd49..0b4e070 100644
--- a/test/org/apache/catalina/connector/TestCoyoteAdapter.java
+++ b/test/org/apache/catalina/connector/TestCoyoteAdapter.java
@@ -255,7 +255,7 @@
 
         private static final long serialVersionUID = 1L;
 
-        private String pathInfo = null;
+        private volatile String pathInfo = null;
 
         public String getPathInfo() {
             return pathInfo;
@@ -265,7 +265,8 @@
         protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                 throws ServletException, IOException {
 
-            // Not thread safe
+            // Not thread safe. Concurrent requests to this servlet will
+            // over-write all the results but the last processed.
             pathInfo = req.getPathInfo();
         }
     }
