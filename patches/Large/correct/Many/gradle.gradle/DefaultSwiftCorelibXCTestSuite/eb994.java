diff --git a/subprojects/testing-native/src/main/java/org/gradle/nativeplatform/test/xctest/internal/DefaultSwiftCorelibXCTestSuite.java b/subprojects/testing-native/src/main/java/org/gradle/nativeplatform/test/xctest/internal/DefaultSwiftCorelibXCTestSuite.java
index 186747b..902da9c 100644
--- a/subprojects/testing-native/src/main/java/org/gradle/nativeplatform/test/xctest/internal/DefaultSwiftCorelibXCTestSuite.java
+++ b/subprojects/testing-native/src/main/java/org/gradle/nativeplatform/test/xctest/internal/DefaultSwiftCorelibXCTestSuite.java
@@ -32,7 +32,7 @@
     public DefaultSwiftCorelibXCTestSuite(String name, ObjectFactory objectFactory, FileOperations fileOperations, ConfigurationContainer configurations, ProjectLayout projectLayout) {
         super(name, fileOperations, objectFactory, configurations);
 
-        executable = objectFactory.newInstance(DefaultSwiftExecutable.class, name + "Executable", projectLayout, objectFactory, getModule(), true, getSwiftSource(), configurations, getImplementationDependencies());
+        executable = objectFactory.newInstance(DefaultSwiftExecutable.class, name + "Executable", projectLayout, objectFactory, getModule(), true, false, getSwiftSource(), configurations, getImplementationDependencies());
     }
 
     @Override
