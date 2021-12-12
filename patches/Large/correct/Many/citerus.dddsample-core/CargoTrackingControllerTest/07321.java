diff --git a/dddsample/src/test/java/se/citerus/dddsample/web/CargoTrackingControllerTest.java b/dddsample/src/test/java/se/citerus/dddsample/web/CargoTrackingControllerTest.java
index dca77a2..28e744c 100644
--- a/dddsample/src/test/java/se/citerus/dddsample/web/CargoTrackingControllerTest.java
+++ b/dddsample/src/test/java/se/citerus/dddsample/web/CargoTrackingControllerTest.java
@@ -52,8 +52,7 @@
                 cargo.finalDestination().unLocode().idString(),
                 StatusCode.CLAIMED,
                 "AAAAA",
-                "BALO",
-                cargo.isMisdirected());
+                "BALO");
         cargoDTO.addEvent(new HandlingEventDTO(
           event.location().unLocode().idString(),
           event.type().toString(),
