diff --git a/drools-compiler/src/main/java/org/drools/rule/builder/dialect/mvel/MVELConsequenceBuilder.java b/drools-compiler/src/main/java/org/drools/rule/builder/dialect/mvel/MVELConsequenceBuilder.java
index dc55e72..ced2335 100644
--- a/drools-compiler/src/main/java/org/drools/rule/builder/dialect/mvel/MVELConsequenceBuilder.java
+++ b/drools-compiler/src/main/java/org/drools/rule/builder/dialect/mvel/MVELConsequenceBuilder.java
@@ -151,7 +151,7 @@
         Interceptor {
         public int doBefore(ASTNode node,
                             VariableResolverFactory factory) {
-            Object object = ((WithNode) node).getContext().getValue( null,
+            Object object = ((WithNode) node). getNestedStatement().getValue( null,
                                                                      factory );
             FactHandle handle = ((DroolsMVELFactory) factory).getWorkingMemory().getFactHandle( object );
             ((DroolsMVELFactory) factory).getWorkingMemory().modifyRetract( handle, null, null );
