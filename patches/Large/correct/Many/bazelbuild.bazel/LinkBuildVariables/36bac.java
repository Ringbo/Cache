diff --git a/src/main/java/com/google/devtools/build/lib/rules/cpp/LinkBuildVariables.java b/src/main/java/com/google/devtools/build/lib/rules/cpp/LinkBuildVariables.java
index 5975f41..6378640 100644
--- a/src/main/java/com/google/devtools/build/lib/rules/cpp/LinkBuildVariables.java
+++ b/src/main/java/com/google/devtools/build/lib/rules/cpp/LinkBuildVariables.java
@@ -164,7 +164,7 @@
     }
 
     // output exec path
-    if (outputArtifact != null) {
+    if (outputArtifact != null && !isLtoIndexing) {
       buildVariables.addStringVariable(
           OUTPUT_EXECPATH.getVariableName(), outputArtifact.getExecPathString());
     }
@@ -205,7 +205,10 @@
       }
     }
     boolean shouldGenerateInterfaceLibrary =
-        outputArtifact != null && interfaceLibraryBuilder != null && interfaceLibraryOutput != null;
+        outputArtifact != null
+            && interfaceLibraryBuilder != null
+            && interfaceLibraryOutput != null
+            && !isLtoIndexing;
     buildVariables.addStringVariable(
         GENERATE_INTERFACE_LIBRARY.getVariableName(),
         shouldGenerateInterfaceLibrary ? "yes" : "no");
