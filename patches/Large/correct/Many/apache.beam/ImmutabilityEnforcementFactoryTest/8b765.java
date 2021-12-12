diff --git a/sdks/java/core/src/test/java/com/google/cloud/dataflow/sdk/runners/inprocess/ImmutabilityEnforcementFactoryTest.java b/sdks/java/core/src/test/java/com/google/cloud/dataflow/sdk/runners/inprocess/ImmutabilityEnforcementFactoryTest.java
index 114c6ab..e65b178 100644
--- a/sdks/java/core/src/test/java/com/google/cloud/dataflow/sdk/runners/inprocess/ImmutabilityEnforcementFactoryTest.java
+++ b/sdks/java/core/src/test/java/com/google/cloud/dataflow/sdk/runners/inprocess/ImmutabilityEnforcementFactoryTest.java
@@ -94,7 +94,7 @@
     ModelEnforcement<byte[]> enforcement = factory.forBundle(elements, consumer);
     enforcement.beforeElement(element);
     element.getValue()[0] = 'f';
-    thrown.equals(UserCodeException.class);
+    thrown.expect(UserCodeException.class);
     thrown.expectCause(isA(IllegalMutationException.class));
     thrown.expectMessage(consumer.getFullName());
     thrown.expectMessage("illegaly mutated");
@@ -118,7 +118,7 @@
     enforcement.afterElement(element);
 
     element.getValue()[0] = 'f';
-    thrown.equals(UserCodeException.class);
+    thrown.expect(UserCodeException.class);
     thrown.expectCause(isA(IllegalMutationException.class));
     thrown.expectMessage(consumer.getFullName());
     thrown.expectMessage("illegaly mutated");
