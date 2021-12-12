diff --git a/src/core/org/apache/jmeter/report/core/Sample.java b/src/core/org/apache/jmeter/report/core/Sample.java
index ef1583a..e427447 100644
--- a/src/core/org/apache/jmeter/report/core/Sample.java
+++ b/src/core/org/apache/jmeter/report/core/Sample.java
@@ -203,9 +203,9 @@
      * @throws NumberFormatException
      *             if the data could not be parsed as a double
      */
-    public double getDouble(String name) {
+    public Double getDouble(String name) {
         try {
-            return Double.parseDouble(data[metadata.indexOf(name)]);
+            return Double.valueOf(data[metadata.indexOf(name)]);
         } catch (NumberFormatException ex) {
             throw new SampleException("Error on sample #" + row, ex);
         }
