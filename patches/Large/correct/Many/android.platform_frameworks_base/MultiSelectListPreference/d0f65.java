diff --git a/core/java/android/preference/MultiSelectListPreference.java b/core/java/android/preference/MultiSelectListPreference.java
index 42d555c..2e8d551 100644
--- a/core/java/android/preference/MultiSelectListPreference.java
+++ b/core/java/android/preference/MultiSelectListPreference.java
@@ -169,9 +169,9 @@
                 new DialogInterface.OnMultiChoiceClickListener() {
                     public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                         if (isChecked) {
-                            mPreferenceChanged |= mNewValues.add(mEntries[which].toString());
+                            mPreferenceChanged |= mNewValues.add(mEntryValues[which].toString());
                         } else {
-                            mPreferenceChanged |= mNewValues.remove(mEntries[which].toString());
+                            mPreferenceChanged |= mNewValues.remove(mEntryValues[which].toString());
                         }
                     }
                 });
@@ -180,7 +180,7 @@
     }
     
     private boolean[] getSelectedItems() {
-        final CharSequence[] entries = mEntries;
+        final CharSequence[] entries = mEntryValues;
         final int entryCount = entries.length;
         final Set<String> values = mValues;
         boolean[] result = new boolean[entryCount];
