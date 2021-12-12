diff --git a/src/main/java/com/google/devtools/build/lib/rules/cpp/CppCompileAction.java b/src/main/java/com/google/devtools/build/lib/rules/cpp/CppCompileAction.java
index 18dd2de..4448eaf 100644
--- a/src/main/java/com/google/devtools/build/lib/rules/cpp/CppCompileAction.java
+++ b/src/main/java/com/google/devtools/build/lib/rules/cpp/CppCompileAction.java
@@ -891,9 +891,9 @@
         // This call can never match the declared include sources (they would be matched above).
         // There are no declared include sources we need to warn about, so use an empty set here.
         if (isDeclaredIn(input, warnIncludeDirs, ImmutableSet.<Artifact>of())) {
-          warnings.add(input.getPath().toString());
+          warnings.add(input.getExecPath().toString());
         } else {
-          errors.add(input.getPath().toString());
+          errors.add(input.getExecPath().toString());
         }
       }
     }
