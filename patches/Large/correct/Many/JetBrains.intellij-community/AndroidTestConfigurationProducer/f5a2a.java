diff --git a/plugins/android/src/org/jetbrains/android/run/testing/AndroidTestConfigurationProducer.java b/plugins/android/src/org/jetbrains/android/run/testing/AndroidTestConfigurationProducer.java
index b8023d1..25beed5 100644
--- a/plugins/android/src/org/jetbrains/android/run/testing/AndroidTestConfigurationProducer.java
+++ b/plugins/android/src/org/jetbrains/android/run/testing/AndroidTestConfigurationProducer.java
@@ -83,7 +83,7 @@
 
   @Nullable
   private RunnerAndConfigurationSettings createClassConfiguration(PsiElement element, ConfigurationContext context) {
-    PsiClass elementClass = PsiTreeUtil.getParentOfType(element, PsiClass.class);
+    PsiClass elementClass = PsiTreeUtil.getParentOfType(element, PsiClass.class, false);
     while (elementClass != null) {
       if (JUnitUtil.isTestClass(elementClass)) {
         RunnerAndConfigurationSettings settings =
