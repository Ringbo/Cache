diff --git a/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/HeavyTestFixtureBuilderImpl.java b/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/HeavyTestFixtureBuilderImpl.java
index b8faf09..2a7f4dd 100644
--- a/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/HeavyTestFixtureBuilderImpl.java
+++ b/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/HeavyTestFixtureBuilderImpl.java
@@ -48,7 +48,7 @@
   private <M extends ModuleFixtureBuilder> M createModuleBuilder(Class<M> key) {
     Class<? extends ModuleFixtureBuilder> implClass = myProviders.get(key);
     Assert.assertNotNull(key.toString(), implClass);
-    final ConstructorInjectionComponentAdapter adapter = new ConstructorInjectionComponentAdapter(implClass, implClass);
+    final ConstructorInjectionComponentAdapter adapter = new ConstructorInjectionComponentAdapter(implClass, implClass, null, true);
     return (M)adapter.getComponentInstance(myContainer);
   }
 
