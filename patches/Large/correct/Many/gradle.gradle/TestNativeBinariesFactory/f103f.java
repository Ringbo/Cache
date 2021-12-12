diff --git a/subprojects/platform-native/src/test/groovy/org/gradle/nativeplatform/internal/TestNativeBinariesFactory.java b/subprojects/platform-native/src/test/groovy/org/gradle/nativeplatform/internal/TestNativeBinariesFactory.java
index 5d57ad8..c0c5562 100644
--- a/subprojects/platform-native/src/test/groovy/org/gradle/nativeplatform/internal/TestNativeBinariesFactory.java
+++ b/subprojects/platform-native/src/test/groovy/org/gradle/nativeplatform/internal/TestNativeBinariesFactory.java
@@ -33,7 +33,7 @@
     public static <T extends BaseBinarySpec> T create(Class<T> type, String name, ITaskFactory taskFactory, final ComponentSpecInternal component,
                                                       final BinaryNamingScheme namingScheme, final NativeDependencyResolver resolver,
                                                       final NativePlatform platform, final BuildType buildType, final Flavor flavor) {
-        T binary = BaseBinaryFixtures.create(type, name, component, taskFactory);
+        T binary = BaseBinaryFixtures.create(type, type, name, component, taskFactory);
         NativeBinaries.initialize((NativeBinarySpec) binary, namingScheme, resolver, platform, buildType, flavor);
         binary.getInputs().addAll(component.getSources().values());
         return binary;
