diff --git a/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/InstrumentationPartialEvaluationTest.java b/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/InstrumentationPartialEvaluationTest.java
index 222c932..3eb8c28 100644
--- a/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/InstrumentationPartialEvaluationTest.java
+++ b/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/InstrumentationPartialEvaluationTest.java
@@ -217,7 +217,7 @@
             public AdvancedInstrumentRoot createInstrumentRoot(Probe probe, Node node) {
                 return null;
             }
-        }, "test AdvancedInstrument");
+        }, null, "test AdvancedInstrument");
         testProbe.attach(instrument);
 
         // It all gets compiled away
@@ -248,7 +248,7 @@
                     }
                 };
             }
-        }, "test AdvancedInstrument");
+        }, null, "test AdvancedInstrument");
         testProbe.attach(instrument);
 
         // It all gets compiled away.
