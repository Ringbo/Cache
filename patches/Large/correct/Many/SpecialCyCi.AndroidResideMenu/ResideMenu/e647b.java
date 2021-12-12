diff --git a/ResideMenu/src/com/special/ResideMenu/ResideMenu.java b/ResideMenu/src/com/special/ResideMenu/ResideMenu.java
index 2e071da..78ffc5d 100644
--- a/ResideMenu/src/com/special/ResideMenu/ResideMenu.java
+++ b/ResideMenu/src/com/special/ResideMenu/ResideMenu.java
@@ -140,9 +140,9 @@
      */
     public void setShadowVisible(boolean isVisible){
         if (isVisible)
-            imageViewShadow.setImageResource(R.drawable.shadow);
+            imageViewShadow.setBackgroundResource(R.drawable.shadow);
         else
-            imageViewShadow.setImageBitmap(null);
+            imageViewShadow.setBackgroundResource(0);
     }
 
     /**
