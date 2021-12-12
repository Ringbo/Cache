diff --git a/dddsample/src/test/java/se/citerus/dddsample/service/CargoServiceTest.java b/dddsample/src/test/java/se/citerus/dddsample/service/CargoServiceTest.java
index 05d0e6c..bafefc9 100644
--- a/dddsample/src/test/java/se/citerus/dddsample/service/CargoServiceTest.java
+++ b/dddsample/src/test/java/se/citerus/dddsample/service/CargoServiceTest.java
@@ -80,7 +80,7 @@
     Location finalDestination = new Location(new UnLocode("DE","STI"), "Destination");
     final Cargo cargo = new Cargo(new TrackingId("XYZ"), origin, finalDestination);
     Location sesto = new Location(new UnLocode("SE","STO"), "Stockholm");
-    HandlingEvent claimed = new HandlingEvent(cargo, new Date(10), new Date(20), HandlingEvent.Type.CLAIM, sesto);
+    HandlingEvent claimed = new HandlingEvent(cargo, new Date(10), new Date(20), HandlingEvent.Type.CLAIM, sesto, null);
     Location to = new Location(new UnLocode("MU","GER"), "München");
     CarrierMovement carrierMovement = new CarrierMovement(new CarrierMovementId("CAR_001"), sesto, to);
     HandlingEvent loaded = new HandlingEvent(cargo, new Date(12), new Date(25), HandlingEvent.Type.LOAD, sesto, carrierMovement);
