diff --git a/src/eu/siacs/conversations/ui/SettingsActivity.java b/src/eu/siacs/conversations/ui/SettingsActivity.java
index 1480cd3..c522e05 100644
--- a/src/eu/siacs/conversations/ui/SettingsActivity.java
+++ b/src/eu/siacs/conversations/ui/SettingsActivity.java
@@ -31,7 +31,7 @@
 
 	@Override
 	public void onStop() {
-		super.onPause();
+		super.onStop();
 		PreferenceManager.getDefaultSharedPreferences(this)
 				.unregisterOnSharedPreferenceChangeListener(this);
 	}
