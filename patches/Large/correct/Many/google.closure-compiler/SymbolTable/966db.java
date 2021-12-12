diff --git a/src/com/google/javascript/jscomp/SymbolTable.java b/src/com/google/javascript/jscomp/SymbolTable.java
index b506bb3..4411e60 100644
--- a/src/com/google/javascript/jscomp/SymbolTable.java
+++ b/src/com/google/javascript/jscomp/SymbolTable.java
@@ -152,7 +152,7 @@
     return ImmutableList.copyOf(symbol.references.values());
   }
 
-  public Iterable<Symbol> getAllSymbols() {
+  public ImmutableList<Symbol> getAllSymbols() {
     return ImmutableList.copyOf(symbols.values());
   }
 
