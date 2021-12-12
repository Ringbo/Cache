diff --git a/dddsample/src/test/java/se/citerus/dddsample/domain/service/HandlingEventServiceTest.java b/dddsample/src/test/java/se/citerus/dddsample/domain/service/HandlingEventServiceTest.java
index 6d6b14c..4312d81 100644
--- a/dddsample/src/test/java/se/citerus/dddsample/domain/service/HandlingEventServiceTest.java
+++ b/dddsample/src/test/java/se/citerus/dddsample/domain/service/HandlingEventServiceTest.java
@@ -43,7 +43,7 @@
     service.setCarrierMovementRepository(carrierMovementRepository);
     service.setHandlingEventRepository(handlingEventRepository);
     service.setLocationRepository(locationRepository);
-    service.setEventService(domainEventNotifier);
+    service.setDomainEventNotifier(domainEventNotifier);
   }
 
   protected void tearDown() throws Exception {
