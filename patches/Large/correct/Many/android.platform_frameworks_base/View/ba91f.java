diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 1e92a06..65a0ccb 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -14512,7 +14512,7 @@
             }
         }
 
-        onDetachedFromWindows();
+        onDetachedFromWindow();
         onDetachedFromWindowInternal();
 
         InputMethodManager imm = InputMethodManager.peekInstance();
