diff --git a/plugins/testng/src/com/theoryinpractice/testng/inspection/UndeclaredTestInspection.java b/plugins/testng/src/com/theoryinpractice/testng/inspection/UndeclaredTestInspection.java
index 0195521..0ce0a31 100644
--- a/plugins/testng/src/com/theoryinpractice/testng/inspection/UndeclaredTestInspection.java
+++ b/plugins/testng/src/com/theoryinpractice/testng/inspection/UndeclaredTestInspection.java
@@ -127,20 +127,20 @@
   }
 
   private static class RegisterClassFix implements LocalQuickFix {
-    private final PsiClass myClass;
+    private final String myClassName;
 
     public RegisterClassFix(final PsiClass aClass) {
-      myClass = aClass;
+      myClassName = aClass.getName();
     }
 
     @NotNull
     public String getName() {
-      return "Register \'" + myClass.getName() + "\'";
+      return "Register \'" + myClassName + "\'";
     }
 
     @NotNull
     public String getFamilyName() {
-      return getName();
+      return "Register test";
     }
 
     public void applyFix(@NotNull final Project project, @NotNull ProblemDescriptor descriptor) {
@@ -191,12 +191,12 @@
   private static class CreateTestngFix implements LocalQuickFix {
     @NotNull
     public String getName() {
-      return "Create suite";
+      return getFamilyName();
     }
 
     @NotNull
     public String getFamilyName() {
-      return getName();
+      return "Create suite";
     }
 
     public void applyFix(@NotNull final Project project, @NotNull final ProblemDescriptor descriptor) {
