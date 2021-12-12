diff --git a/tools/java/src/com/twitter/bazel/checkstyle/JavaCheckstyle.java b/tools/java/src/com/twitter/bazel/checkstyle/JavaCheckstyle.java
index d42c1e0..25a01bb 100644
--- a/tools/java/src/com/twitter/bazel/checkstyle/JavaCheckstyle.java
+++ b/tools/java/src/com/twitter/bazel/checkstyle/JavaCheckstyle.java
@@ -112,7 +112,8 @@
         Predicates.containsPattern("storm-compatibility-examples.src.java"),
         Predicates.containsPattern("storm-compatibility.src.java"),
         Predicates.containsPattern("tools/test/LcovMerger"),
-        Predicates.containsPattern("contrib")
+        Predicates.containsPattern("contrib"),
+        Predicates.containsPattern("external") // from external/ directory for bazel  
     )));
   }
 
