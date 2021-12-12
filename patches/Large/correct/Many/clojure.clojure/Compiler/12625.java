diff --git a/src/jvm/clojure/lang/Compiler.java b/src/jvm/clojure/lang/Compiler.java
index 6b76eb4..6f1e88f 100644
--- a/src/jvm/clojure/lang/Compiler.java
+++ b/src/jvm/clojure/lang/Compiler.java
@@ -1026,7 +1026,7 @@
 static Class maybePrimitiveType(Expr e){
 	try
 		{
-		if(e instanceof MaybePrimitiveExpr && e.hasJavaClass())
+		if(e instanceof MaybePrimitiveExpr && e.hasJavaClass() && ((MaybePrimitiveExpr)e).canEmitPrimitive())
 			{
 			Class c = e.getJavaClass();
 			if(Util.isPrimitive(c))
@@ -2135,8 +2135,7 @@
 
 		try
 			{
-			if(testExpr instanceof MaybePrimitiveExpr && testExpr.hasJavaClass() &&
-			   testExpr.getJavaClass() == boolean.class)
+			if(maybePrimitiveType(testExpr) == boolean.class)
 				{
 				((MaybePrimitiveExpr) testExpr).emitUnboxed(C.EXPRESSION, objx, gen);
 				gen.ifZCmp(gen.EQ, falseLabel);
