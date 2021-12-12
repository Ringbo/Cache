diff --git a/src/main/java/net/sf/jabref/logic/pdf/PdfCommentImporter.java b/src/main/java/net/sf/jabref/logic/pdf/PdfCommentImporter.java
index 15dacf9..b56e54e 100644
--- a/src/main/java/net/sf/jabref/logic/pdf/PdfCommentImporter.java
+++ b/src/main/java/net/sf/jabref/logic/pdf/PdfCommentImporter.java
@@ -37,9 +37,9 @@
      * @param path a path to a pdf
      * @return a list with the all the annotations found in the file of the path
      */
-    public ArrayList<PdfComment> importNotes(final String path, final BibDatabaseContext context) {
+    public List<PdfComment> importNotes(final String path, final BibDatabaseContext context) {
 
-        ArrayList<PdfComment> annotationsMap = new ArrayList<>();
+        List<PdfComment> annotationsMap = new ArrayList<>();
 
         PDDocument document = null;
         try {
