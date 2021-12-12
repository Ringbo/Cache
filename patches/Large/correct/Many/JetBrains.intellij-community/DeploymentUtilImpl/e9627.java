diff --git a/compiler/impl/com/intellij/openapi/deployment/DeploymentUtilImpl.java b/compiler/impl/com/intellij/openapi/deployment/DeploymentUtilImpl.java
index b5b0a7e..0f14828 100644
--- a/compiler/impl/com/intellij/openapi/deployment/DeploymentUtilImpl.java
+++ b/compiler/impl/com/intellij/openapi/deployment/DeploymentUtilImpl.java
@@ -398,7 +398,7 @@
           continue;
         }
 
-        PackagingFileFilter fileFilter = fileFilters != null ? fileFilters.get(module) : null;
+        PackagingFileFilter fileFilter = fileFilters != null ? fileFilters.get(childModule) : null;
 
         if (PackagingMethod.JAR_AND_COPY_FILE.equals(packagingMethod)) {
           addJarJavaModuleOutput(instructions, childModule, moduleLink.getURI(), context, linkContainerDescription, fileFilter);
