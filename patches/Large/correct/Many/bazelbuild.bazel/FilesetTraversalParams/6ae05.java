diff --git a/src/main/java/com/google/devtools/build/lib/actions/FilesetTraversalParams.java b/src/main/java/com/google/devtools/build/lib/actions/FilesetTraversalParams.java
index e7cbe12..1d9fd67 100644
--- a/src/main/java/com/google/devtools/build/lib/actions/FilesetTraversalParams.java
+++ b/src/main/java/com/google/devtools/build/lib/actions/FilesetTraversalParams.java
@@ -32,7 +32,7 @@
  * Parameters of a filesystem traversal requested by a Fileset rule.
  *
  * <p>This object stores the details of the traversal request, e.g. whether it's a direct or nested
- * traversal (see {@link #getDirectTraversal()} and {@link #getNestedTraversal()}) or who the owner
+ * traversal (see {@link #getDirectTraversal()} and {@link #getNestedArtifact()}) or who the owner
  * of the traversal is.
  */
 public interface FilesetTraversalParams {
@@ -104,7 +104,7 @@
     }
 
     @Override
-    public boolean equals(Object o) {
+    public final boolean equals(Object o) {
       if (o == this) {
         return true;
       }
@@ -274,7 +274,7 @@
    * directory (when FilesetEntry.srcdir is specified) or traversal of a single file (when
    * FilesetEntry.files is specified). See {@link DirectTraversal} for more detail.
    *
-   * <p>The value is present if and only if {@link #getNestedTraversal} is empty.
+   * <p>The value is present if and only if {@link #getNestedArtifact} is empty.
    */
   Optional<DirectTraversal> getDirectTraversal();
 
