diff --git a/src/com/google/javascript/refactoring/CodeReplacement.java b/src/com/google/javascript/refactoring/CodeReplacement.java
index 6c36c5c..f5945c8 100644
--- a/src/com/google/javascript/refactoring/CodeReplacement.java
+++ b/src/com/google/javascript/refactoring/CodeReplacement.java
@@ -33,9 +33,7 @@
   // same startPosition.
   private final String sortKey;
 
-  // TODO(tbreisacher): Make this package-private by refactoring tests so they
-  // don't need to call it directly.
-  public CodeReplacement(int startPosition, int length, String newContent) {
+  CodeReplacement(int startPosition, int length, String newContent) {
     this(startPosition, length, newContent, "");
   }
 
