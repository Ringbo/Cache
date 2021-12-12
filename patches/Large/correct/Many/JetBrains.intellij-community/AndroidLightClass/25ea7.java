diff --git a/plugins/android/src/org/jetbrains/android/augment/AndroidLightClass.java b/plugins/android/src/org/jetbrains/android/augment/AndroidLightClass.java
index aed9167..31bd51f 100644
--- a/plugins/android/src/org/jetbrains/android/augment/AndroidLightClass.java
+++ b/plugins/android/src/org/jetbrains/android/augment/AndroidLightClass.java
@@ -27,7 +27,7 @@
 /**
  * @author Eugene.Kudelevsky
  */
-public abstract class AndroidLightClass extends LightElement implements PsiClass, SyntheticElement {
+abstract class AndroidLightClass extends LightElement implements PsiClass, SyntheticElement {
   private final PsiClass myContainingClass;
   protected final String myName;
 
