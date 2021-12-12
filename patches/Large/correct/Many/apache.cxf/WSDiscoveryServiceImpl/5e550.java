diff --git a/services/ws-discovery/ws-discovery-api/src/main/java/org/apache/cxf/ws/discovery/internal/WSDiscoveryServiceImpl.java b/services/ws-discovery/ws-discovery-api/src/main/java/org/apache/cxf/ws/discovery/internal/WSDiscoveryServiceImpl.java
index 4141df3..88979a0 100644
--- a/services/ws-discovery/ws-discovery-api/src/main/java/org/apache/cxf/ws/discovery/internal/WSDiscoveryServiceImpl.java
+++ b/services/ws-discovery/ws-discovery-api/src/main/java/org/apache/cxf/ws/discovery/internal/WSDiscoveryServiceImpl.java
@@ -572,7 +572,7 @@
             QName snr = EndpointReferenceUtils.getServiceName(ref, bus);
             QName snc = EndpointReferenceUtils.getServiceName(cref, bus);
             String addr = EndpointReferenceUtils.getAddress(ref);
-            String addc = EndpointReferenceUtils.getAddress(ref);
+            String addc = EndpointReferenceUtils.getAddress(cref);
             
             if (addr == null) {
                 return false;
