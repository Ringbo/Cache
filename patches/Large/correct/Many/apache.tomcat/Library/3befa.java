diff --git a/java/org/apache/tomcat/jni/Library.java b/java/org/apache/tomcat/jni/Library.java
index c1e717e..295e5d6 100644
--- a/java/org/apache/tomcat/jni/Library.java
+++ b/java/org/apache/tomcat/jni/Library.java
@@ -162,10 +162,13 @@
      * Setup any APR internal data structures.  This MUST be the first function
      * called for any APR library.
      * @param libraryName the name of the library to load
+     *
+     * @return {@code true} if the native code was initialized successfully
+     *         otherwise {@code false}
+     *
+     * @throws Exception if a problem occurred during initialization
      */
-    public static boolean initialize(String libraryName)
-        throws Exception
-    {
+    public synchronized static boolean initialize(String libraryName) throws Exception {
         if (_instance == null) {
             if (libraryName == null)
                 _instance = new Library();
