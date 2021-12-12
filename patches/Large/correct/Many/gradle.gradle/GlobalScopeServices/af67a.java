diff --git a/subprojects/core/src/main/groovy/org/gradle/internal/service/scopes/GlobalScopeServices.java b/subprojects/core/src/main/groovy/org/gradle/internal/service/scopes/GlobalScopeServices.java
index eedd6eb..1ae1ed1 100755
--- a/subprojects/core/src/main/groovy/org/gradle/internal/service/scopes/GlobalScopeServices.java
+++ b/subprojects/core/src/main/groovy/org/gradle/internal/service/scopes/GlobalScopeServices.java
@@ -113,11 +113,11 @@
                 pluginModuleRegistry));
     }
 
-    DefaultModuleRegistry createModuleRegistry() {
+    ModuleRegistry createModuleRegistry() {
         return new DefaultModuleRegistry();
     }
 
-    DefaultGradleDistributionLocator createGradleDistributionLocator() {
+    GradleDistributionLocator createGradleDistributionLocator() {
         return new DefaultGradleDistributionLocator();
     }
 
