diff --git a/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/TruffleVerboseTextListener.java b/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/TruffleVerboseTextListener.java
index a65b955..711d84f 100644
--- a/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/TruffleVerboseTextListener.java
+++ b/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/TruffleVerboseTextListener.java
@@ -31,11 +31,11 @@
 
 class TruffleVerboseTextListener extends TruffleTextListener {
 
-    public TruffleVerboseTextListener(JUnitSystem system) {
+    TruffleVerboseTextListener(JUnitSystem system) {
         this(system.out());
     }
 
-    public TruffleVerboseTextListener(PrintStream writer) {
+    TruffleVerboseTextListener(PrintStream writer) {
         super(writer);
     }
 
