diff --git a/tool/src/org/antlr/v4/Tool.java b/tool/src/org/antlr/v4/Tool.java
index abd714e..de01f5e 100644
--- a/tool/src/org/antlr/v4/Tool.java
+++ b/tool/src/org/antlr/v4/Tool.java
@@ -527,7 +527,7 @@
 	/** Manually get option node from tree; return null if no defined. */
 	public static GrammarAST findOptionValueAST(GrammarRootAST root, String option) {
 		GrammarAST options = (GrammarAST)root.getFirstChildWithType(ANTLRParser.OPTIONS);
-		if ( options!=null ) {
+		if ( options!=null && options.getChildCount() > 0 ) {
 			for (Object o : options.getChildren()) {
 				GrammarAST c = (GrammarAST)o;
 				if ( c.getType() == ANTLRParser.ASSIGN &&
