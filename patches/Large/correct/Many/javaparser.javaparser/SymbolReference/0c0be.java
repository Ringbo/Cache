diff --git a/java-symbol-solver-model/src/main/java/com/github/javaparser/symbolsolver/model/resolution/SymbolReference.java b/java-symbol-solver-model/src/main/java/com/github/javaparser/symbolsolver/model/resolution/SymbolReference.java
index c36eed7..f454f8a 100644
--- a/java-symbol-solver-model/src/main/java/com/github/javaparser/symbolsolver/model/resolution/SymbolReference.java
+++ b/java-symbol-solver-model/src/main/java/com/github/javaparser/symbolsolver/model/resolution/SymbolReference.java
@@ -58,7 +58,7 @@
      */
     public S getCorrespondingDeclaration() {
         if (!isSolved()) {
-            throw new UnsupportedOperationException();
+            throw new UnsupportedOperationException("CorrespondingDeclaration not available for unsolved symbol.");
         }
         return correspondingDeclaration.get();
     }
