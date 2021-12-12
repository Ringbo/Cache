diff --git a/jfoenix/src/main/java/com/jfoenix/transitions/hamburger/HamburgerSlideCloseTransition.java b/jfoenix/src/main/java/com/jfoenix/transitions/hamburger/HamburgerSlideCloseTransition.java
index 87d574f..329e107 100644
--- a/jfoenix/src/main/java/com/jfoenix/transitions/hamburger/HamburgerSlideCloseTransition.java
+++ b/jfoenix/src/main/java/com/jfoenix/transitions/hamburger/HamburgerSlideCloseTransition.java
@@ -89,7 +89,7 @@
             .getMinY();
 
         double hypotenuse = Math.sqrt(Math.pow(burgerHeight, 2) + Math.pow(burgerWidth, 2));
-        double angle = Math.toDegrees(Math.asin(burgerWidth / hypotenuse)) + 90;
+        double angle = Math.toDegrees(Math.asin(burgerWidth / hypotenuse)) + 80;
 
         return new Timeline(
             new KeyFrame(
