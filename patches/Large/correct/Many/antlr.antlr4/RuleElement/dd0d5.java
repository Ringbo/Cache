diff --git a/tool/src/org/antlr/v4/codegen/model/RuleElement.java b/tool/src/org/antlr/v4/codegen/model/RuleElement.java
index 3037313..0a29cff 100644
--- a/tool/src/org/antlr/v4/codegen/model/RuleElement.java
+++ b/tool/src/org/antlr/v4/codegen/model/RuleElement.java
@@ -38,7 +38,7 @@
 
 	public RuleElement(OutputModelFactory factory, GrammarAST ast) {
 		super(factory, ast);
-		if ( ast.atnState!=null ) stateNumber = ast.atnState.stateNumber;
+		if ( ast != null && ast.atnState!=null ) stateNumber = ast.atnState.stateNumber;
 	}
 
 }
