diff --git a/runners/apex/src/main/java/org/apache/beam/runners/apex/translation/operators/ApexParDoOperator.java b/runners/apex/src/main/java/org/apache/beam/runners/apex/translation/operators/ApexParDoOperator.java
index 56cb0d3..5778352 100644
--- a/runners/apex/src/main/java/org/apache/beam/runners/apex/translation/operators/ApexParDoOperator.java
+++ b/runners/apex/src/main/java/org/apache/beam/runners/apex/translation/operators/ApexParDoOperator.java
@@ -187,10 +187,9 @@
     } else {
       DoFnSignature signature = DoFnSignatures.getSignature(doFn.getClass());
       if (signature.usesState()) {
-        checkArgument(
-            windowedInputCoder instanceof KvCoder, "keyed input required for stateful DoFn");
+        checkArgument(inputCoder instanceof KvCoder, "keyed input required for stateful DoFn");
         @SuppressWarnings("rawtypes")
-        Coder<?> keyCoder = ((KvCoder) windowedInputCoder).getKeyCoder();
+        Coder<?> keyCoder = ((KvCoder) inputCoder).getKeyCoder();
         this.currentKeyStateInternals =
             new StateInternalsProxy<>(stateBackend.newStateInternalsFactory(keyCoder));
       }
