diff --git a/src/main/java/org/codehaus/groovy/transform/stc/TypeCheckingContext.java b/src/main/java/org/codehaus/groovy/transform/stc/TypeCheckingContext.java
index 3d344f2..77cb289 100644
--- a/src/main/java/org/codehaus/groovy/transform/stc/TypeCheckingContext.java
+++ b/src/main/java/org/codehaus/groovy/transform/stc/TypeCheckingContext.java
@@ -390,7 +390,7 @@
      * Pops a constructor call from the enclosing constructor call stack.
      * @return the popped call
      */
-    public Expression popEnclosingConstructorCall() {
+    public ConstructorCallExpression popEnclosingConstructorCall() {
         return enclosingConstructorCalls.removeFirst();
     }
 
@@ -399,7 +399,7 @@
      * if there's no such element.
      * @return the enclosing constructor call on top of the stack, or null if no such element.
      */
-    public Expression getEnclosingConstructorCall() {
+    public ConstructorCallExpression getEnclosingConstructorCall() {
         if (enclosingConstructorCalls.isEmpty()) return null;
         return enclosingConstructorCalls.getFirst();
     }
@@ -409,7 +409,7 @@
      * element is the top of the stack, that is to say the currently visited constructor call.
      * @return an immutable list of enclosing constructor calls.
      */
-    public List<Expression> getEnclosingConstructorCalls() {
+    public List<ConstructorCallExpression> getEnclosingConstructorCalls() {
         return Collections.unmodifiableList(enclosingConstructorCalls);
     }
 
