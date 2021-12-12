diff --git a/test/src/org/apache/jmeter/save/TestCSVSaveService.java b/test/src/org/apache/jmeter/save/TestCSVSaveService.java
index 0caf0f8..98d893e 100644
--- a/test/src/org/apache/jmeter/save/TestCSVSaveService.java
+++ b/test/src/org/apache/jmeter/save/TestCSVSaveService.java
@@ -173,7 +173,7 @@
         result.setThreadName("6");
         result.setDataType("7");
         result.setSuccessful(true);
-        result.setBytes(8);
+        result.setBytes(8L);
         result.setSentBytes(9);
         result.setGroupThreads(10);
         result.setAllThreads(11);
