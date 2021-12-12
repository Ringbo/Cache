diff --git a/graal/org.graalvm.compiler.phases.common/src/org/graalvm/compiler/phases/common/NewConditionalEliminationPhase.java b/graal/org.graalvm.compiler.phases.common/src/org/graalvm/compiler/phases/common/NewConditionalEliminationPhase.java
index 2b7f379..57377cf 100644
--- a/graal/org.graalvm.compiler.phases.common/src/org/graalvm/compiler/phases/common/NewConditionalEliminationPhase.java
+++ b/graal/org.graalvm.compiler.phases.common/src/org/graalvm/compiler/phases/common/NewConditionalEliminationPhase.java
@@ -727,10 +727,10 @@
                 registerNewCondition(condition, negated, beginNode);
             } else if (predecessor instanceof TypeSwitchNode) {
                 TypeSwitchNode typeSwitch = (TypeSwitchNode) predecessor;
-                processTypeSwitch(beginNode, predecessor, typeSwitch);
+                processTypeSwitch(beginNode, typeSwitch);
             } else if (predecessor instanceof IntegerSwitchNode) {
                 IntegerSwitchNode integerSwitchNode = (IntegerSwitchNode) predecessor;
-                processIntegerSwitch(beginNode, predecessor, integerSwitchNode);
+                processIntegerSwitch(beginNode, integerSwitchNode);
             }
         }
 
@@ -742,12 +742,12 @@
             }
         }
 
-        protected void processIntegerSwitch(AbstractBeginNode beginNode, Node predecessor, IntegerSwitchNode integerSwitchNode) {
+        protected void processIntegerSwitch(AbstractBeginNode beginNode, IntegerSwitchNode integerSwitchNode) {
             ValueNode value = integerSwitchNode.value();
             if (maybeMultipleUsages(value)) {
                 Stamp stamp = null;
                 for (int i = 0; i < integerSwitchNode.keyCount(); i++) {
-                    if (integerSwitchNode.keySuccessor(i) == predecessor) {
+                    if (integerSwitchNode.keySuccessor(i) == beginNode) {
                         if (stamp == null) {
                             stamp = StampFactory.forConstant(integerSwitchNode.keyAt(i));
                         } else {
@@ -762,7 +762,7 @@
             }
         }
 
-        protected void processTypeSwitch(AbstractBeginNode beginNode, Node predecessor, TypeSwitchNode typeSwitch) {
+        protected void processTypeSwitch(AbstractBeginNode beginNode, TypeSwitchNode typeSwitch) {
             ValueNode hub = typeSwitch.value();
             if (hub instanceof LoadHubNode) {
                 LoadHubNode loadHub = (LoadHubNode) hub;
@@ -770,7 +770,7 @@
                 if (maybeMultipleUsages(value)) {
                     Stamp stamp = null;
                     for (int i = 0; i < typeSwitch.keyCount(); i++) {
-                        if (typeSwitch.keySuccessor(i) == predecessor) {
+                        if (typeSwitch.keySuccessor(i) == beginNode) {
                             if (stamp == null) {
                                 stamp = StampFactory.objectNonNull(TypeReference.createExactTrusted(typeSwitch.typeAt(i)));
                             } else {
