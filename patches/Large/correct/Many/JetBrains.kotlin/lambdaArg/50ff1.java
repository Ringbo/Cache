diff --git a/idea/testData/safeDelete/deleteValueParameter/kotlinValueParameterWithJava/lambdaArg.java b/idea/testData/safeDelete/deleteValueParameter/kotlinValueParameterWithJava/lambdaArg.java
index d6fc0a0..b0f0019 100644
--- a/idea/testData/safeDelete/deleteValueParameter/kotlinValueParameterWithJava/lambdaArg.java
+++ b/idea/testData/safeDelete/deleteValueParameter/kotlinValueParameterWithJava/lambdaArg.java
@@ -2,7 +2,7 @@
 
 class A {
     void bar() {
-        TestPackage.foo(
+        LambdaArgKt.foo(
                 10, new Function1<Integer, Unit>() {
                     public Unit invoke(Integer n) {
                         System.out.println(n);
