diff --git a/test-runner/src/android/test/SingleLaunchActivityTestCase.java b/test-runner/src/android/test/SingleLaunchActivityTestCase.java
index b63b3ce..79c554a 100644
--- a/test-runner/src/android/test/SingleLaunchActivityTestCase.java
+++ b/test-runner/src/android/test/SingleLaunchActivityTestCase.java
@@ -75,7 +75,7 @@
     protected void tearDown() throws Exception {
         // If it is the last test case, call finish on the activity.
         sTestCaseCounter --;
-        if (sTestCaseCounter == 1) {
+        if (sTestCaseCounter == 0) {
             sActivity.finish();
         }        
         super.tearDown();
