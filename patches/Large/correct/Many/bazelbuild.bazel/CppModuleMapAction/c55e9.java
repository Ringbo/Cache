diff --git a/src/main/java/com/google/devtools/build/lib/rules/cpp/CppModuleMapAction.java b/src/main/java/com/google/devtools/build/lib/rules/cpp/CppModuleMapAction.java
index 3fea2c4..183da37 100644
--- a/src/main/java/com/google/devtools/build/lib/rules/cpp/CppModuleMapAction.java
+++ b/src/main/java/com/google/devtools/build/lib/rules/cpp/CppModuleMapAction.java
@@ -177,11 +177,11 @@
     f.addString(GUID);
     f.addInt(privateHeaders.size());
     for (Artifact artifact : privateHeaders) {
-      f.addPath(artifact.getRootRelativePath());
+      f.addPath(artifact.getExecPath());
     }
     f.addInt(publicHeaders.size());
     for (Artifact artifact : publicHeaders) {
-      f.addPath(artifact.getRootRelativePath());
+      f.addPath(artifact.getExecPath());
     }
     f.addInt(dependencies.size());
     for (CppModuleMap dep : dependencies) {
