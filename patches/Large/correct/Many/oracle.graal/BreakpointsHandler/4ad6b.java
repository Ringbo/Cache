diff --git a/tools/src/com.oracle.truffle.tools.chromeinspector/src/com/oracle/truffle/tools/chromeinspector/BreakpointsHandler.java b/tools/src/com.oracle.truffle.tools.chromeinspector/src/com/oracle/truffle/tools/chromeinspector/BreakpointsHandler.java
index c2472f1..7f95ff6 100644
--- a/tools/src/com.oracle.truffle.tools.chromeinspector/src/com/oracle/truffle/tools/chromeinspector/BreakpointsHandler.java
+++ b/tools/src/com.oracle.truffle.tools.chromeinspector/src/com/oracle/truffle/tools/chromeinspector/BreakpointsHandler.java
@@ -67,7 +67,7 @@
         }
     }
 
-    Params createURLBreakpoint(Object url, int line, int column, String condition) throws CommandProcessException {
+    Params createURLBreakpoint(Object url, int line, int column, String condition) {
         long id;
         synchronized (bpIDs) {
             id = ++lastID;
@@ -182,7 +182,7 @@
         private int column;
         private String condition;
 
-        public BPInfo(Object url, int line, int column, String condition) {
+        private BPInfo(Object url, int line, int column, String condition) {
             this.url = url;
             this.line = line;
             this.column = column;
