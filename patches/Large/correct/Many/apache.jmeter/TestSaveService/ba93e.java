diff --git a/test/src/org/apache/jmeter/save/TestSaveService.java b/test/src/org/apache/jmeter/save/TestSaveService.java
index 263c2c2..574c5f1 100644
--- a/test/src/org/apache/jmeter/save/TestSaveService.java
+++ b/test/src/org/apache/jmeter/save/TestSaveService.java
@@ -96,7 +96,7 @@
             failed |= loadAndSave(testFile, fileName, true);
         }
         for (int i = 0; i < FILES_LINES.length; i++) {
-            final String fileName = FILES[i];
+            final String fileName = FILES_LINES[i];
             final File testFile = findTestFile("testfiles/" + fileName);
             failed |= loadAndSave(testFile, fileName, false);
         }
