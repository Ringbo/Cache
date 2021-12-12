diff --git a/java/org/apache/jasper/servlet/JspServletWrapper.java b/java/org/apache/jasper/servlet/JspServletWrapper.java
index 2b0d934..2f92446 100644
--- a/java/org/apache/jasper/servlet/JspServletWrapper.java
+++ b/java/org/apache/jasper/servlet/JspServletWrapper.java
@@ -79,11 +79,13 @@
     private ServletConfig config;
     private Options options;
     private boolean firstTime = true;
-    private boolean reload = true;
+    /** Whether the servlet needs reloading on next access */
+    private volatile boolean reload = true;
     private boolean isTagFile;
     private int tripCount;
     private JasperException compileException;
-    private long servletClassLastModifiedTime;
+    /** Timestamp of last time servlet resource was modified */
+    private volatile long servletClassLastModifiedTime;
     private long lastModificationTest = 0L;
     private Entry<JspServletWrapper> ticket;
 
@@ -131,6 +133,9 @@
     }
 
     public Servlet getServlet() throws ServletException {
+        // DCL on 'reload' requires that 'reload' be volatile
+        // (this also forces a read memory barrier, ensuring the 
+        // new servlet object is read consistently)
         if (reload) {
             synchronized (this) {
                 // Synchronizing on jsw enables simultaneous loading
@@ -139,7 +144,7 @@
                     // This is to maintain the original protocol.
                     destroy();
                     
-                    Servlet servlet = null;
+                    final Servlet servlet;
 
                     try {
                         InstanceManager instanceManager = InstanceManagerFactory.getInstanceManager(config);
@@ -160,6 +165,7 @@
 
                     theServlet = servlet;
                     reload = false;
+                    // Volatile 'reload' forces in order write of 'theServlet' and new servlet object
                 }
             }    
         }
@@ -186,6 +192,9 @@
      * @param lastModified Last-modified time of servlet class
      */
     public void setServletClassLastModifiedTime(long lastModified) {
+        // DCL requires servletClassLastModifiedTime be volatile
+        // to force read and write barriers on access/set
+        // (and to get atomic write of long)
         if (this.servletClassLastModifiedTime < lastModified) {
             synchronized (this) {
                 if (this.servletClassLastModifiedTime < lastModified) {
