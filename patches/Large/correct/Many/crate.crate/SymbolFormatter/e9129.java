diff --git a/sql/src/main/java/io/crate/planner/symbol/SymbolFormatter.java b/sql/src/main/java/io/crate/planner/symbol/SymbolFormatter.java
index 7bda661..792ae0d 100644
--- a/sql/src/main/java/io/crate/planner/symbol/SymbolFormatter.java
+++ b/sql/src/main/java/io/crate/planner/symbol/SymbolFormatter.java
@@ -40,7 +40,7 @@
     private SymbolFormatter() {}
 
     public static String format(String messageTmpl, Symbol ... symbols) {
-        String[] formattedSymbols = new String[symbols.length];
+        Object[] formattedSymbols = new String[symbols.length];
         for (int i = 0; i < symbols.length; i++) {
             formattedSymbols[i] = symbols[i].accept(INSTANCE, null);
         }
