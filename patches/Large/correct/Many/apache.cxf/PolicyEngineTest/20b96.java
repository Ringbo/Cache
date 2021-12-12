diff --git a/rt/ws/policy/src/test/java/org/apache/cxf/ws/policy/PolicyEngineTest.java b/rt/ws/policy/src/test/java/org/apache/cxf/ws/policy/PolicyEngineTest.java
index e56ebbe..3255620 100644
--- a/rt/ws/policy/src/test/java/org/apache/cxf/ws/policy/PolicyEngineTest.java
+++ b/rt/ws/policy/src/test/java/org/apache/cxf/ws/policy/PolicyEngineTest.java
@@ -236,7 +236,7 @@
         BindingOperationInfo boi = createMockBindingOperationInfo(); 
         EffectivePolicyImpl epi = control.createMock(EffectivePolicyImpl.class);
         EasyMock.expect(engine.createOutPolicyInfo()).andReturn(epi);
-        epi.initialise(ei, boi, engine, true, true);
+        epi.initialise(ei, boi, engine, true, false);
         EasyMock.expectLastCall();
         control.replay();
         assertSame(epi, engine.getEffectiveClientResponsePolicy(ei, boi));
