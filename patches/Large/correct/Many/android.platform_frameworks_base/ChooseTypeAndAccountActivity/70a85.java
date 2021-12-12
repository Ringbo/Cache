diff --git a/core/java/android/accounts/ChooseTypeAndAccountActivity.java b/core/java/android/accounts/ChooseTypeAndAccountActivity.java
index b4030b9..852c4dd 100644
--- a/core/java/android/accounts/ChooseTypeAndAccountActivity.java
+++ b/core/java/android/accounts/ChooseTypeAndAccountActivity.java
@@ -141,10 +141,10 @@
 
         // Read the validAccountTypes, if present, and add them to the setOfAllowableAccountTypes
         Set<String> setOfAllowableAccountTypes = null;
-        final ArrayList<String> validAccountTypes =
-                intent.getStringArrayListExtra(EXTRA_ALLOWABLE_ACCOUNT_TYPES_STRING_ARRAY);
+        final String[] validAccountTypes =
+                intent.getStringArrayExtra(EXTRA_ALLOWABLE_ACCOUNT_TYPES_STRING_ARRAY);
         if (validAccountTypes != null) {
-            setOfAllowableAccountTypes = new HashSet<String>(validAccountTypes.size());
+            setOfAllowableAccountTypes = new HashSet<String>(validAccountTypes.length);
             for (String type : validAccountTypes) {
                 setOfAllowableAccountTypes.add(type);
             }
@@ -266,14 +266,14 @@
 
     private void startChooseAccountTypeActivity() {
         final Intent intent = new Intent(this, ChooseAccountTypeActivity.class);
-        intent.putStringArrayListExtra(EXTRA_ALLOWABLE_ACCOUNT_TYPES_STRING_ARRAY,
-                getIntent().getStringArrayListExtra(EXTRA_ALLOWABLE_ACCOUNT_TYPES_STRING_ARRAY));
+        intent.putExtra(EXTRA_ALLOWABLE_ACCOUNT_TYPES_STRING_ARRAY,
+                getIntent().getStringArrayExtra(EXTRA_ALLOWABLE_ACCOUNT_TYPES_STRING_ARRAY));
         intent.putExtra(EXTRA_ADD_ACCOUNT_OPTIONS_BUNDLE,
                 getIntent().getBundleExtra(EXTRA_ADD_ACCOUNT_OPTIONS_BUNDLE));
         intent.putExtra(EXTRA_ADD_ACCOUNT_REQUIRED_FEATURES_STRING_ARRAY,
                 getIntent().getStringArrayExtra(EXTRA_ADD_ACCOUNT_REQUIRED_FEATURES_STRING_ARRAY));
         intent.putExtra(EXTRA_ADD_ACCOUNT_AUTH_TOKEN_TYPE_STRING,
-                getIntent().getStringArrayExtra(EXTRA_ADD_ACCOUNT_AUTH_TOKEN_TYPE_STRING));
+                getIntent().getStringExtra(EXTRA_ADD_ACCOUNT_AUTH_TOKEN_TYPE_STRING));
         startActivityForResult(intent, 0);
     }
 
