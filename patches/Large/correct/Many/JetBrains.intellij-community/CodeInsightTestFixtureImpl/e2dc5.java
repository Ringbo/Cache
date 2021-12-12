diff --git a/source/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java b/source/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java
index 1f3b564..8ebe2a0 100644
--- a/source/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java
+++ b/source/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java
@@ -275,7 +275,7 @@
   protected void configureByFile(@NonNls String filePath) throws IOException {
     String fullPath = getTempDirPath() + "/" + filePath;
 
-    final VirtualFile copy = LocalFileSystem.getInstance().findFileByPath(fullPath.replace(File.separatorChar, '/'));
+    final VirtualFile copy = LocalFileSystem.getInstance().refreshAndFindFileByPath(fullPath.replace(File.separatorChar, '/'));
     assert copy != null: "file " + fullPath + " not found";
 
     SelectionAndCaretMarkupLoader loader = new SelectionAndCaretMarkupLoader(copy.getPath());
