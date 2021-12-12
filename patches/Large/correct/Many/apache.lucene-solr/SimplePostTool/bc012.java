diff --git a/solr/core/src/java/org/apache/solr/util/SimplePostTool.java b/solr/core/src/java/org/apache/solr/util/SimplePostTool.java
index 8b03cdc..868cf63 100644
--- a/solr/core/src/java/org/apache/solr/util/SimplePostTool.java
+++ b/solr/core/src/java/org/apache/solr/util/SimplePostTool.java
@@ -111,7 +111,7 @@
   private int currentDepth;
 
   static HashMap<String,String> mimeMap;
-  GlobFileFilter globFileFilter;
+  FileFilter fileFilter;
   // Backlog for crawling
   List<LinkedHashSet<URL>> backlog = new ArrayList<>();
   Set<URL> visited = new HashSet<>();
@@ -286,7 +286,7 @@
     this.recursive = recursive;
     this.delay = delay;
     this.fileTypes = fileTypes;
-    this.globFileFilter = getFileFilterFromFileTypes(fileTypes);
+    this.fileFilter = getFileFilterFromFileTypes(fileTypes);
     this.out = out;
     this.commit = commit;
     this.optimize = optimize;
@@ -487,9 +487,9 @@
   private int postDirectory(File dir, OutputStream out, String type) {
     if(dir.isHidden() && !dir.getName().equals("."))
       return(0);
-    info("Indexing directory "+dir.getPath()+" ("+dir.listFiles(globFileFilter).length+" files, depth="+currentDepth+")");
+    info("Indexing directory "+dir.getPath()+" ("+dir.listFiles(fileFilter).length+" files, depth="+currentDepth+")");
     int posted = 0;
-    posted += postFiles(dir.listFiles(globFileFilter), out, type);
+    posted += postFiles(dir.listFiles(fileFilter), out, type);
     if(recursive > currentDepth) {
       for(File d : dir.listFiles()) {
         if(d.isDirectory()) {
@@ -965,7 +965,7 @@
     if (null != dest) dest.flush();
   }
 
-  public GlobFileFilter getFileFilterFromFileTypes(String fileTypes) {
+  public FileFilter getFileFilterFromFileTypes(String fileTypes) {
     String glob;
     if(fileTypes.equals("*"))
       glob = ".*";
