diff --git a/test/org/traccar/geocoder/GeocoderTest.java b/test/org/traccar/geocoder/GeocoderTest.java
index a5aecc8..6f4fc17 100644
--- a/test/org/traccar/geocoder/GeocoderTest.java
+++ b/test/org/traccar/geocoder/GeocoderTest.java
@@ -94,7 +94,7 @@
     }
 
     public void testGeocodeFarm() throws InterruptedException {
-        Geocoder geocoder = new GeocodeFarmGeocoder(null, 0);
+        Geocoder geocoder = new GeocodeFarmGeocoder(null, null, 0);
 
         geocoder.getAddress(new AddressFormat(), 34.116302, -118.051519, new Geocoder.ReverseGeocoderCallback() {
             @Override
