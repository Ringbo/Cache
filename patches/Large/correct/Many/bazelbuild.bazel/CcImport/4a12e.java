diff --git a/src/main/java/com/google/devtools/build/lib/rules/cpp/CcImport.java b/src/main/java/com/google/devtools/build/lib/rules/cpp/CcImport.java
index 45969ba..60dbdbc 100644
--- a/src/main/java/com/google/devtools/build/lib/rules/cpp/CcImport.java
+++ b/src/main/java/com/google/devtools/build/lib/rules/cpp/CcImport.java
@@ -157,7 +157,7 @@
       // library required at linking time is the same as the one required at execution time.
       if (!targetWindows) {
         dynamicLibraryForLinkingList = dynamicLibrariesForRuntimeList;
-      } else if (staticLibrary == null) {
+      } else if (sharedLibrary != null) {
         ruleContext.ruleError(
           "'interface library' must be specified when using cc_import for shared library on"
         + " Windows");
