diff --git a/idea/tests/org/jetbrains/jet/resolve/ExtensibleResolveTestCase.java b/idea/tests/org/jetbrains/jet/resolve/ExtensibleResolveTestCase.java
index ae0e934..90ec4c6 100644
--- a/idea/tests/org/jetbrains/jet/resolve/ExtensibleResolveTestCase.java
+++ b/idea/tests/org/jetbrains/jet/resolve/ExtensibleResolveTestCase.java
@@ -34,7 +34,7 @@
     protected void setUp() throws Exception {
         super.setUp();
         expectedResolveData = getExpectedResolveData();
-        ((DaemonCodeAnalyzerImpl) DaemonCodeAnalyzer.getInstance(getProject())).prepareForTest(true);
+        ((DaemonCodeAnalyzerImpl) DaemonCodeAnalyzer.getInstance(getProject())).prepareForTest();
         DaemonCodeAnalyzerSettings.getInstance().setImportHintEnabled(false);
     }
 
@@ -42,7 +42,7 @@
 
     @Override
     protected void tearDown() throws Exception {
-        ((DaemonCodeAnalyzerImpl) DaemonCodeAnalyzer.getInstance(getProject())).cleanupAfterTest(); // has to cleanup by hand since light project does not get disposed any time soon
+        ((DaemonCodeAnalyzerImpl) DaemonCodeAnalyzer.getInstance(getProject())).cleanupAfterTest(false); // has to cleanup by hand since light project does not get disposed any time soon
         super.tearDown();
     }
 
