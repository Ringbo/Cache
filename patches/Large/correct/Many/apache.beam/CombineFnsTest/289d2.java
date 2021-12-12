diff --git a/sdks/java/core/src/test/java/org/apache/beam/sdk/transforms/CombineFnsTest.java b/sdks/java/core/src/test/java/org/apache/beam/sdk/transforms/CombineFnsTest.java
index dcb8fdc..9250dfa 100644
--- a/sdks/java/core/src/test/java/org/apache/beam/sdk/transforms/CombineFnsTest.java
+++ b/sdks/java/core/src/test/java/org/apache/beam/sdk/transforms/CombineFnsTest.java
@@ -231,7 +231,7 @@
                 KV.of("b", KV.of(13, UserString.of("13")))),
             Arrays.asList(0L, 4L, 7L, 10L, 16L))
         .withCoder(KvCoder.of(
-            StringUtf8Coder.of(),
+            NullableCoder.of(StringUtf8Coder.of()),
             KvCoder.of(
                 BigEndianIntegerCoder.of(), NullableCoder.of(UserStringCoder.of())))));
 
