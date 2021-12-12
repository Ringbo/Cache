diff --git a/jfoenix/src/main/java/com/jfoenix/transitions/hamburger/HamburgerBasicCloseTransition.java b/jfoenix/src/main/java/com/jfoenix/transitions/hamburger/HamburgerBasicCloseTransition.java
index 938b046..85a22b4 100644
--- a/jfoenix/src/main/java/com/jfoenix/transitions/hamburger/HamburgerBasicCloseTransition.java
+++ b/jfoenix/src/main/java/com/jfoenix/transitions/hamburger/HamburgerBasicCloseTransition.java
@@ -59,7 +59,7 @@
             .getMinY();
 
         double hypotenuse = Math.sqrt(Math.pow(burgerHeight, 2) + Math.pow(burgerWidth, 2));
-        double angle = (Math.toDegrees(Math.asin(burgerWidth / hypotenuse)) - 90) * -1;
+        double angle = (Math.toDegrees(Math.asin(burgerWidth / hypotenuse)) - 100) * -1;
         return new Timeline(
             new KeyFrame(
                 Duration.ZERO,
