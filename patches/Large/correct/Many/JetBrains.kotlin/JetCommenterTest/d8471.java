diff --git a/idea/tests/org/jetbrains/jet/editor/JetCommenterTest.java b/idea/tests/org/jetbrains/jet/editor/JetCommenterTest.java
index 967ef96..fd630cf 100644
--- a/idea/tests/org/jetbrains/jet/editor/JetCommenterTest.java
+++ b/idea/tests/org/jetbrains/jet/editor/JetCommenterTest.java
@@ -43,11 +43,11 @@
     }
 
     private void configure() throws Exception {
-        configureFromFileText("a.kt", loadFile(getTestName(false) + ".kt"));
+        configureFromFileText("a.kt", loadFile(getTestName(true) + ".kt"));
     }
 
     private void check() throws Exception {
-        checkResultByText(loadFile(getTestName(false) + "_after.kt"));
+        checkResultByText(loadFile(getTestName(true) + "_after.kt"));
     }
 
     protected static String loadFile(String name) throws Exception {
