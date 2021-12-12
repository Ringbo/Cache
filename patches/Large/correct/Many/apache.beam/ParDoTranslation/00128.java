diff --git a/runners/core-construction-java/src/main/java/org/apache/beam/runners/core/construction/ParDoTranslation.java b/runners/core-construction-java/src/main/java/org/apache/beam/runners/core/construction/ParDoTranslation.java
index 6ae95e4..2c94a8b 100644
--- a/runners/core-construction-java/src/main/java/org/apache/beam/runners/core/construction/ParDoTranslation.java
+++ b/runners/core-construction-java/src/main/java/org/apache/beam/runners/core/construction/ParDoTranslation.java
@@ -450,7 +450,13 @@
 
   private static DoFnAndMainOutput doFnAndMainOutputTagFromProto(SdkFunctionSpec fnSpec)
       throws InvalidProtocolBufferException {
-    checkArgument(fnSpec.getSpec().getUrn().equals(CUSTOM_JAVA_DO_FN_URN));
+    checkArgument(
+        fnSpec.getSpec().getUrn().equals(CUSTOM_JAVA_DO_FN_URN),
+        "Expected %s to be %s with URN %s, but URN was %s",
+        DoFn.class.getSimpleName(),
+        FunctionSpec.class.getSimpleName(),
+        CUSTOM_JAVA_DO_FN_URN,
+        fnSpec.getSpec().getUrn());
     byte[] serializedFn =
         fnSpec.getSpec().getPayload().toByteArray();
     return (DoFnAndMainOutput)
