diff --git a/tool/src/org/antlr/v4/semantics/RuleCollector.java b/tool/src/org/antlr/v4/semantics/RuleCollector.java
index 48a06ff..7791dcf 100644
--- a/tool/src/org/antlr/v4/semantics/RuleCollector.java
+++ b/tool/src/org/antlr/v4/semantics/RuleCollector.java
@@ -96,7 +96,7 @@
 		if ( locals!=null ) {
 			r.locals = ScopeParser.parseTypedArgList(locals, locals.getText(), g.tool.errMgr);
 			r.locals.type = AttributeDict.DictType.LOCAL;
-			r.locals.ast = returns;
+			r.locals.ast = locals;
 		}
 
 		for (GrammarAST a : actions) {
