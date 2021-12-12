diff --git a/components/camel-aws/src/test/java/org/apache/camel/component/aws/lambda/LambdaOperationsTest.java b/components/camel-aws/src/test/java/org/apache/camel/component/aws/lambda/LambdaOperationsTest.java
index 7e6e3e0..420d658 100644
--- a/components/camel-aws/src/test/java/org/apache/camel/component/aws/lambda/LambdaOperationsTest.java
+++ b/components/camel-aws/src/test/java/org/apache/camel/component/aws/lambda/LambdaOperationsTest.java
@@ -26,7 +26,7 @@
 
     @Test
     public void supportedOperationCount() {
-        assertEquals(7, LambdaOperations.values().length);
+        assertEquals(8, LambdaOperations.values().length);
     }
 
     @Test
