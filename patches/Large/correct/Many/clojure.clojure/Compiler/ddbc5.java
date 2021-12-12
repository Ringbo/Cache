diff --git a/src/jvm/clojure/lang/Compiler.java b/src/jvm/clojure/lang/Compiler.java
index dacdf0f..c1df153 100644
--- a/src/jvm/clojure/lang/Compiler.java
+++ b/src/jvm/clojure/lang/Compiler.java
@@ -2951,12 +2951,13 @@
 	}
 
 	void emitClearLocals(GeneratorAdapter gen){
-		for(int i = 0; i < numParams(); i++)
+		for(int i = 1; i < numParams()+1; i++)
 			{
 			if(!localsUsedInCatchFinally.contains(i))
 				{
 				gen.visitInsn(Opcodes.ACONST_NULL);
-				gen.storeArg(i);
+				gen.visitVarInsn(OBJECT_TYPE.getOpcode(Opcodes.ISTORE), i);
+//				gen.storeArg(i);
 				}
 			}
 		for(int i = numParams() + 1; i < maxLocal + 1; i++)
