diff --git a/dddsample/src/test/java/se/citerus/dddsample/web/CargoTrackingControllerTest.java b/dddsample/src/test/java/se/citerus/dddsample/web/CargoTrackingControllerTest.java
index ca7bc42..dca77a2 100644
--- a/dddsample/src/test/java/se/citerus/dddsample/web/CargoTrackingControllerTest.java
+++ b/dddsample/src/test/java/se/citerus/dddsample/web/CargoTrackingControllerTest.java
@@ -43,17 +43,17 @@
         final Location a5 = new Location(new UnLocode("AA","AAA"), "AAAAA");
         final Location b5 = new Location(new UnLocode("BB","BBB"), "BBBBB");
         Cargo cargo = new Cargo(trackingId, a5, b5);
-        HandlingEvent event = new HandlingEvent(cargo, new Date(10L), new Date(20L), HandlingEvent.Type.RECEIVE, b5);
-//        cargo.handle(event);
+        HandlingEvent event = new HandlingEvent(cargo, new Date(10L), new Date(20L), HandlingEvent.Type.RECEIVE, b5, null);
 
         // TODO: use DTO assemblers
         CargoWithHistoryDTO cargoDTO = new CargoWithHistoryDTO(
                 cargo.trackingId().idString(),
                 cargo.origin().unLocode().idString(),
                 cargo.finalDestination().unLocode().idString(),
-                StatusCode.claimed,
+                StatusCode.CLAIMED,
                 "AAAAA",
-                "BALO");
+                "BALO",
+                cargo.isMisdirected());
         cargoDTO.addEvent(new HandlingEventDTO(
           event.location().unLocode().idString(),
           event.type().toString(),
