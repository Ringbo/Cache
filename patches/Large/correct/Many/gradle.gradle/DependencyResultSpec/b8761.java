diff --git a/subprojects/diagnostics/src/main/groovy/org/gradle/api/tasks/diagnostics/internal/dsl/DependencyResultSpec.java b/subprojects/diagnostics/src/main/groovy/org/gradle/api/tasks/diagnostics/internal/dsl/DependencyResultSpec.java
index 6da8899..70c42d6 100644
--- a/subprojects/diagnostics/src/main/groovy/org/gradle/api/tasks/diagnostics/internal/dsl/DependencyResultSpec.java
+++ b/subprojects/diagnostics/src/main/groovy/org/gradle/api/tasks/diagnostics/internal/dsl/DependencyResultSpec.java
@@ -46,7 +46,7 @@
     }
 
     private boolean matchesSelected(ResolvedDependencyResult candidate) {
-        ModuleComponentIdentifier selected = (ModuleComponentIdentifier)candidate.getSelected().getId();
+        ModuleComponentIdentifier selected = (ModuleComponentIdentifier)candidate.getSelected().getPublishedAs();
         String selectedCandidate = selected.getGroup() + ":" + selected.getModule() + ":" + selected.getVersion();
         return selectedCandidate.contains(stringNotation);
     }
