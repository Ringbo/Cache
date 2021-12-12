diff --git a/src/com/facebook/buck/testrunner/SameThreadFailOnTimeout.java b/src/com/facebook/buck/testrunner/SameThreadFailOnTimeout.java
index 0c828f1..30901ba 100644
--- a/src/com/facebook/buck/testrunner/SameThreadFailOnTimeout.java
+++ b/src/com/facebook/buck/testrunner/SameThreadFailOnTimeout.java
@@ -65,7 +65,7 @@
       System.err.printf("Dumping threads for timed-out test %s:%n", testName);
       for (Map.Entry<Thread, StackTraceElement[]> t : Thread.getAllStackTraces().entrySet()) {
         Thread thread = t.getKey();
-        System.err.printf("\"%s\" #%d%n", thread.getName(), thread.getId(), thread.getId());
+        System.err.printf("\"%s\" #%d%n", thread.getName(), thread.getId());
         System.err.printf("\tjava.lang.Thread.State: %s%n", thread.getState());
         for (StackTraceElement element : t.getValue()) {
           System.err.printf("\t\t at %s%n", element);
