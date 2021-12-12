diff --git a/server/src/main/java/org/jboss/as/server/controller/resources/ModuleLoadingResourceDefinition.java b/server/src/main/java/org/jboss/as/server/controller/resources/ModuleLoadingResourceDefinition.java
index 6942ab2..7b49edc 100644
--- a/server/src/main/java/org/jboss/as/server/controller/resources/ModuleLoadingResourceDefinition.java
+++ b/server/src/main/java/org/jboss/as/server/controller/resources/ModuleLoadingResourceDefinition.java
@@ -211,7 +211,7 @@
         // TODO get a formal API from jboss-modules to replace this reflection
 
         List<String> result = new ArrayList<String>();
-        Module module = Module.getModuleFromCallerModuleLoader(ModuleIdentifier.create(moduleName));
+        Module module = Module.getModuleFromCallerModuleLoader(ModuleIdentifier.fromString(moduleName));
         ModuleClassLoader mcl = module.getClassLoader();
         Field pathsField = ModuleClassLoader.class.getDeclaredField("paths");
         Field sourceListField = null;
