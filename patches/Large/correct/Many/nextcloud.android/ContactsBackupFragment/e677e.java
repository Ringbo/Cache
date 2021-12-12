diff --git a/src/main/java/com/owncloud/android/ui/fragment/contactsbackup/ContactsBackupFragment.java b/src/main/java/com/owncloud/android/ui/fragment/contactsbackup/ContactsBackupFragment.java
index 3a61d17..32e9260 100644
--- a/src/main/java/com/owncloud/android/ui/fragment/contactsbackup/ContactsBackupFragment.java
+++ b/src/main/java/com/owncloud/android/ui/fragment/contactsbackup/ContactsBackupFragment.java
@@ -128,11 +128,11 @@
         ActionBar actionBar = contactsPreferenceActivity != null ? contactsPreferenceActivity.getSupportActionBar() : null;
 
         if (actionBar != null) {
-            ThemeUtils.setColoredTitle(actionBar, getString(R.string.actionbar_contacts));
+            ThemeUtils.setColoredTitle(actionBar, getString(R.string.actionbar_contacts), getContext());
             actionBar.setDisplayHomeAsUpEnabled(true);
 
             Drawable backArrow = getResources().getDrawable(R.drawable.ic_arrow_back);
-            actionBar.setHomeAsUpIndicator(ThemeUtils.tintDrawable(backArrow, ThemeUtils.fontColor()));
+            actionBar.setHomeAsUpIndicator(ThemeUtils.tintDrawable(backArrow, ThemeUtils.fontColor(getContext())));
         }
 
         arbitraryDataProvider = new ArbitraryDataProvider(getContext().getContentResolver());
@@ -175,7 +175,7 @@
         }
 
         int accentColor = ThemeUtils.primaryAccentColor(getContext());
-        int fontColor = ThemeUtils.fontColor();
+        int fontColor = ThemeUtils.fontColor(getContext());
 
         backupNow.getBackground().setColorFilter(accentColor, PorterDuff.Mode.SRC_ATOP);
         backupNow.setTextColor(fontColor);
