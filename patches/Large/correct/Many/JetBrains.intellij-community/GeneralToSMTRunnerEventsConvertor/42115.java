diff --git a/plugins/ruby/src/org/jetbrains/plugins/ruby/testing/sm/runner/GeneralToSMTRunnerEventsConvertor.java b/plugins/ruby/src/org/jetbrains/plugins/ruby/testing/sm/runner/GeneralToSMTRunnerEventsConvertor.java
index a28f0cd..25d537b 100644
--- a/plugins/ruby/src/org/jetbrains/plugins/ruby/testing/sm/runner/GeneralToSMTRunnerEventsConvertor.java
+++ b/plugins/ruby/src/org/jetbrains/plugins/ruby/testing/sm/runner/GeneralToSMTRunnerEventsConvertor.java
@@ -336,7 +336,7 @@
 
   private void fireOnTestIgnored(final SMTestProxy test) {
     for (SMTRunnerEventsListener listener : myEventsListeners) {
-      listener.onTestFailed(test);
+      listener.onTestIgnored(test);
     }
   }
 
