diff --git a/src/main/java/com/google/devtools/build/lib/rules/objc/ObjcCommon.java b/src/main/java/com/google/devtools/build/lib/rules/objc/ObjcCommon.java
index eb8d854..7f31bcb 100644
--- a/src/main/java/com/google/devtools/build/lib/rules/objc/ObjcCommon.java
+++ b/src/main/java/com/google/devtools/build/lib/rules/objc/ObjcCommon.java
@@ -278,7 +278,7 @@
       for (CcCompilationInfo ccCompilationInfo : cppDeps.build()) {
         CcCompilationContextInfo ccCompilationContextInfo =
             ccCompilationInfo.getCcCompilationContextInfo();
-        if (ccCompilationContextInfo == null) {
+        if (ccCompilationContextInfo != null) {
           ccCompilationContextInfoBuilder.add(ccCompilationContextInfo);
         }
       }
