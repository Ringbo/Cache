diff --git a/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/TruffleTextListener.java b/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/TruffleTextListener.java
index c8b48f09..60b1ad5 100644
--- a/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/TruffleTextListener.java
+++ b/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/TruffleTextListener.java
@@ -37,11 +37,11 @@
     private final PrintStream fWriter;
     protected Failure lastFailure;
 
-    public TruffleTextListener(JUnitSystem system) {
+    TruffleTextListener(JUnitSystem system) {
         this(system.out());
     }
 
-    public TruffleTextListener(PrintStream writer) {
+    TruffleTextListener(PrintStream writer) {
         fWriter = writer;
     }
 
@@ -120,7 +120,7 @@
             private boolean failed;
 
             @Override
-            public final void testStarted(Description description) {
+            public void testStarted(Description description) {
                 Class<?> currentClass = description.getTestClass();
                 if (currentClass != lastClass) {
                     if (lastClass != null) {
@@ -137,13 +137,13 @@
             }
 
             @Override
-            public final void testFailure(Failure failure) {
+            public void testFailure(Failure failure) {
                 failed = true;
                 l.testFailed(failure);
             }
 
             @Override
-            public final void testFinished(Description description) {
+            public void testFinished(Description description) {
                 // we have to do this because there is no callback for successful tests
                 if (!failed) {
                     l.testSucceeded(description);
