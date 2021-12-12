diff --git a/java/org/apache/tomcat/ContextBind.java b/java/org/apache/tomcat/ContextBind.java
index a294a5b..ab9a1d7 100644
--- a/java/org/apache/tomcat/ContextBind.java
+++ b/java/org/apache/tomcat/ContextBind.java
@@ -23,9 +23,9 @@
      * class loader. If no web application class loader is defined, or if the
      * current thread is already using the web application class loader then no
      * change will be made. If the class loader is changed and a
-     * {@link ThreadBindingListener} is configured then
-     * {@link ThreadBindingListener#bind()} will be called after the change has
-     * been made.
+     * {@link org.apache.catalina.ThreadBindingListener} is configured then
+     * {@link org.apache.catalina.ThreadBindingListener#bind()} will be called
+     * after the change has been made.
      *
      * @param usePrivilegedAction
      *          Should a {@link java.security.PrivilegedAction} be used when
@@ -39,14 +39,15 @@
      *         the thread context class loader in use when the method was
      *         called. If no change was made then this method returns null.
      */
-    public ClassLoader bind(boolean usePrivilegedAction, ClassLoader originalClassLoader);
+    ClassLoader bind(boolean usePrivilegedAction, ClassLoader originalClassLoader);
 
     /**
      * Restore the current thread context class loader to the original class
      * loader in used before {@link #bind(boolean, ClassLoader)} was called. If
      * no original class loader is passed to this method then no change will be
-     * made. If the class loader is changed and a {@link ThreadBindingListener}
-     * is configured then {@link ThreadBindingListener#unbind()} will be called
+     * made. If the class loader is changed and a
+     * {@link org.apache.catalina.ThreadBindingListener} is configured then
+     * {@link org.apache.catalina.ThreadBindingListener#unbind()} will be called
      * before the change is made.
      *
      * @param usePrivilegedAction
@@ -55,6 +56,5 @@
      * @param originalClassLoader
      *          The class loader to restore as the thread context class loader
      */
-    public void unbind(boolean usePrivilegedAction, ClassLoader originalClassLoader);
-
+    void unbind(boolean usePrivilegedAction, ClassLoader originalClassLoader);
 }
