diff --git a/src/de/danoeh/antennapod/fragment/gpodnet/TagListFragment.java b/src/de/danoeh/antennapod/fragment/gpodnet/TagListFragment.java
index 80e896c..880726e 100644
--- a/src/de/danoeh/antennapod/fragment/gpodnet/TagListFragment.java
+++ b/src/de/danoeh/antennapod/fragment/gpodnet/TagListFragment.java
@@ -37,12 +37,12 @@
         super.onCreateOptionsMenu(menu, inflater);
         final SearchView sv = new SearchView(getActivity());
         MenuItemUtils.addSearchItem(menu, sv);
-        sv.setQueryHint(getString(R.string.search_hint));
+        sv.setQueryHint(getString(R.string.gpodnet_search_hint));
         sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
             @Override
             public boolean onQueryTextSubmit(String s) {
                 sv.clearFocus();
-                ((MainActivity) getActivity()).loadChildFragment(SearchFragment.newInstance(s));
+                ((MainActivity) getActivity()).loadChildFragment(SearchListFragment.newInstance(s));
                 return true;
             }
 
