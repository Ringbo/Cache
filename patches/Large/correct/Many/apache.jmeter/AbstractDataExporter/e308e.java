diff --git a/src/core/org/apache/jmeter/report/dashboard/AbstractDataExporter.java b/src/core/org/apache/jmeter/report/dashboard/AbstractDataExporter.java
index 2bc1eb4..da5c4d9 100644
--- a/src/core/org/apache/jmeter/report/dashboard/AbstractDataExporter.java
+++ b/src/core/org/apache/jmeter/report/dashboard/AbstractDataExporter.java
@@ -45,11 +45,13 @@
      *            the name of the data containing the value
      * @param root
      *            the root of the tree
+     * @param <T>
+     *            type of value to be found
      * @return the value matching the data name
      */
-    protected static <TValue> TValue findValue(Class<TValue> clazz, String data,
+    protected static <T> T findValue(Class<T> clazz, String data,
             ResultData root) {
-        TValue value = null;
+        T value = null;
         ResultData result = findData(data, root);
         if (result instanceof ValueResultData) {
             ValueResultData valueResult = (ValueResultData) result;
