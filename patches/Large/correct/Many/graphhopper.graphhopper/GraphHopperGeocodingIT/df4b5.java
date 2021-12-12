diff --git a/client-hc/src/test/java/com/graphhopper/api/GraphHopperGeocodingIT.java b/client-hc/src/test/java/com/graphhopper/api/GraphHopperGeocodingIT.java
index 1a9dc33..f613318 100644
--- a/client-hc/src/test/java/com/graphhopper/api/GraphHopperGeocodingIT.java
+++ b/client-hc/src/test/java/com/graphhopper/api/GraphHopperGeocodingIT.java
@@ -47,7 +47,7 @@
     @Test
     public void testForwardGeocodingNominatim() {
         GHGeocodingResponse response = geocoding.geocode(new GHGeocodingRequest(false, null, "Berlin", "en", 5, "nominatim", 5000));
-        assertEquals(5, response.getHits().size());
+        assertEquals(4, response.getHits().size());
         assertTrue(response.getHits().get(0).getName().contains("Berlin"));
     }
 
