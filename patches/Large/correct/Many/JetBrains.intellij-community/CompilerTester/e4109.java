diff --git a/java/testFramework/src/com/intellij/testFramework/CompilerTester.java b/java/testFramework/src/com/intellij/testFramework/CompilerTester.java
index 00780b9..a3c05c6 100644
--- a/java/testFramework/src/com/intellij/testFramework/CompilerTester.java
+++ b/java/testFramework/src/com/intellij/testFramework/CompilerTester.java
@@ -232,7 +232,7 @@
           CompilerMessage[] messages = compileContext.getMessages(category);
           for (CompilerMessage message : messages) {
             final String text = message.getMessage();
-            if (category != CompilerMessageCategory.INFORMATION || !(text.startsWith("Compilation completed successfully") || text.startsWith("Using javac"))) {
+            if (category != CompilerMessageCategory.INFORMATION || !(text.contains("Compilation completed successfully") || text.startsWith("Using javac"))) {
               myMessages.add(message);
             }
           }
