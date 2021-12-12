diff --git a/idea/testData/safeDelete/deleteValueParameter/kotlinValueParameterWithJava/safeUsagesExt2.java b/idea/testData/safeDelete/deleteValueParameter/kotlinValueParameterWithJava/safeUsagesExt2.java
index 1f6b372..2265616 100644
--- a/idea/testData/safeDelete/deleteValueParameter/kotlinValueParameterWithJava/safeUsagesExt2.java
+++ b/idea/testData/safeDelete/deleteValueParameter/kotlinValueParameterWithJava/safeUsagesExt2.java
@@ -2,6 +2,6 @@
 
 class B {
     void bar(A a) {
-        TestPackage.foo(a, 1, "1", "!");
+        SafeUsagesExt2Kt.foo(a, 1, "1", "!");
     }
 }
\ No newline at end of file
