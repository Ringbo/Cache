diff --git a/src/it/feio/android/omninotes/ListFragment.java b/src/it/feio/android/omninotes/ListFragment.java
index 9d3be24..41d8885 100644
--- a/src/it/feio/android/omninotes/ListFragment.java
+++ b/src/it/feio/android/omninotes/ListFragment.java
@@ -544,7 +544,7 @@
 						@Override
 						public boolean onQueryTextChange(String arg0) {
 							if (prefs.getBoolean("settings_instant_search", false)) {
-								Intent i = new Intent(mActivity, ListFragment.class);
+								Intent i = new Intent(mActivity, MainActivity.class);
 								i.setAction(Intent.ACTION_SEARCH);
 								i.putExtra(SearchManager.QUERY, arg0);
 								startActivity(i);
