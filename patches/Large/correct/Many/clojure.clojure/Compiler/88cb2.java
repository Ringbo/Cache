diff --git a/src/jvm/clojure/lang/Compiler.java b/src/jvm/clojure/lang/Compiler.java
index cb14d96..9d744d7 100644
--- a/src/jvm/clojure/lang/Compiler.java
+++ b/src/jvm/clojure/lang/Compiler.java
@@ -971,7 +971,7 @@
 	public void emitAssign(C context, FnExpr fn, GeneratorAdapter gen,
 	                       Expr val){
 		gen.visitLineNumber(line, gen.mark());
-		if(targetClass != null)
+		if(targetClass != null && field != null)
 			{
 			target.emit(C.EXPRESSION, fn, gen);
 			gen.checkCast(Type.getType(targetClass));
