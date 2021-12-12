diff --git a/rt/ws/policy/src/test/java/org/apache/cxf/ws/policy/PolicyVerificationInInterceptorTest.java b/rt/ws/policy/src/test/java/org/apache/cxf/ws/policy/PolicyVerificationInInterceptorTest.java
index b926674..2a037f0 100644
--- a/rt/ws/policy/src/test/java/org/apache/cxf/ws/policy/PolicyVerificationInInterceptorTest.java
+++ b/rt/ws/policy/src/test/java/org/apache/cxf/ws/policy/PolicyVerificationInInterceptorTest.java
@@ -148,7 +148,7 @@
         if (setupBindingOperationInfo && null == boi) {
             boi = control.createMock(BindingOperationInfo.class);
         }
-        EasyMock.expect(exchange.get(BindingOperationInfo.class)).andReturn(boi);
+        EasyMock.expect(exchange.getBindingOperationInfo()).andReturn(boi);
         if (!setupBindingOperationInfo) {
             return;
         }
