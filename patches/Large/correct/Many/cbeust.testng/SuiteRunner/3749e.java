diff --git a/src/main/java/org/testng/SuiteRunner.java b/src/main/java/org/testng/SuiteRunner.java
index 4f2f946..b30ff8f 100644
--- a/src/main/java/org/testng/SuiteRunner.java
+++ b/src/main/java/org/testng/SuiteRunner.java
@@ -161,7 +161,7 @@
       //
       // Install the method interceptor, if any was passed
       //
-      for (IMethodInterceptor methodInterceptor : methodInterceptors) {
+      for (IMethodInterceptor methodInterceptor : m_methodInterceptors) {
         tr.addMethodInterceptor(methodInterceptor);
       }
 
