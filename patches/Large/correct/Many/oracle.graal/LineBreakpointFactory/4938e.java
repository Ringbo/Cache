diff --git a/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/debug/LineBreakpointFactory.java b/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/debug/LineBreakpointFactory.java
index ba486da..2a661fb 100644
--- a/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/debug/LineBreakpointFactory.java
+++ b/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/debug/LineBreakpointFactory.java
@@ -288,7 +288,7 @@
          */
         private List<ProbeInstrument> instruments = new ArrayList<>();
 
-        public LineBreakpointImpl(int ignoreCount, LineLocation lineLocation, boolean oneShot) {
+        LineBreakpointImpl(int ignoreCount, LineLocation lineLocation, boolean oneShot) {
             super(ENABLED_UNRESOLVED, ignoreCount, oneShot);
             this.lineLocation = lineLocation;
 
