diff --git a/graal/com.oracle.graal.debug/src/com/oracle/graal/debug/GraalDebugConfig.java b/graal/com.oracle.graal.debug/src/com/oracle/graal/debug/GraalDebugConfig.java
index 17c08fb..8bf442c 100644
--- a/graal/com.oracle.graal.debug/src/com/oracle/graal/debug/GraalDebugConfig.java
+++ b/graal/com.oracle.graal.debug/src/com/oracle/graal/debug/GraalDebugConfig.java
@@ -388,7 +388,7 @@
             // Only dump a context object once.
             if (!firstSeen.containsKey(o)) {
                 firstSeen.put(o, o);
-                if (Options.DumpOnError.getValue(GLOBAL)) {
+                if (Options.DumpOnError.getValue(GLOBAL) || Options.Dump.getValue(GLOBAL) != null) {
                     Debug.dump(Debug.BASIC_LOG_LEVEL, o, "Exception: %s", e);
                 } else {
                     Debug.log("Context obj %s", o);
