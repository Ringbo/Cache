diff --git a/subprojects/core/src/main/groovy/org/gradle/api/internal/initialization/DefaultClassLoaderScope.java b/subprojects/core/src/main/groovy/org/gradle/api/internal/initialization/DefaultClassLoaderScope.java
index 08aa4ae..502bfb9 100644
--- a/subprojects/core/src/main/groovy/org/gradle/api/internal/initialization/DefaultClassLoaderScope.java
+++ b/subprojects/core/src/main/groovy/org/gradle/api/internal/initialization/DefaultClassLoaderScope.java
@@ -97,7 +97,7 @@
 
     private void createFlexibleLoaderStructure() {
         if (exportingClassLoader == null) {
-            exportingClassLoader = new MultiParentClassLoader();
+            exportingClassLoader = new MultiParentClassLoader(parent.getChildClassLoader());
         }
 
         localClassLoader = new MultiParentClassLoader(exportingClassLoader);
