diff --git a/src/fitnesse/wiki/fs/FileSystemPage.java b/src/fitnesse/wiki/fs/FileSystemPage.java
index f1f7142..ae3f9cd 100644
--- a/src/fitnesse/wiki/fs/FileSystemPage.java
+++ b/src/fitnesse/wiki/fs/FileSystemPage.java
@@ -50,11 +50,11 @@
   }
 
   private FileSystemPage(FileSystemPage page, String versionName) {
-    this(page.getFileSystemPath(), page.getName(), (FileSystemPage) (page.isRoot() ? null : page.getParent()), versionName,
+    this(page.getFileSystemPath(), page.getName(), (page.isRoot() ? null : page.getParent()), versionName,
             page.versionsController, page.subWikiPageFactory, page.getVariableSource());
   }
 
-  protected FileSystemPage(final File path, final String name, final FileBasedWikiPage parent, final String versionName,
+  protected FileSystemPage(final File path, final String name, final WikiPage parent, final String versionName,
                          final VersionsController versionsController, final SubWikiPageFactory subWikiPageFactory,
                          final VariableSource variableSource) {
     super(name, parent, variableSource);
