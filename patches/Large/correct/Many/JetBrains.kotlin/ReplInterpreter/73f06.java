diff --git a/compiler/cli/src/org/jetbrains/kotlin/cli/jvm/repl/ReplInterpreter.java b/compiler/cli/src/org/jetbrains/kotlin/cli/jvm/repl/ReplInterpreter.java
index 1536315..a0ce69b 100644
--- a/compiler/cli/src/org/jetbrains/kotlin/cli/jvm/repl/ReplInterpreter.java
+++ b/compiler/cli/src/org/jetbrains/kotlin/cli/jvm/repl/ReplInterpreter.java
@@ -163,7 +163,7 @@
             }
         }
 
-        this.classLoader = new ReplClassLoader(new URLClassLoader(classpath.toArray(new URL[classpath.size()])));
+        this.classLoader = new ReplClassLoader(new URLClassLoader(classpath.toArray(new URL[classpath.size()]), null));
     }
 
     private static void prepareForTheNextReplLine(@NotNull TopDownAnalysisContext c) {
