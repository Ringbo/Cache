diff --git a/runtime/Java/src/org/antlr/v4/runtime/tree/ParseTreeProperty.java b/runtime/Java/src/org/antlr/v4/runtime/tree/ParseTreeProperty.java
index 1d4394d..104bd59 100644
--- a/runtime/Java/src/org/antlr/v4/runtime/tree/ParseTreeProperty.java
+++ b/runtime/Java/src/org/antlr/v4/runtime/tree/ParseTreeProperty.java
@@ -20,5 +20,5 @@
 
 	public V get(ParseTree node) { return annotations.get(node); }
 	public void put(ParseTree node, V value) { annotations.put(node, value); }
-	public V removeFrom(ParseTree node) { return annotations.get(node); }
+	public V removeFrom(ParseTree node) { return annotations.remove(node); }
 }
