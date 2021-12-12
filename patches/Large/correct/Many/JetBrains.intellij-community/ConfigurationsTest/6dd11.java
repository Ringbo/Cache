diff --git a/plugins/testng/testSources/com/theoryinpractice/testng/configuration/ConfigurationsTest.java b/plugins/testng/testSources/com/theoryinpractice/testng/configuration/ConfigurationsTest.java
index c1b9ed3..91ff57d 100644
--- a/plugins/testng/testSources/com/theoryinpractice/testng/configuration/ConfigurationsTest.java
+++ b/plugins/testng/testSources/com/theoryinpractice/testng/configuration/ConfigurationsTest.java
@@ -76,7 +76,7 @@
     final RenameRefactoring renameClass = RefactoringFactory.getInstance(project).createRename(psiClass, newName);
     renameClass.setSearchInComments(false);
     renameClass.setSearchInNonJavaFiles(false);
-    new WriteCommandAction(project, null) {
+    new WriteCommandAction(project) {
       protected void run(final Result result) throws Throwable {
         renameClass.run();
       }
@@ -88,7 +88,7 @@
     final RenameRefactoring renameNotATestMethod = RefactoringFactory.getInstance(project).createRename(notATestMethod, "aaaa");
     renameNotATestMethod.setSearchInComments(false);
     renameNotATestMethod.setSearchInNonJavaFiles(false);
-    new WriteCommandAction(project, null) {
+    new WriteCommandAction(project) {
       protected void run(final Result result) throws Throwable {
         renameNotATestMethod.run();
       }
@@ -112,7 +112,7 @@
     final RenameRefactoring renameMethod = RefactoringFactory.getInstance(project).createRename(method, newMethodName);
     renameMethod.setSearchInComments(false);
     renameMethod.setSearchInNonJavaFiles(false);
-    new WriteCommandAction(project, null) {
+    new WriteCommandAction(project) {
       protected void run(final Result result) throws Throwable {
         renameMethod.run();
       }
@@ -125,7 +125,7 @@
     final RenameRefactoring renameNotATestMethod1 = RefactoringFactory.getInstance(project).createRename(notATestMethod, "bbbbb");
     renameNotATestMethod1.setSearchInComments(false);
     renameNotATestMethod1.setSearchInNonJavaFiles(false);
-    new WriteCommandAction(project, null) {
+    new WriteCommandAction(project) {
       protected void run(final Result result) throws Throwable {
         renameNotATestMethod1.run();
       }
