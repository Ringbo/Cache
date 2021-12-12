diff --git a/src/fitnesse/wiki/fs/FileSystemPageFactory.java b/src/fitnesse/wiki/fs/FileSystemPageFactory.java
index ea454bb..09100eb 100644
--- a/src/fitnesse/wiki/fs/FileSystemPageFactory.java
+++ b/src/fitnesse/wiki/fs/FileSystemPageFactory.java
@@ -20,7 +20,7 @@
  * For historic reasons it's still called FileSystemPageFactory, although it deals with all
  * file based page types (FileSystemPage, WikiFilePage, ExternalSuitePage).
  */
-public class FileSystemPageFactory implements WikiPageFactory<WikiPage>, WikiPageFactoryRegistry {
+public class FileSystemPageFactory implements WikiPageFactory, WikiPageFactoryRegistry {
   private final FileSystem fileSystem;
   private final VersionsController versionsController;
   private final List<WikiPageFactory> wikiPageFactories = new ArrayList<>();
@@ -91,10 +91,10 @@
   /**
    * This is the class that does the sole handling of FileSystemPages
    */
-  protected class InnerFileSystemPageFactory implements WikiPageFactory<FileBasedWikiPage> {
+  protected class InnerFileSystemPageFactory implements WikiPageFactory {
 
     @Override
-    public WikiPage makePage(final File path, final String pageName, final FileBasedWikiPage parent, final VariableSource variableSource) {
+    public WikiPage makePage(final File path, final String pageName, final WikiPage parent, final VariableSource variableSource) {
       Maybe<String> rootPath = variableSource.findVariable("FITNESSE_ROOTPATH");
       return new FileSystemPage(path, pageName, parent, null, versionsController,
         new FileSystemSubWikiPageFactory(new File(rootPath.getValue()), fileSystem, variableSource, FileSystemPageFactory.this),
@@ -111,7 +111,7 @@
     }
   }
 
-  protected class WikiFilePageFactory implements WikiPageFactory<WikiPage> {
+  protected class WikiFilePageFactory implements WikiPageFactory {
     @Override
     public WikiPage makePage(final File path, final String pageName, final WikiPage parent, final VariableSource variableSource) {
       Maybe<String> rootPath = variableSource.findVariable("FITNESSE_ROOTPATH");
@@ -127,7 +127,7 @@
     }
   }
 
-  protected class RootWikiFilePageFactory implements WikiPageFactory<WikiPage> {
+  protected class RootWikiFilePageFactory implements WikiPageFactory {
     @Override
     public WikiPage makePage(final File path, final String pageName, final WikiPage parent, final VariableSource variableSource) {
       Maybe<String> rootPath = variableSource.findVariable("FITNESSE_ROOTPATH");
