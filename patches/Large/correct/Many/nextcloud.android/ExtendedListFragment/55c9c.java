diff --git a/src/com/owncloud/android/ui/fragment/ExtendedListFragment.java b/src/com/owncloud/android/ui/fragment/ExtendedListFragment.java
index 8aefec0..45f89d0 100644
--- a/src/com/owncloud/android/ui/fragment/ExtendedListFragment.java
+++ b/src/com/owncloud/android/ui/fragment/ExtendedListFragment.java
@@ -103,7 +103,7 @@
     
     @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
-        Log_OC.e(TAG, "onCreateView");
+        Log_OC.d(TAG, "onCreateView");
 
         View v = inflater.inflate(R.layout.list_fragment, null);
         
@@ -154,7 +154,7 @@
     @Override
     public void onSaveInstanceState(Bundle savedInstanceState) {
         super.onSaveInstanceState(savedInstanceState);
-        Log_OC.e(TAG, "onSaveInstanceState()");
+        Log_OC.d(TAG, "onSaveInstanceState()");
         savedInstanceState.putInt(KEY_SAVED_LIST_POSITION, getReferencePosition());
         savedInstanceState.putIntegerArrayList(KEY_INDEXES, mIndexes);
         savedInstanceState.putIntegerArrayList(KEY_FIRST_POSITIONS, mFirstPositions);
