diff --git a/subprojects/model-core/src/main/java/org/gradle/model/internal/inspect/ManagedModelCreationRuleDefinitionHandler.java b/subprojects/model-core/src/main/java/org/gradle/model/internal/inspect/ManagedModelCreationRuleDefinitionHandler.java
index cbed6a4..3c53cc4 100644
--- a/subprojects/model-core/src/main/java/org/gradle/model/internal/inspect/ManagedModelCreationRuleDefinitionHandler.java
+++ b/subprojects/model-core/src/main/java/org/gradle/model/internal/inspect/ManagedModelCreationRuleDefinitionHandler.java
@@ -92,7 +92,7 @@
         BiAction<MutableModelNode, Inputs> initializer;
         ModelProjection projection;
 
-        if (managedType.getConcreteClass().equals(ManagedSet.class)) {
+        if (managedType.getRawClass().equals(ManagedSet.class)) {
             initializer = new ManagedModelRuleInvokerInstanceBackedTransformer<T>(modelSchema, modelInstantiator, ruleDefinition.getRuleInvoker(), descriptor, inputs);
             projection = new ManagedSetModelProjection<T>(managedType);
             return ModelCreators.of(ModelReference.of(modelPath, managedType), initializer)
