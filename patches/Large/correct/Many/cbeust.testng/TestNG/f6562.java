diff --git a/src/main/org/testng/TestNG.java b/src/main/org/testng/TestNG.java
index e6b4705..69b8eae 100644
--- a/src/main/org/testng/TestNG.java
+++ b/src/main/org/testng/TestNG.java
@@ -538,9 +538,10 @@
   public void addListener(Object listener) {
     if (! (listener instanceof ISuiteListener) 
         && ! (listener instanceof ITestListener)
-        && ! (listener instanceof IReporter))
+        && ! (listener instanceof IReporter)
+        && ! (listener instanceof IAnnotationTransformer))
     {
-      exitWithError("Listener " + listener + " is neither an ITestListener, ISuiteListener nor IReporter");
+      exitWithError("Listener " + listener + " must be one of ITestListener, ISuiteListener, IReporter or IAnnotationTransformer");
     }
     else {
       if (listener instanceof ISuiteListener) {
