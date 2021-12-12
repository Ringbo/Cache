diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 07abd63..dd6a3f5 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -14553,7 +14553,7 @@
             }
         }
 
-        onDetachedFromWindow();
+        onDetachedFromWindows();
         onDetachedFromWindowInternal();
 
         InputMethodManager imm = InputMethodManager.peekInstance();
