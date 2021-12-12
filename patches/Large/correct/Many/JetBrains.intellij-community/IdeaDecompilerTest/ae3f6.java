diff --git a/plugins/java-decompiler/test/org/jetbrains/java/decompiler/IdeaDecompilerTest.java b/plugins/java-decompiler/test/org/jetbrains/java/decompiler/IdeaDecompilerTest.java
index 2f900d5..9f263f6 100644
--- a/plugins/java-decompiler/test/org/jetbrains/java/decompiler/IdeaDecompilerTest.java
+++ b/plugins/java-decompiler/test/org/jetbrains/java/decompiler/IdeaDecompilerTest.java
@@ -68,7 +68,7 @@
     try {
       CharSequence text = new IdeaDecompiler().getText(file);
       assertNotNull(text);
-      String expected = FileUtil.loadFile(new File(name + ".txt"));
+      String expected = FileUtil.loadFile(new File(name + ".txt"), "UTF-8");
       assertEquals(StringUtil.convertLineSeparators(expected), text.toString());
     }
     catch (IOException e) {
