diff --git a/python/ide/src/com/jetbrains/python/configuration/PyModuleDependenciesConfigurable.java b/python/ide/src/com/jetbrains/python/configuration/PyModuleDependenciesConfigurable.java
index 56045c2..9fc3463 100644
--- a/python/ide/src/com/jetbrains/python/configuration/PyModuleDependenciesConfigurable.java
+++ b/python/ide/src/com/jetbrains/python/configuration/PyModuleDependenciesConfigurable.java
@@ -70,7 +70,7 @@
 
   @Override
   public boolean isModified() {
-    return collectDependencies().equals(myInitialDependencies);
+    return !collectDependencies().equals(myInitialDependencies);
   }
 
   private List<Module> collectDependencies() {
