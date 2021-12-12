diff --git a/src/main/org/codehaus/groovy/classgen/AsmClassGenerator.java b/src/main/org/codehaus/groovy/classgen/AsmClassGenerator.java
index b60cbe6..5e56c64 100644
--- a/src/main/org/codehaus/groovy/classgen/AsmClassGenerator.java
+++ b/src/main/org/codehaus/groovy/classgen/AsmClassGenerator.java
@@ -3349,11 +3349,11 @@
         if (expression instanceof BinaryExpression) {
             BinaryExpression be = (BinaryExpression) expression;
             if (be.getOperation().getType()==Types.LEFT_SQUARE_BRACKET) {
-                cv.visitInsn(DUP);
+                mv.visitInsn(DUP);
                 final int resultIdx = compileStack.defineTemporaryVariable("postfix_" + method, true);
                 BytecodeExpression result = new BytecodeExpression() {
                     public void visit(GroovyCodeVisitor visitor) {
-                        cv.visitVarInsn(ALOAD, resultIdx);
+                        mv.visitVarInsn(ALOAD, resultIdx);
                     }
                 };
                 TupleExpression args = new ArgumentListExpression();
