diff --git a/ReactAndroid/src/main/java/com/facebook/react/views/textinput/ReactTextInputManager.java b/ReactAndroid/src/main/java/com/facebook/react/views/textinput/ReactTextInputManager.java
index 036e74f..758fd16 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/views/textinput/ReactTextInputManager.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/views/textinput/ReactTextInputManager.java
@@ -695,7 +695,7 @@
         contentWidth = mEditText.getCompoundPaddingLeft() + mEditText.getLayout().getWidth() +
           mEditText.getCompoundPaddingRight();
         contentHeight = mEditText.getCompoundPaddingTop() + mEditText.getLayout().getHeight() +
-          mEditText.getCompoundPaddingTop();
+          mEditText.getCompoundPaddingBottom();
       }
 
       // The event that contains the event counter and updates it must be sent first.
