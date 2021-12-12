diff --git a/java/org/apache/catalina/servlets/DefaultServlet.java b/java/org/apache/catalina/servlets/DefaultServlet.java
index 0c68cc8..0533910 100644
--- a/java/org/apache/catalina/servlets/DefaultServlet.java
+++ b/java/org/apache/catalina/servlets/DefaultServlet.java
@@ -387,7 +387,7 @@
         throws IOException, ServletException {
 
         // Serve the requested resource, including the data content
-        serveResource(request, response, true);
+        serveResource(request, response, true, fileEncoding);
 
     }
 
@@ -407,7 +407,7 @@
         throws IOException, ServletException {
 
         // Serve the requested resource, without the data content
-        serveResource(request, response, false);
+        serveResource(request, response, false, fileEncoding);
 
     }
 
@@ -667,13 +667,16 @@
      * @param request The servlet request we are processing
      * @param response The servlet response we are creating
      * @param content Should the content be included?
+     * @param encoding The encoding to use if it is necessary to access the
+     *                 source as characters rather than as bytes
      *
      * @exception IOException if an input/output error occurs
      * @exception ServletException if a servlet-specified error occurs
      */
     protected void serveResource(HttpServletRequest request,
                                  HttpServletResponse response,
-                                 boolean content)
+                                 boolean content,
+                                 String encoding)
         throws IOException, ServletException {
 
         boolean serveContent = content;
@@ -877,7 +880,7 @@
                             contentLength, null))
                         copy(resource, renderResult, ostream);
                 } else {
-                    copy(resource, renderResult, writer);
+                    copy(resource, renderResult, writer, encoding);
                 }
             }
 
@@ -1764,11 +1767,12 @@
      * @param resource  The source resource
      * @param is        The input stream to read the source resource from
      * @param writer    The writer to write to
+     * @param encoding  The encoding to use when reading the source input stream
      *
      * @exception IOException if an input/output error occurs
      */
-    protected void copy(WebResource resource, InputStream is, PrintWriter writer)
-            throws IOException {
+    protected void copy(WebResource resource, InputStream is, PrintWriter writer,
+            String encoding) throws IOException {
 
         IOException exception = null;
 
@@ -1780,11 +1784,10 @@
         }
 
         Reader reader;
-        if (fileEncoding == null) {
+        if (encoding == null) {
             reader = new InputStreamReader(resourceInputStream);
         } else {
-            reader = new InputStreamReader(resourceInputStream,
-                                           fileEncoding);
+            reader = new InputStreamReader(resourceInputStream, encoding);
         }
 
         // Copy the input stream to the output stream
