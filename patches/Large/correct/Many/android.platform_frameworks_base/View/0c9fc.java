diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 68588b5..774307f 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -14512,7 +14512,7 @@
             }
         }
 
-        onDetachedFromWindows();
+        onDetachedFromWindow();
         onDetachedFromWindowInternal();
 
         InputMethodManager imm = InputMethodManager.peekInstance();
