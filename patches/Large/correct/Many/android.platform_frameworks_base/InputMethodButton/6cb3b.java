diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/tablet/InputMethodButton.java b/packages/SystemUI/src/com/android/systemui/statusbar/tablet/InputMethodButton.java
index aa431bc..ddce6bf 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/tablet/InputMethodButton.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/tablet/InputMethodButton.java
@@ -162,7 +162,7 @@
     // * There are no explicitly enabled (by the user) subtypes of the IME, or the IME doesn't have
     // its subtypes at all
     private boolean needsToShowIMEButton() {
-        List<InputMethodInfo> imis = mImm.getInputMethodList();
+        List<InputMethodInfo> imis = mImm.getEnabledInputMethodList();
         final int size = imis.size();
         return size > 1
                 || (size == 1 && mImm.getEnabledInputMethodSubtypeList(imis.get(0)).size() > 1);
