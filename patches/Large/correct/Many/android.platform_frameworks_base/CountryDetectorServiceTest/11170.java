diff --git a/services/tests/servicestests/src/com/android/server/CountryDetectorServiceTest.java b/services/tests/servicestests/src/com/android/server/CountryDetectorServiceTest.java
index 17a1585..192c50c 100644
--- a/services/tests/servicestests/src/com/android/server/CountryDetectorServiceTest.java
+++ b/services/tests/servicestests/src/com/android/server/CountryDetectorServiceTest.java
@@ -66,7 +66,7 @@
 
     public void testAddRemoveListener() throws RemoteException {
         CountryDetectorServiceTester serviceTester = new CountryDetectorServiceTester(getContext());
-        serviceTester.systemReady();
+        serviceTester.systemRunning();
         waitForSystemReady(serviceTester);
         CountryListenerTester listenerTester = new CountryListenerTester();
         serviceTester.addCountryListener(listenerTester);
@@ -80,7 +80,7 @@
         CountryListenerTester listenerTesterA = new CountryListenerTester();
         CountryListenerTester listenerTesterB = new CountryListenerTester();
         Country country = new Country("US", Country.COUNTRY_SOURCE_NETWORK);
-        serviceTester.systemReady();
+        serviceTester.systemRunning();
         waitForSystemReady(serviceTester);
         serviceTester.addCountryListener(listenerTesterA);
         serviceTester.addCountryListener(listenerTesterB);
