diff --git a/subprojects/core/src/main/groovy/org/gradle/api/tasks/diagnostics/internal/dependencies/RenderableDependencyNode.java b/subprojects/core/src/main/groovy/org/gradle/api/tasks/diagnostics/internal/dependencies/RenderableDependencyNode.java
index d04d95a..3c60786 100644
--- a/subprojects/core/src/main/groovy/org/gradle/api/tasks/diagnostics/internal/dependencies/RenderableDependencyNode.java
+++ b/subprojects/core/src/main/groovy/org/gradle/api/tasks/diagnostics/internal/dependencies/RenderableDependencyNode.java
@@ -40,7 +40,7 @@
     }
 
     public String getId() {
-        return dependencyNode.getId().getAsked().toString();
+        return dependencyNode.getId().getSelected().toString();
     }
 
     public String getConfiguration() {
