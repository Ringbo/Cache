diff --git a/idea/testData/safeDelete/deleteProperty/kotlinPropertyWithJava/propertyExt.java b/idea/testData/safeDelete/deleteProperty/kotlinPropertyWithJava/propertyExt.java
index 7babcb8..9041f59 100644
--- a/idea/testData/safeDelete/deleteProperty/kotlinPropertyWithJava/propertyExt.java
+++ b/idea/testData/safeDelete/deleteProperty/kotlinPropertyWithJava/propertyExt.java
@@ -2,6 +2,6 @@
 
 class A {
     void bar() {
-        TestPackage.getFoo("");
+        PropertyExtKt.getFoo("");
     }
 }
\ No newline at end of file
