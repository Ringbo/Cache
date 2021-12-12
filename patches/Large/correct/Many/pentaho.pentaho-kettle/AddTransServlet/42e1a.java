diff --git a/src/org/pentaho/di/www/AddTransServlet.java b/src/org/pentaho/di/www/AddTransServlet.java
index e86ffd9..01c8e59 100644
--- a/src/org/pentaho/di/www/AddTransServlet.java
+++ b/src/org/pentaho/di/www/AddTransServlet.java
@@ -83,11 +83,11 @@
         try
         {
             // First read the complete transformation in memory from the request
-            StringBuffer xml = new StringBuffer();
+            StringBuilder xml = new StringBuilder(request.getContentLength());
             String line;
             while ((line = in.readLine()) != null)
             {
-                xml.append(line);
+                xml.append(line).append(Const.CR);
             }
             
             // Parse the XML, create a transformation configuration
