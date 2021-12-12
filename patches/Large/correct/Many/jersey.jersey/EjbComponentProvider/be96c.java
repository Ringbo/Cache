diff --git a/containers/glassfish/jersey-gf-ejb/src/main/java/org/glassfish/jersey/gf/ejb/internal/EjbComponentProvider.java b/containers/glassfish/jersey-gf-ejb/src/main/java/org/glassfish/jersey/gf/ejb/internal/EjbComponentProvider.java
index 3568274..2bc9991 100644
--- a/containers/glassfish/jersey-gf-ejb/src/main/java/org/glassfish/jersey/gf/ejb/internal/EjbComponentProvider.java
+++ b/containers/glassfish/jersey-gf-ejb/src/main/java/org/glassfish/jersey/gf/ejb/internal/EjbComponentProvider.java
@@ -197,7 +197,7 @@
             final List<String> tempLibNames = new LinkedList<>();
             for (ModuleInfo moduleInfo : appInfo.getModuleInfos()) {
                 final String jarName = moduleInfo.getName();
-                if (jarName.endsWith(".jar")) {
+                if (jarName.endsWith(".jar") || jarName.endsWith(".war")) {
                     final String moduleName = jarName.substring(0, jarName.length() - 4);
                     tempLibNames.add(moduleName);
                     final Object bundleDescriptor = moduleInfo.getMetaData(EjbBundleDescriptorImpl.class.getName());
