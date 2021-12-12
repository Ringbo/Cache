diff --git a/src/core/org/apache/jmeter/NewDriver.java b/src/core/org/apache/jmeter/NewDriver.java
index 60b7a07..3b36d1d 100644
--- a/src/core/org/apache/jmeter/NewDriver.java
+++ b/src/core/org/apache/jmeter/NewDriver.java
@@ -306,7 +306,7 @@
 
     private static boolean shouldBeHeadless(String[] args) {
         for (String arg : args) {
-            if("-n".equals(arg) || "-s".equals(arg)) {
+            if("-n".equals(arg) || "-s".equals(arg) || "-g".equals(arg)) {
                 return true;
             }
         }
