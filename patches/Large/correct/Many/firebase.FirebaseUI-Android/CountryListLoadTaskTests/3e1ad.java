diff --git a/auth/src/test/java/com/firebase/ui/auth/ui/phone/CountryListLoadTaskTests.java b/auth/src/test/java/com/firebase/ui/auth/ui/phone/CountryListLoadTaskTests.java
index 480e04f..b2a49e8 100644
--- a/auth/src/test/java/com/firebase/ui/auth/ui/phone/CountryListLoadTaskTests.java
+++ b/auth/src/test/java/com/firebase/ui/auth/ui/phone/CountryListLoadTaskTests.java
@@ -301,7 +301,7 @@
 
     @Test
     public void testExecute_withoutUserInput_expectAllCountriesAdded() {
-        mTask = new CountryListLoadTask(mListener, null, null);
+        mTask = new CountryListLoadTask(null, null, mListener);
 
         mTask.execute();
 
@@ -325,7 +325,7 @@
         List<CountryInfo> expectedOutput = new ArrayList<>();
         expectedOutput.add(new CountryInfo(new Locale("", "US"), 1));
 
-        mTask = new CountryListLoadTask(mListener, whitelistedCountryIsos, null);
+        mTask = new CountryListLoadTask(whitelistedCountryIsos, null, mListener);
 
         mTask.execute();
 
@@ -348,7 +348,7 @@
         List<CountryInfo> expectedOutput = new ArrayList<>(COUNTRY_LIST);
         expectedOutput.remove(new CountryInfo(new Locale("", "US"), 1));
 
-        mTask = new CountryListLoadTask(mListener, null, blacklistedCountryIsos);
+        mTask = new CountryListLoadTask(null, blacklistedCountryIsos, mListener);
 
         mTask.execute();
 
@@ -373,7 +373,7 @@
             expectedOutput.add(new CountryInfo(new Locale("", iso), 1));
         }
 
-        mTask = new CountryListLoadTask(mListener, whitelistedCountries, null);
+        mTask = new CountryListLoadTask(whitelistedCountries, null, mListener);
 
         mTask.execute();
 
@@ -401,7 +401,7 @@
         List<CountryInfo> expectedOutput = new ArrayList<>(COUNTRY_LIST);
         expectedOutput.removeAll(excludedCountries);
 
-        mTask = new CountryListLoadTask(mListener, null, blacklistedCountries);
+        mTask = new CountryListLoadTask(null, blacklistedCountries, mListener);
 
         mTask.execute();
 
@@ -429,7 +429,7 @@
 
     @Test
     public void testOnPostExecute() {
-        mTask = new CountryListLoadTask(mListener, null, null);
+        mTask = new CountryListLoadTask(null, null, mListener);
         mTask.onPostExecute(COUNTRY_LIST);
         verify(mListener).onLoadComplete(COUNTRY_LIST);
     }
