diff --git a/idea/tests/org/jetbrains/jet/plugin/refactoring/changeSignature/JetChangeSignatureTest.java b/idea/tests/org/jetbrains/jet/plugin/refactoring/changeSignature/JetChangeSignatureTest.java
index 68485f6..cc5b44b 100644
--- a/idea/tests/org/jetbrains/jet/plugin/refactoring/changeSignature/JetChangeSignatureTest.java
+++ b/idea/tests/org/jetbrains/jet/plugin/refactoring/changeSignature/JetChangeSignatureTest.java
@@ -217,7 +217,7 @@
             List<String> messages = new ArrayList<String>(e.getMessages());
             Collections.sort(messages);
             File conflictsFile = new File(getTestDataPath() + getTestName(false) + "Messages.txt");
-            String fileText = FileUtil.loadFile(conflictsFile, CharsetToolkit.UTF8);
+            String fileText = FileUtil.loadFile(conflictsFile, CharsetToolkit.UTF8, true);
             assertEquals(fileText, StringUtil.join(messages, "\n"));
             return;
         }
