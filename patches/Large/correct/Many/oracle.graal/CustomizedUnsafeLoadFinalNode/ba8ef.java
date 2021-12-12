diff --git a/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/nodes/typesystem/CustomizedUnsafeLoadFinalNode.java b/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/nodes/typesystem/CustomizedUnsafeLoadFinalNode.java
index 62800d5..2b913c3 100644
--- a/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/nodes/typesystem/CustomizedUnsafeLoadFinalNode.java
+++ b/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/nodes/typesystem/CustomizedUnsafeLoadFinalNode.java
@@ -89,7 +89,7 @@
     public void lower(LoweringTool tool) {
         CompareNode compare = CompareNode.createCompareNode(graph(), Condition.EQ, condition, ConstantNode.forBoolean(true, graph()));
         LocationIdentity locationIdentity;
-        if (location.asConstant().isNull()) {
+        if (!location.isConstant() || location.asConstant().isNull()) {
             locationIdentity = LocationIdentity.ANY_LOCATION;
         } else {
             locationIdentity = ObjectLocationIdentity.create(location.asConstant());
