diff --git a/src/jvm/clojure/lang/Compiler.java b/src/jvm/clojure/lang/Compiler.java
index a3542ee..ef7a519 100644
--- a/src/jvm/clojure/lang/Compiler.java
+++ b/src/jvm/clojure/lang/Compiler.java
@@ -799,7 +799,7 @@
 
 	public void emit(C context, FnExpr fn, GeneratorAdapter gen){
 		gen.visitLineNumber(line, gen.mark());
-		if(targetClass != null)
+		if(targetClass != null && field != null)
 			{
 			if(context != C.STATEMENT)
 				{
