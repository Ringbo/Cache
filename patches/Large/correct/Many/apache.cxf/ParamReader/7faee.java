diff --git a/rt/wsdl/src/main/java/org/apache/cxf/wsdl/service/factory/ParamReader.java b/rt/wsdl/src/main/java/org/apache/cxf/wsdl/service/factory/ParamReader.java
index 7b86b8e..2bdaa8f 100644
--- a/rt/wsdl/src/main/java/org/apache/cxf/wsdl/service/factory/ParamReader.java
+++ b/rt/wsdl/src/main/java/org/apache/cxf/wsdl/service/factory/ParamReader.java
@@ -54,7 +54,7 @@
      * @param c
      * @throws IOException
      */
-    public ParamReader(Class<?> c) throws IOException {
+    ParamReader(Class<?> c) throws IOException {
         this(getBytes(c));
     }
 
@@ -64,7 +64,7 @@
      * @param b
      * @throws IOException
      */
-    public ParamReader(byte[] b) throws IOException {
+    ParamReader(byte[] b) throws IOException {
         super(b, findAttributeReaders(ParamReader.class));
 
         // check the magic number
@@ -111,7 +111,7 @@
      * Retrieve a list of function parameter names from a method Returns null if
      * unable to read parameter names (i.e. bytecode not built with debug).
      */
-    public static String[] getParameterNamesFromDebugInfo(Method method) {
+    static String[] getParameterNamesFromDebugInfo(Method method) {
         // Don't worry about it if there are no params.
         int numParams = method.getParameterTypes().length;
         if (numParams == 0) {
