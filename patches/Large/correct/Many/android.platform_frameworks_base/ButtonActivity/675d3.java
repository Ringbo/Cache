diff --git a/tests/ImfTest/src/com/android/imftest/samples/ButtonActivity.java b/tests/ImfTest/src/com/android/imftest/samples/ButtonActivity.java
index 854a3f4..dbaedf9 100644
--- a/tests/ImfTest/src/com/android/imftest/samples/ButtonActivity.java
+++ b/tests/ImfTest/src/com/android/imftest/samples/ButtonActivity.java
@@ -47,7 +47,7 @@
         {
             public void onClick (View v)
             {
-                InputMethodManager imm = InputMethodManager.getInstance(instance);
+                InputMethodManager imm = InputMethodManager.getInstance();
                 if (mKeyboardIsActive)
                 {
                     imm.hideSoftInputFromInputMethod(v.getWindowToken(), 0);
