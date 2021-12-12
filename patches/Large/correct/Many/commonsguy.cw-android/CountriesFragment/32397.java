diff --git a/Fragments/EU4You_6/src/com/commonsware/android/eu4you/CountriesFragment.java b/Fragments/EU4You_6/src/com/commonsware/android/eu4you/CountriesFragment.java
index 8dc3f98..f955d04 100644
--- a/Fragments/EU4You_6/src/com/commonsware/android/eu4you/CountriesFragment.java
+++ b/Fragments/EU4You_6/src/com/commonsware/android/eu4you/CountriesFragment.java
@@ -91,7 +91,7 @@
 	
 	@Override
 	public void onActivityCreated(Bundle state) {
-		super.onCreate(state);
+		super.onActivityCreated(state);
 		
 		setListAdapter(new CountryAdapter());
 		
