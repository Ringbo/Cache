diff --git a/core/java/android/widget/ListView.java b/core/java/android/widget/ListView.java
index e37ccf8..42e27b1 100644
--- a/core/java/android/widget/ListView.java
+++ b/core/java/android/widget/ListView.java
@@ -2074,7 +2074,7 @@
     }
 
     private boolean commonKey(int keyCode, int count, KeyEvent event) {
-        if (mAdapter == null) {
+        if (mAdapter == null || !mIsAttached) {
             return false;
         }
 
