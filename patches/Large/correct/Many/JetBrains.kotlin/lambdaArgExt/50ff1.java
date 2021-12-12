diff --git a/idea/testData/safeDelete/deleteValueParameter/kotlinValueParameterWithJava/lambdaArgExt.java b/idea/testData/safeDelete/deleteValueParameter/kotlinValueParameterWithJava/lambdaArgExt.java
index 7d0fced..df9bf8f 100644
--- a/idea/testData/safeDelete/deleteValueParameter/kotlinValueParameterWithJava/lambdaArgExt.java
+++ b/idea/testData/safeDelete/deleteValueParameter/kotlinValueParameterWithJava/lambdaArgExt.java
@@ -2,7 +2,7 @@
 
 class A {
     void bar() {
-        TestPackage.foo(
+        LambdaArgExtKt.foo(
                 "", 10, new Function1<Integer, Unit>() {
                     public Unit invoke(Integer n) {
                         System.out.println(n);
