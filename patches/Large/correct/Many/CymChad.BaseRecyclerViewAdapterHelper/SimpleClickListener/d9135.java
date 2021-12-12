diff --git a/library/src/main/java/com/chad/library/adapter/base/listener/SimpleClickListener.java b/library/src/main/java/com/chad/library/adapter/base/listener/SimpleClickListener.java
index abef23f..b9771af 100644
--- a/library/src/main/java/com/chad/library/adapter/base/listener/SimpleClickListener.java
+++ b/library/src/main/java/com/chad/library/adapter/base/listener/SimpleClickListener.java
@@ -160,7 +160,7 @@
 
         private void resetPressedView(final View pressedView) {
             if (pressedView!=null){
-                pressedView.postDelayed(new Runnable() {
+                pressedView.post(new Runnable() {
                     @Override
                     public void run() {
                         if (pressedView!=null){
@@ -168,7 +168,7 @@
                         }
 
                     }
-                }, 100);
+                });
             }
 
             mIsPrepressed = false;
