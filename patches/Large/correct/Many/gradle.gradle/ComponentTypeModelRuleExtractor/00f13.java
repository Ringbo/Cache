diff --git a/subprojects/platform-base/src/main/java/org/gradle/platform/base/internal/registry/ComponentTypeModelRuleExtractor.java b/subprojects/platform-base/src/main/java/org/gradle/platform/base/internal/registry/ComponentTypeModelRuleExtractor.java
index 6b9ac82..1e167cb 100644
--- a/subprojects/platform-base/src/main/java/org/gradle/platform/base/internal/registry/ComponentTypeModelRuleExtractor.java
+++ b/subprojects/platform-base/src/main/java/org/gradle/platform/base/internal/registry/ComponentTypeModelRuleExtractor.java
@@ -53,7 +53,7 @@
 
     @Override
     protected <R, S> ExtractedModelRule createRegistration(MethodRuleDefinition<R, S> ruleDefinition, ModelType<? extends ComponentSpec> type, TypeBuilderInternal<ComponentSpec> builder) {
-        ImmutableList<Class<?>> dependencies = ImmutableList.<Class<?>>of(ComponentModelBasePlugin.class);
+        List<Class<?>> dependencies = ImmutableList.<Class<?>>of(ComponentModelBasePlugin.class);
         ModelType<? extends BaseComponentSpec> implementation = determineImplementationType(type, builder);
         if (implementation != null) {
             ModelAction<?> mutator = new RegistrationAction(type, implementation, ruleDefinition.getDescriptor(), instantiator);
