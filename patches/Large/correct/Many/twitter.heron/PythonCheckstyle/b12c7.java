diff --git a/tools/java/src/com/twitter/bazel/checkstyle/PythonCheckstyle.java b/tools/java/src/com/twitter/bazel/checkstyle/PythonCheckstyle.java
index f2ccc0f..91a6edf 100644
--- a/tools/java/src/com/twitter/bazel/checkstyle/PythonCheckstyle.java
+++ b/tools/java/src/com/twitter/bazel/checkstyle/PythonCheckstyle.java
@@ -129,7 +129,8 @@
     return Collections2.filter(spawnInfo.getInputFileList(),
         Predicates.and(
             Predicates.containsPattern(".*/src/.+\\.py[c]{0,1}$"),
-            Predicates.not(Predicates.containsPattern("third_party/"))
+            Predicates.not(Predicates.containsPattern("third_party/")),
+            Predicates.not(Predicates.containsPattern("integration_test/"))
         )
     );
   }
