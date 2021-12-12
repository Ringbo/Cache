diff --git a/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/NodeGenFactory.java b/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/NodeGenFactory.java
index 92e648b..0e688dc 100644
--- a/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/NodeGenFactory.java
+++ b/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/NodeGenFactory.java
@@ -1726,7 +1726,7 @@
         final Set<ExecutableTypeData> executableTypes = findSpecializedExecutableTypes(execution, target.getType());
         if (executableTypes.isEmpty()) {
             throw new AssertionError(); // cannot execute child
-        } else if (executableTypes.size() == 1) {
+        } else if (executableTypes.size() == 1 && !target.getType().hasImplicitSourceTypes()) {
             ExecutableTypeData executableType = executableTypes.iterator().next();
             if (target.getType().isGeneric() && executableType.getEvaluatedCount() == 0) {
                 return createPolymorphicExecuteChild(execution, target, currentValues, shared);
