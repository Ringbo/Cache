diff --git a/services/autofill/java/com/android/server/autofill/AutofillManagerServiceImpl.java b/services/autofill/java/com/android/server/autofill/AutofillManagerServiceImpl.java
index 54ea3ba..ef0d7e6 100644
--- a/services/autofill/java/com/android/server/autofill/AutofillManagerServiceImpl.java
+++ b/services/autofill/java/com/android/server/autofill/AutofillManagerServiceImpl.java
@@ -1189,7 +1189,7 @@
     boolean isFieldClassificationEnabledLocked() {
         return Settings.Secure.getIntForUser(
                 mContext.getContentResolver(),
-                Settings.Secure.AUTOFILL_FEATURE_FIELD_CLASSIFICATION, 0,
+                Settings.Secure.AUTOFILL_FEATURE_FIELD_CLASSIFICATION, 1,
                 mUserId) == 1;
     }
 
