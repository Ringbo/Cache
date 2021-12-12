diff --git a/java/java-tests/testSrc/com/intellij/refactoring/InheritanceToDelegationTest.java b/java/java-tests/testSrc/com/intellij/refactoring/InheritanceToDelegationTest.java
index 25663b9..ec9beac 100644
--- a/java/java-tests/testSrc/com/intellij/refactoring/InheritanceToDelegationTest.java
+++ b/java/java-tests/testSrc/com/intellij/refactoring/InheritanceToDelegationTest.java
@@ -126,9 +126,9 @@
     final boolean delegateOtherMembers, final boolean generateGetter) {
     return new PerformAction() {
       public void performAction(VirtualFile rootDir, VirtualFile rootAfter) throws Exception {
-        PsiClass aClass = myJavaFacade.findClass(className, GlobalSearchScope.projectScope(getProject()));
+        PsiClass aClass = myJavaFacade.findClass(className, GlobalSearchScope.allScope(getProject()));
         assertNotNull("Class " + className + " not found", aClass);
-        PsiClass baseClass = myJavaFacade.findClass(baseClassName, GlobalSearchScope.projectScope(getProject()));
+        PsiClass baseClass = myJavaFacade.findClass(baseClassName, GlobalSearchScope.allScope(getProject()));
         assertNotNull("Base class " + baseClassName + " not found", baseClass);
         final PsiMethod[] methods = baseClass.getMethods();
         final PsiMethod[] delegatedMethods = new PsiMethod[methodIndices.length];
@@ -138,7 +138,7 @@
         final PsiClass[] delegatedInterfaces = new PsiClass[delegatedInterfaceNames.length];
         for (int i = 0; i < delegatedInterfaceNames.length; i++) {
           String delegatedInterfaceName = delegatedInterfaceNames[i];
-          PsiClass anInterface = myJavaFacade.findClass(delegatedInterfaceName, GlobalSearchScope.projectScope(getProject()));
+          PsiClass anInterface = myJavaFacade.findClass(delegatedInterfaceName, GlobalSearchScope.allScope(getProject()));
           assertNotNull(anInterface);
           delegatedInterfaces[i] = anInterface;
         }
@@ -156,9 +156,9 @@
     final boolean delegateOtherMembers, final boolean generateGetter) {
     return new PerformAction() {
       public void performAction(VirtualFile rootDir, VirtualFile rootAfter) throws Exception {
-        PsiClass aClass = myJavaFacade.findClass(className, GlobalSearchScope.projectScope(getProject()));
+        PsiClass aClass = myJavaFacade.findClass(className, GlobalSearchScope.allScope(getProject()));
         assertNotNull("Class " + className + " not found", aClass);
-        PsiClass baseClass = myJavaFacade.findClass(baseClassName, GlobalSearchScope.projectScope(getProject()));
+        PsiClass baseClass = myJavaFacade.findClass(baseClassName, GlobalSearchScope.allScope(getProject()));
         assertNotNull("Base class " + baseClassName + " not found", baseClass);
         final PsiMethod[] delegatedMethods;
         final List<PsiMethod> methodsList = new ArrayList<PsiMethod>();
@@ -171,7 +171,7 @@
         final PsiClass[] delegatedInterfaces = new PsiClass[delegatedInterfaceNames.length];
         for (int i = 0; i < delegatedInterfaceNames.length; i++) {
           String delegatedInterfaceName = delegatedInterfaceNames[i];
-          PsiClass anInterface = myJavaFacade.findClass(delegatedInterfaceName, GlobalSearchScope.projectScope(getProject()));
+          PsiClass anInterface = myJavaFacade.findClass(delegatedInterfaceName, GlobalSearchScope.allScope(getProject()));
           assertNotNull(anInterface);
           delegatedInterfaces[i] = anInterface;
         }
