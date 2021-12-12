diff --git a/rt/ws/rm/src/main/java/org/apache/cxf/ws/rm/policy/RMPolicyInterceptorProvider.java b/rt/ws/rm/src/main/java/org/apache/cxf/ws/rm/policy/RMPolicyInterceptorProvider.java
index 2069445..95e796f 100644
--- a/rt/ws/rm/src/main/java/org/apache/cxf/ws/rm/policy/RMPolicyInterceptorProvider.java
+++ b/rt/ws/rm/src/main/java/org/apache/cxf/ws/rm/policy/RMPolicyInterceptorProvider.java
@@ -59,7 +59,7 @@
 
         getInFaultInterceptors().add(rmIn);
         getInFaultInterceptors().add(rmSoap);
-        getInInterceptors().add(rmDelivery);
+        getInFaultInterceptors().add(rmDelivery);
 
         getOutFaultInterceptors().add(rmOut);
         getOutFaultInterceptors().add(rmSoap);
