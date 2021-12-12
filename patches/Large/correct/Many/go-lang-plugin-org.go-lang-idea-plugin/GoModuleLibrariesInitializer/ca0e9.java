diff --git a/src/com/goide/project/GoModuleLibrariesInitializer.java b/src/com/goide/project/GoModuleLibrariesInitializer.java
index 13fbed5..70bc2f8 100644
--- a/src/com/goide/project/GoModuleLibrariesInitializer.java
+++ b/src/com/goide/project/GoModuleLibrariesInitializer.java
@@ -261,7 +261,7 @@
   }
 
   private boolean isAppropriateModule() {
-    return !myModule.isDisposed() && (PlatformUtils.isIntelliJ() || ModuleUtil.getModuleType(myModule) == GoModuleType.getInstance());
+    return !myModule.isDisposed() && (!PlatformUtils.isIntelliJ() || ModuleUtil.getModuleType(myModule) == GoModuleType.getInstance());
   }
 
   @Override
