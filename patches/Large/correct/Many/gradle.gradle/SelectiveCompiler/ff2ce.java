diff --git a/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/compile/incremental/SelectiveCompiler.java b/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/compile/incremental/SelectiveCompiler.java
index e1f8f23..6bb380e 100644
--- a/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/compile/incremental/SelectiveCompiler.java
+++ b/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/compile/incremental/SelectiveCompiler.java
@@ -61,7 +61,7 @@
             //use the original compiler to avoid cleaning up all the files
             return cleaningCompiler.getCompiler().execute(spec);
         } finally {
-            LOG.lifecycle("Detection of classes for compilation ({}) plus the compilation took {}.", clock.getTime(), recompilationSpec.getClassNames().size());
+            LOG.lifecycle("Detection of classes for compilation ({}) plus the compilation took {}.", recompilationSpec.getClassNames().size(), clock.getTime());
         }
     }
 }
