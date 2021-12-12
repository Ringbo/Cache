diff --git a/src/com/google/javascript/jscomp/CompilerOptions.java b/src/com/google/javascript/jscomp/CompilerOptions.java
index d383fd0..2fd122d 100644
--- a/src/com/google/javascript/jscomp/CompilerOptions.java
+++ b/src/com/google/javascript/jscomp/CompilerOptions.java
@@ -2786,7 +2786,7 @@
     }
   }
 
-  public final List<ConformanceConfig> getConformanceConfigs() {
+  public final ImmutableList<ConformanceConfig> getConformanceConfigs() {
     return conformanceConfigs;
   }
 
