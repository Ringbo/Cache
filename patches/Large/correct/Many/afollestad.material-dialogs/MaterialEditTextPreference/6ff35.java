diff --git a/library/src/main/java/com/afollestad/materialdialogs/prefs/MaterialEditTextPreference.java b/library/src/main/java/com/afollestad/materialdialogs/prefs/MaterialEditTextPreference.java
index 9ff105b..ba2b1e7 100644
--- a/library/src/main/java/com/afollestad/materialdialogs/prefs/MaterialEditTextPreference.java
+++ b/library/src/main/java/com/afollestad/materialdialogs/prefs/MaterialEditTextPreference.java
@@ -76,7 +76,7 @@
 
         // Create our layout, put the EditText inside, then add to dialog
         ViewGroup layout = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.md_input_dialog_stub, null);
-        mEditText.setText(mValue);
+        mEditText.append(mValue);
         layout.addView(mEditText, new LinearLayout.LayoutParams(
                 ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
 
@@ -87,7 +87,7 @@
         TextView message = (TextView) layout.findViewById(android.R.id.message);
         if (getDialogMessage() != null && getDialogMessage().toString().length() > 0) {
             message.setVisibility(View.VISIBLE);
-            message.append(getDialogMessage());
+            message.setText(getDialogMessage());
         } else {
             message.setVisibility(View.GONE);
         }
