diff --git a/src/main/org/codehaus/groovy/classgen/asm/BinaryExpressionHelper.java b/src/main/org/codehaus/groovy/classgen/asm/BinaryExpressionHelper.java
index 8192236..ffdb33f 100644
--- a/src/main/org/codehaus/groovy/classgen/asm/BinaryExpressionHelper.java
+++ b/src/main/org/codehaus/groovy/classgen/asm/BinaryExpressionHelper.java
@@ -250,7 +250,7 @@
         case COMPARE_IDENTICAL:
         case COMPARE_NOT_IDENTICAL:
             Token op = expression.getOperation();
-            Throwable cause = new SyntaxException("Operator " + op + " not supported", op.getStartLine(), op.getStartColumn());
+            Throwable cause = new SyntaxException("Operator " + op + " not supported", op.getStartLine(), op.getStartColumn(), op.getStartLine(), op.getStartColumn()+3);
             throw new GroovyRuntimeException(cause);
 
         default:
