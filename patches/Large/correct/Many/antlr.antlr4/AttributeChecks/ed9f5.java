diff --git a/tool/src/org/antlr/v4/semantics/AttributeChecks.java b/tool/src/org/antlr/v4/semantics/AttributeChecks.java
index 94c48ea..0e96520 100644
--- a/tool/src/org/antlr/v4/semantics/AttributeChecks.java
+++ b/tool/src/org/antlr/v4/semantics/AttributeChecks.java
@@ -135,7 +135,7 @@
 			if ( rref!=null ) {
 				if ( rref.args!=null && rref.args.get(y.getText())!=null ) {
 					g.tool.errMgr.grammarError(ErrorType.INVALID_RULE_PARAMETER_REF,
-											  g.fileName, y, y.getText(), expr);
+											  g.fileName, y, y.getText(), rref.name, expr);
 				}
 				else {
 					errMgr.grammarError(ErrorType.UNKNOWN_RULE_ATTRIBUTE,
