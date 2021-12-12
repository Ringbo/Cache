diff --git a/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/PhiStampInferencePartialEvaluationTest.java b/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/PhiStampInferencePartialEvaluationTest.java
index a67d53b..1a68355 100644
--- a/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/PhiStampInferencePartialEvaluationTest.java
+++ b/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/PhiStampInferencePartialEvaluationTest.java
@@ -57,7 +57,7 @@
         @Child private ANode b;
         @Child private ANode c;
 
-        public IfPhiStampTestNode() {
+        IfPhiStampTestNode() {
             this.b = new ANode(() -> new B(42));
             this.c = new ANode(() -> new C(666));
         }
