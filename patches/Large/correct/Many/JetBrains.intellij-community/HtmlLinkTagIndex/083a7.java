diff --git a/xml/impl/src/com/intellij/html/HtmlLinkTagIndex.java b/xml/impl/src/com/intellij/html/HtmlLinkTagIndex.java
index cb3d0a7..5de26fc 100644
--- a/xml/impl/src/com/intellij/html/HtmlLinkTagIndex.java
+++ b/xml/impl/src/com/intellij/html/HtmlLinkTagIndex.java
@@ -192,7 +192,7 @@
       @NotNull
       public Map<Integer, InfoHolder<LinkInfo>> map(final FileContent inputData) {
         final VirtualFile file = inputData.getFile();
-        final int id = FileBasedIndex.getFileId(file);
+        final int id = Math.abs(FileBasedIndex.getFileId(file));
         final Language language = ((LanguageFileType)file.getFileType()).getLanguage();
 
         final List<LinkInfo> result = new ArrayList<LinkInfo>();
@@ -395,7 +395,7 @@
   }
 
   public int getVersion() {
-    return 3;
+    return 4;
   }
 
   public int getCacheSize() {
