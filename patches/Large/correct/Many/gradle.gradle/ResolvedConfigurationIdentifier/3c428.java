diff --git a/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/ResolvedConfigurationIdentifier.java b/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/ResolvedConfigurationIdentifier.java
index 02d0985..1fbdb6f 100644
--- a/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/ResolvedConfigurationIdentifier.java
+++ b/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/ResolvedConfigurationIdentifier.java
@@ -50,7 +50,7 @@
 
     @Override
     public String toString() {
-        return String.format("%s:%s:%s:%s", getModuleGroup(), getModuleVersion(), getModuleName(), configuration);
+        return String.format("%s:%s:%s:%s", getModuleGroup(), getModuleName(), getModuleVersion(), configuration);
     }
 
     @Override
