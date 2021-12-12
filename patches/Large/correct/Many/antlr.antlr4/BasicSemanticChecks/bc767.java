diff --git a/tool/src/org/antlr/v4/semantics/BasicSemanticChecks.java b/tool/src/org/antlr/v4/semantics/BasicSemanticChecks.java
index 416909a..4f5e792 100644
--- a/tool/src/org/antlr/v4/semantics/BasicSemanticChecks.java
+++ b/tool/src/org/antlr/v4/semantics/BasicSemanticChecks.java
@@ -471,7 +471,7 @@
 	protected void enterTerminal(GrammarAST tree) {
 		String text = tree.getText();
 		if (text.equals("''")) {
-			g.tool.errMgr.grammarError(ErrorType.EMPTY_STRINGS_AND_SETS_NOT_ALLOWED, g.fileName, tree.token);
+			g.tool.errMgr.grammarError(ErrorType.EMPTY_STRINGS_AND_SETS_NOT_ALLOWED, g.fileName, tree.token, "''");
 		}
 	}
 
