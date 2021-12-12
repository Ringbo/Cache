diff --git a/src/components/org/apache/jmeter/control/ForeachController.java b/src/components/org/apache/jmeter/control/ForeachController.java
index 39de038..5aafb31 100644
--- a/src/components/org/apache/jmeter/control/ForeachController.java
+++ b/src/components/org/apache/jmeter/control/ForeachController.java
@@ -163,6 +163,9 @@
         return super.isDone();
     }
 
+    /**
+     * Tests that JMeterVariables contain inputVal_<count>, if not we can stop iterating
+     */
     private boolean endOfArguments() {
         JMeterContext context = getThreadContext();
         String inputVariable = getInputVal() + getSeparator() + (loopCount + 1);
@@ -214,7 +217,10 @@
     @Override
     protected Sampler nextIsNull() throws NextIsNullException {
         reInitialize();
-        if (endOfArguments()) {
+        // Conditions to reset the loop count
+        if (endOfArguments() // no more variables to iterate
+                ||loopCount >= getEndIndex() // we reached end index
+                ) {
             // setDone(true);
             resetLoopCount();
             return null;
