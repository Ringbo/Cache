diff --git a/java/org/apache/jasper/servlet/JspCServletContext.java b/java/org/apache/jasper/servlet/JspCServletContext.java
index b71fabe..caf8a2f 100644
--- a/java/org/apache/jasper/servlet/JspCServletContext.java
+++ b/java/org/apache/jasper/servlet/JspCServletContext.java
@@ -369,9 +369,9 @@
      *
      * @deprecated This method has been deprecated with no replacement
      */
-    public Enumeration<String> getServlets() {
+    public Enumeration<Servlet> getServlets() {
 
-        return (new Vector<String>().elements());
+        return (new Vector<Servlet>().elements());
 
     }
 
