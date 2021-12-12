diff --git a/src/edu/stanford/nlp/util/Execution.java b/src/edu/stanford/nlp/util/Execution.java
index d2d2eb3..2a134c0 100644
--- a/src/edu/stanford/nlp/util/Execution.java
+++ b/src/edu/stanford/nlp/util/Execution.java
@@ -597,7 +597,7 @@
       log(FORCE, t);
       exitCode = 1;
     }
-    endTrack("main"); //ends main
+    endTracksTo("main");  // end main
     if (exit) {
       System.exit(exitCode);
     }
