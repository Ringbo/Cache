diff --git a/subprojects/platform-native/src/main/groovy/org/gradle/nativeplatform/test/plugins/NativeBinariesTestPlugin.java b/subprojects/platform-native/src/main/groovy/org/gradle/nativeplatform/test/plugins/NativeBinariesTestPlugin.java
index c129767..357b802 100644
--- a/subprojects/platform-native/src/main/groovy/org/gradle/nativeplatform/test/plugins/NativeBinariesTestPlugin.java
+++ b/subprojects/platform-native/src/main/groovy/org/gradle/nativeplatform/test/plugins/NativeBinariesTestPlugin.java
@@ -69,7 +69,7 @@
 
         ModelRuleDescriptor descriptor = new SimpleModelRuleDescriptor(NativeBinariesTestPlugin.class.getName() + ".apply()");
         ModelMapSchema<TestSuiteContainer> schema = (ModelMapSchema<TestSuiteContainer>) schemaStore.getSchema(ModelType.of(TestSuiteContainer.class));
-        ModelReference<RuleAwarePolymorphicNamedEntityInstantiator<ComponentSpec>> componentTypeRegistryType = ModelReference.of(ModelPath.path("componentTypeRegistry"), new ModelType<RuleAwarePolymorphicNamedEntityInstantiator<ComponentSpec>>() { });
+        ModelReference<RuleAwarePolymorphicNamedEntityInstantiator<ComponentSpec>> componentTypeRegistryType = ModelReference.of(new ModelType<RuleAwarePolymorphicNamedEntityInstantiator<ComponentSpec>>() { });
         ModelCreator testSuitesCreator = ModelMapCreators.specialized(ModelPath.path("testSuites"), TestSuiteSpec.class, TestSuiteContainer.class, schema.getManagedImpl().asSubclass(TestSuiteContainer.class), componentTypeRegistryType, descriptor);
 
         modelRegistry.create(testSuitesCreator);
