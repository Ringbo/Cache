diff --git a/ExtendedApi/src/com/intellij/testFramework/LightCodeInsightTestCase.java b/ExtendedApi/src/com/intellij/testFramework/LightCodeInsightTestCase.java
index 5faaf3c..60bcb81 100644
--- a/ExtendedApi/src/com/intellij/testFramework/LightCodeInsightTestCase.java
+++ b/ExtendedApi/src/com/intellij/testFramework/LightCodeInsightTestCase.java
@@ -222,7 +222,7 @@
     assertTrue(getMessage("Cannot find file " + fullPath, message), ioFile.exists());
     String fileText = null;
     try {
-      fileText = new String(FileUtil.loadFileText(ioFile));
+      fileText = new String(FileUtil.loadFileText(ioFile, "UTF-8"));
     } catch (IOException e) {
       LOG.error(e);
     }
