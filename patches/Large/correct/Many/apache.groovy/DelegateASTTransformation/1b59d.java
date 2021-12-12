diff --git a/src/main/org/codehaus/groovy/transform/DelegateASTTransformation.java b/src/main/org/codehaus/groovy/transform/DelegateASTTransformation.java
index c1c18e2..3e91914 100644
--- a/src/main/org/codehaus/groovy/transform/DelegateASTTransformation.java
+++ b/src/main/org/codehaus/groovy/transform/DelegateASTTransformation.java
@@ -164,10 +164,11 @@
             }
         }
 
-        // give precedence to non-abstract methods of self
+        // give precedence to methods of self (but not abstract or static superclass methods)
+        // also allows abstract or static self methods to be selected for overriding but they are ignored later
         MethodNode existingNode = null;
         for (MethodNode mn : ownMethods) {
-            if (mn.getTypeDescriptor().equals(candidate.getTypeDescriptor()) && !mn.isAbstract()) {
+            if (mn.getTypeDescriptor().equals(candidate.getTypeDescriptor()) && !mn.isAbstract() && !mn.isStatic()) {
                 existingNode = mn;
                 break;
             }
@@ -181,6 +182,7 @@
                 newParams[i] = newParam;
                 args.addExpression(new VariableExpression(newParam));
             }
+            // addMethod will ignore attempts to override abstract or static methods with same signature on self
             owner.addMethod(candidate.getName(),
                     candidate.getModifiers() & (~ACC_ABSTRACT) & (~ACC_NATIVE),
                     nonGeneric(candidate.getReturnType()),
