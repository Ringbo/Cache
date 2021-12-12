diff --git a/app/src/processing/app/Mode.java b/app/src/processing/app/Mode.java
index 704ae8f..c247673 100644
--- a/app/src/processing/app/Mode.java
+++ b/app/src/processing/app/Mode.java
@@ -62,7 +62,7 @@
 //  protected Tool formatter;
 
   // maps imported packages to their library folder
-  protected Map<String, ArrayList<Library>> importToLibraryTable;
+  protected Map<String, List<Library>> importToLibraryTable;
 
   // these menus are shared so that they needn't be rebuilt for all windows
   // each time a sketch is created, renamed, or moved.
@@ -318,7 +318,7 @@
   public void rebuildLibraryList() {
     //new Exception("Rebuilding library list").printStackTrace(System.out);
     // reset the table mapping imports to libraries
-    importToLibraryTable = new HashMap<String, ArrayList<Library>>();
+    importToLibraryTable = new HashMap<String, List<Library>>();
 
     Library core = getCoreLibrary();
     if (core != null) {
