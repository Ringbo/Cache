diff --git a/components/camel-flatpack/src/test/java/org/apache/camel/component/flatpack/DelimitedErrorWithUnmarshalTest.java b/components/camel-flatpack/src/test/java/org/apache/camel/component/flatpack/DelimitedErrorWithUnmarshalTest.java
index bf0073b..b4a8fd0 100644
--- a/components/camel-flatpack/src/test/java/org/apache/camel/component/flatpack/DelimitedErrorWithUnmarshalTest.java
+++ b/components/camel-flatpack/src/test/java/org/apache/camel/component/flatpack/DelimitedErrorWithUnmarshalTest.java
@@ -41,7 +41,7 @@
 
     @Test
     public void testCamel() throws Exception {
-        results.expectedMessageCount(2);
+        results.expectedMessageCount(3);
         dataset.setExpectedMessageCount(1);
         results.assertIsSatisfied();
         dataset.assertIsSatisfied();
