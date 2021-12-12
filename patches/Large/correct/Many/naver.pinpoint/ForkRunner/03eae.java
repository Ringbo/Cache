diff --git a/profiler/src/main/java/com/navercorp/pinpoint/test/fork/ForkRunner.java b/profiler/src/main/java/com/navercorp/pinpoint/test/fork/ForkRunner.java
index 5588505..8bb2b31 100644
--- a/profiler/src/main/java/com/navercorp/pinpoint/test/fork/ForkRunner.java
+++ b/profiler/src/main/java/com/navercorp/pinpoint/test/fork/ForkRunner.java
@@ -328,7 +328,7 @@
                 String trace = traceInText.get(i);
                 String[] tokens = trace.split(",");
 
-                stackTrace[i] = new StackTraceElement(tokens[0], tokens[1], tokens[2], Integer.valueOf(tokens[3]));
+                stackTrace[i] = new StackTraceElement(tokens[0], tokens[1], tokens[2], Integer.parseInt(tokens[3]));
             }
 
             return new ChildProcessException(exceptionClass + ": " + message, stackTrace);
