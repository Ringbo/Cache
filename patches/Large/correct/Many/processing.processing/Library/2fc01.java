diff --git a/app/src/processing/app/Library.java b/app/src/processing/app/Library.java
index 69966b6..bd10d0b 100644
--- a/app/src/processing/app/Library.java
+++ b/app/src/processing/app/Library.java
@@ -256,13 +256,13 @@
    * @param importToLibraryTable mapping from package names to Library objects
    */
 //  public void addPackageList(HashMap<String,Library> importToLibraryTable) {
-  public void addPackageList(Map<String, ArrayList<Library>> importToLibraryTable) {
+  public void addPackageList(Map<String, List<Library>> importToLibraryTable) {
 //    PApplet.println(packages);
     for (String pkg : packageList) {
 //          pw.println(pkg + "\t" + libraryFolder.getAbsolutePath());
 //      PApplet.println(pkg + "\t" + getName());
 //      Library library = importToLibraryTable.get(pkg);
-      ArrayList<Library> libraries = importToLibraryTable.get(pkg);
+      List<Library> libraries = importToLibraryTable.get(pkg);
       if (libraries == null) {
         libraries = new ArrayList<Library>();
         importToLibraryTable.put(pkg, libraries);
