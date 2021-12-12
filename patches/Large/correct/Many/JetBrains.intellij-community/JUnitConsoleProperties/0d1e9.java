diff --git a/plugins/junit/src/com/intellij/execution/junit2/ui/properties/JUnitConsoleProperties.java b/plugins/junit/src/com/intellij/execution/junit2/ui/properties/JUnitConsoleProperties.java
index e82c791..2a1eb7d 100644
--- a/plugins/junit/src/com/intellij/execution/junit2/ui/properties/JUnitConsoleProperties.java
+++ b/plugins/junit/src/com/intellij/execution/junit2/ui/properties/JUnitConsoleProperties.java
@@ -45,6 +45,6 @@
   @Override
   protected GlobalSearchScope initScope() {
     final SourceScope sourceScope = myConfiguration.getPersistentData().getScope().getSourceScope(myConfiguration);
-    return sourceScope != null ? sourceScope.getLibrariesScope() : GlobalSearchScope.allScope(getProject());
+    return sourceScope != null ? sourceScope.getGlobalSearchScope() : GlobalSearchScope.allScope(getProject());
   }
 }
