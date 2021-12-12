diff --git a/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/inlining/info/MultiTypeGuardInlineInfo.java b/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/inlining/info/MultiTypeGuardInlineInfo.java
index 1354342..8b2bb9d 100644
--- a/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/inlining/info/MultiTypeGuardInlineInfo.java
+++ b/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/inlining/info/MultiTypeGuardInlineInfo.java
@@ -332,13 +332,13 @@
             assert concretes.size() > 0;
             Debug.log("Method check cascade with %d methods", concretes.size());
 
-            ValueNode[] constantMethods = new ValueNode[concretes.size()];
+            ConstantNode[] constantMethods = new ConstantNode[concretes.size()];
             double[] probability = new double[concretes.size()];
             for (int i = 0; i < concretes.size(); ++i) {
                 ResolvedJavaMethod firstMethod = concretes.get(i);
                 Constant firstMethodConstant = firstMethod.getEncoding();
 
-                ValueNode firstMethodConstantNode = ConstantNode.forConstant(firstMethodConstant, metaAccess, graph);
+                ConstantNode firstMethodConstantNode = ConstantNode.forConstant(firstMethodConstant, metaAccess, graph);
                 constantMethods[i] = firstMethodConstantNode;
                 double concretesProbability = concretesProbabilities.get(i);
                 assert concretesProbability >= 0.0;
