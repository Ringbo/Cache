diff --git a/ReactAndroid/src/main/java/com/facebook/react/bridge/NativeModuleRegistry.java b/ReactAndroid/src/main/java/com/facebook/react/bridge/NativeModuleRegistry.java
index d30b7a5..66c73e6 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/bridge/NativeModuleRegistry.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/bridge/NativeModuleRegistry.java
@@ -141,7 +141,8 @@
   }
 
   public <T extends NativeModule> T getModule(Class<T> moduleInterface) {
-    return (T) Assertions.assertNotNull(mModules.get(moduleInterface)).getModule();
+    return (T) Assertions.assertNotNull(
+        mModules.get(moduleInterface), moduleInterface.getSimpleName()).getModule();
   }
 
   public List<NativeModule> getAllModules() {
