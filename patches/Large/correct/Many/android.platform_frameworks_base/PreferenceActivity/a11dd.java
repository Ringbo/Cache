diff --git a/core/java/android/preference/PreferenceActivity.java b/core/java/android/preference/PreferenceActivity.java
index e78d2af..076ba10 100644
--- a/core/java/android/preference/PreferenceActivity.java
+++ b/core/java/android/preference/PreferenceActivity.java
@@ -663,7 +663,7 @@
 
                     TypedArray sa = getResources().obtainAttributes(attrs,
                             com.android.internal.R.styleable.PreferenceHeader);
-                    header.id = sa.getInt(
+                    header.id = sa.getResourceId(
                             com.android.internal.R.styleable.PreferenceHeader_id,
                             (int)HEADER_ID_UNDEFINED);
                     header.title = sa.getText(
