diff --git a/core/java/android/app/SearchDialog.java b/core/java/android/app/SearchDialog.java
index 022a9d9..6d6aca4 100644
--- a/core/java/android/app/SearchDialog.java
+++ b/core/java/android/app/SearchDialog.java
@@ -991,7 +991,7 @@
     };
 
     @Override
-    public void cancel() {
+    public void dismiss() {
         if (!isShowing()) return;
 
         // We made sure the IME was displayed, so also make sure it is closed
@@ -1003,7 +1003,7 @@
                     getWindow().getDecorView().getWindowToken(), 0);
         }
         
-        super.cancel();
+        super.dismiss();
     }
     
     /**
