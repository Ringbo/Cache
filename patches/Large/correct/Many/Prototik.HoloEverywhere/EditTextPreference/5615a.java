diff --git a/addons/preferences/src/org/holoeverywhere/preference/EditTextPreference.java b/addons/preferences/src/org/holoeverywhere/preference/EditTextPreference.java
index 1a39dd4..9aed85e 100644
--- a/addons/preferences/src/org/holoeverywhere/preference/EditTextPreference.java
+++ b/addons/preferences/src/org/holoeverywhere/preference/EditTextPreference.java
@@ -46,7 +46,7 @@
 
     public EditTextPreference(Context context, AttributeSet attrs, int defStyle) {
         super(context, attrs, defStyle);
-        mEditText = new EditText(getDialogContext(true));
+        mEditText = new EditText(getDialogContext(true), attrs);
         mEditText.setId(R.id.edit);
         mEditText.setEnabled(true);
     }
