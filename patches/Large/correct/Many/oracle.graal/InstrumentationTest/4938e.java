diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/instrument/InstrumentationTest.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/instrument/InstrumentationTest.java
index 7732548..b329327 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/instrument/InstrumentationTest.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/instrument/InstrumentationTest.java
@@ -205,7 +205,7 @@
         public Instrumenter instrumenter;
         private ProbeInstrument instrument;
 
-        public TestSimpleInstrumentCounter(Instrumenter instrumenter) {
+        TestSimpleInstrumentCounter(Instrumenter instrumenter) {
             this.instrumenter = instrumenter;
         }
 
@@ -257,7 +257,7 @@
         public final Instrumenter instrumenter;
         public ProbeInstrument instrument;
 
-        public TestStandardInstrumentCounter(Instrumenter instrumenter) {
+        TestStandardInstrumentCounter(Instrumenter instrumenter) {
             this.instrumenter = instrumenter;
         }
 
