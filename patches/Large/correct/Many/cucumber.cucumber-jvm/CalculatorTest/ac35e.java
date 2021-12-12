diff --git a/examples/pax-exam/calculator-test/src/test/java/cucumber/examples/java/paxexam/test/CalculatorTest.java b/examples/pax-exam/calculator-test/src/test/java/cucumber/examples/java/paxexam/test/CalculatorTest.java
index 346d11e..d76a41a 100644
--- a/examples/pax-exam/calculator-test/src/test/java/cucumber/examples/java/paxexam/test/CalculatorTest.java
+++ b/examples/pax-exam/calculator-test/src/test/java/cucumber/examples/java/paxexam/test/CalculatorTest.java
@@ -53,7 +53,7 @@
             mavenBundle("info.cukes", "pax-exam-calculator-service"),
 
             mavenBundle("info.cukes", "gherkin"),
-            mavenBundle("info.cukes", "cucumber-jvm-deps", "1.0.4-SNAPSHOT"),
+            mavenBundle("info.cukes", "cucumber-jvm-deps"),
             mavenBundle("info.cukes", "cucumber-core"),
             mavenBundle("info.cukes", "cucumber-java"),
             mavenBundle("info.cukes", "cucumber-osgi"),
