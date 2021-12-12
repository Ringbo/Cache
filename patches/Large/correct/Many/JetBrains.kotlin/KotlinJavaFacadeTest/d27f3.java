diff --git a/idea/tests/org/jetbrains/kotlin/idea/javaFacade/KotlinJavaFacadeTest.java b/idea/tests/org/jetbrains/kotlin/idea/javaFacade/KotlinJavaFacadeTest.java
index 0be910b..1ff0bb5 100644
--- a/idea/tests/org/jetbrains/kotlin/idea/javaFacade/KotlinJavaFacadeTest.java
+++ b/idea/tests/org/jetbrains/kotlin/idea/javaFacade/KotlinJavaFacadeTest.java
@@ -45,7 +45,7 @@
     }
 
     public void testDoNotWrapFunFromLocalClass() {
-        doTestWrapMethod(false);
+        doTestWrapMethod(true);
     }
 
     public void testObjectSubclassing() {
@@ -53,7 +53,7 @@
     }
 
     public void testDoNotWrapFunInAnonymousObject() {
-        doTestWrapMethod(false);
+        doTestWrapMethod(true);
     }
 
     public void testWrapFunInClassWithoutBody() {
@@ -145,7 +145,7 @@
     }
 
     public void testWrapVarPropertyInLocalClass() {
-        doTestWrapProperty(false, false);
+        doTestWrapProperty(true, true);
     }
 
     public void testWrapVarTopLevelAccessor() {
