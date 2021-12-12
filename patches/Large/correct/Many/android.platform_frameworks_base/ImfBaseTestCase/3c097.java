diff --git a/tests/ImfTest/tests/src/com/android/imftest/samples/ImfBaseTestCase.java b/tests/ImfTest/tests/src/com/android/imftest/samples/ImfBaseTestCase.java
index bc77e04..32f80a3 100644
--- a/tests/ImfTest/tests/src/com/android/imftest/samples/ImfBaseTestCase.java
+++ b/tests/ImfTest/tests/src/com/android/imftest/samples/ImfBaseTestCase.java
@@ -66,7 +66,7 @@
         mExpectAutoPop = (keyboardType  == Configuration.KEYBOARD_NOKEYS ||
                 keyboardType == Configuration.KEYBOARD_UNDEFINED);
 
-        mImm = InputMethodManager.getInstance(mTargetActivity);
+        mImm = InputMethodManager.getInstance();
 
         KeyguardManager keyguardManager =
             (KeyguardManager) getInstrumentation().getContext().getSystemService(
