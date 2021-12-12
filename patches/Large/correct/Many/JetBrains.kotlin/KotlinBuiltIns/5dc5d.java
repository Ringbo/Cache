diff --git a/core/descriptors/src/org/jetbrains/kotlin/builtins/KotlinBuiltIns.java b/core/descriptors/src/org/jetbrains/kotlin/builtins/KotlinBuiltIns.java
index 4f41413..42e178b 100644
--- a/core/descriptors/src/org/jetbrains/kotlin/builtins/KotlinBuiltIns.java
+++ b/core/descriptors/src/org/jetbrains/kotlin/builtins/KotlinBuiltIns.java
@@ -111,7 +111,7 @@
     private KotlinBuiltIns() {
         LockBasedStorageManager storageManager = new LockBasedStorageManager();
         builtInsModule = new ModuleDescriptorImpl(
-                Name.special("<built-ins module>"), storageManager, ModuleParameters.Empty.INSTANCE$
+                Name.special("<built-ins module>"), storageManager, ModuleParameters.Empty.INSTANCE$, this
         );
 
         PackageFragmentProvider packageFragmentProvider = BuiltinsPackage.createBuiltInPackageFragmentProvider(
