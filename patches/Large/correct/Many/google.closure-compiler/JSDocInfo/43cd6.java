diff --git a/src/com/google/javascript/rhino/JSDocInfo.java b/src/com/google/javascript/rhino/JSDocInfo.java
index 0550e7d..e270db7 100644
--- a/src/com/google/javascript/rhino/JSDocInfo.java
+++ b/src/com/google/javascript/rhino/JSDocInfo.java
@@ -2033,14 +2033,14 @@
   /**
    * Returns the list of authors or null if none.
    */
-  public Collection<String> getAuthors() {
+  public List<String> getAuthors() {
     return documentation == null ? null : documentation.authors;
   }
 
   /**
    * Returns the list of references or null if none.
    */
-  public Collection<String> getReferences() {
+  public List<String> getReferences() {
     return documentation == null ? null : documentation.sees;
   }
 
