diff --git a/core/java/android/preference/PreferenceScreen.java b/core/java/android/preference/PreferenceScreen.java
index 6ea2528..95e54324 100644
--- a/core/java/android/preference/PreferenceScreen.java
+++ b/core/java/android/preference/PreferenceScreen.java
@@ -150,7 +150,7 @@
 
         // Set the title bar if title is available, else no title bar
         final CharSequence title = getTitle();
-        Dialog dialog = mDialog = new Dialog(context, !TextUtils.isEmpty(title)
+        Dialog dialog = mDialog = new Dialog(context, TextUtils.isEmpty(title)
                 ? com.android.internal.R.style.Theme_NoTitleBar
                 : com.android.internal.R.style.Theme);
         dialog.setContentView(listView);
