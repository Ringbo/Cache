diff --git a/sdks/java/core/src/test/java/org/apache/beam/sdk/coders/AvroCoderTest.java b/sdks/java/core/src/test/java/org/apache/beam/sdk/coders/AvroCoderTest.java
index a97acfb..f6329a0 100644
--- a/sdks/java/core/src/test/java/org/apache/beam/sdk/coders/AvroCoderTest.java
+++ b/sdks/java/core/src/test/java/org/apache/beam/sdk/coders/AvroCoderTest.java
@@ -260,7 +260,7 @@
     SerializableUtils.ensureSerializable(coder);
   }
 
-  private final void assertDeterministic(AvroCoder<?> coder) {
+  private void assertDeterministic(AvroCoder<?> coder) {
     try {
       coder.verifyDeterministic();
     } catch (NonDeterministicException e) {
@@ -268,7 +268,7 @@
     }
   }
 
-  private final void assertNonDeterministic(AvroCoder<?> coder,
+  private void assertNonDeterministic(AvroCoder<?> coder,
       Matcher<String> reason1) {
     try {
       coder.verifyDeterministic();
