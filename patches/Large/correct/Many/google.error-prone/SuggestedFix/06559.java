diff --git a/core/src/main/java/com/google/errorprone/fixes/SuggestedFix.java b/core/src/main/java/com/google/errorprone/fixes/SuggestedFix.java
index 7b25dc3..c53a25a 100644
--- a/core/src/main/java/com/google/errorprone/fixes/SuggestedFix.java
+++ b/core/src/main/java/com/google/errorprone/fixes/SuggestedFix.java
@@ -94,26 +94,27 @@
   }
 
   /** {@link Builder#replace(Tree, String)} */
-  public static Fix replace(Tree tree, String replaceWith) {
+  public static SuggestedFix replace(Tree tree, String replaceWith) {
     return builder().replace(tree, replaceWith).build();
   }
 
   /**
-   * Replace the characters from startPos, inclusive, until endPos, exclusive, with the
-   * given string.
+   * Replace the characters from startPos, inclusive, until endPos, exclusive, with the given
+   * string.
    *
    * @param startPos The position from which to start replacing, inclusive
    * @param endPos The position at which to end replacing, exclusive
    * @param replaceWith The string to replace with
    */
-  public static Fix replace(int startPos, int endPos, String replaceWith) {
+  public static SuggestedFix replace(int startPos, int endPos, String replaceWith) {
     return builder().replace(startPos, endPos, replaceWith).build();
   }
 
   /**
-   * Replace a tree node with a string, but adjust the start and end positions as well.
-   * For example, if the tree node begins at index 10 and ends at index 30, this call will
-   * replace the characters at index 15 through 25 with "replacement":
+   * Replace a tree node with a string, but adjust the start and end positions as well. For example,
+   * if the tree node begins at index 10 and ends at index 30, this call will replace the characters
+   * at index 15 through 25 with "replacement":
+   *
    * <pre>
    * {@code fix.replace(node, "replacement", 5, -5)}
    * </pre>
@@ -123,28 +124,28 @@
    * @param startPosAdjustment The adjustment to add to the start position (negative is OK)
    * @param endPosAdjustment The adjustment to add to the end position (negative is OK)
    */
-  public static Fix replace(Tree node, String replaceWith, int startPosAdjustment,
-                                     int endPosAdjustment) {
+  public static SuggestedFix replace(
+      Tree node, String replaceWith, int startPosAdjustment, int endPosAdjustment) {
     return builder().replace(node, replaceWith, startPosAdjustment, endPosAdjustment).build();
   }
 
   /** {@link Builder#prefixWith(Tree, String)}  */
-  public static Fix prefixWith(Tree node, String prefix) {
+  public static SuggestedFix prefixWith(Tree node, String prefix) {
     return builder().prefixWith(node, prefix).build();
   }
 
   /** {@link Builder#postfixWith(Tree, String)} */
-  public static Fix postfixWith(Tree node, String postfix) {
+  public static SuggestedFix postfixWith(Tree node, String postfix) {
     return builder().postfixWith(node, postfix).build();
   }
 
   /** {@link Builder#delete(Tree)} */
-  public static Fix delete(Tree node) {
+  public static SuggestedFix delete(Tree node) {
     return builder().delete(node).build();
   }
 
   /** {@link Builder#swap(Tree, Tree)} */
-  public static Fix swap(Tree node1, Tree node2) {
+  public static SuggestedFix swap(Tree node1, Tree node2) {
     return builder().swap(node1, node2).build();
   }
 
@@ -165,7 +166,7 @@
       return fixes.isEmpty() && importsToAdd.isEmpty() && importsToRemove.isEmpty();
     }
 
-    public Fix build() {
+    public SuggestedFix build() {
       return new SuggestedFix(fixes, importsToAdd, importsToRemove);
     }
 
