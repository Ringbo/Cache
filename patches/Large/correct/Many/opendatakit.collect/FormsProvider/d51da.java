diff --git a/src/org/odk/collect/android/provider/FormsProvider.java b/src/org/odk/collect/android/provider/FormsProvider.java
index 699cafa..703266f 100644
--- a/src/org/odk/collect/android/provider/FormsProvider.java
+++ b/src/org/odk/collect/android/provider/FormsProvider.java
@@ -118,7 +118,7 @@
                         + FormsColumns.LANGUAGE + ", " 
                         + FormsColumns.SUBMISSION_URI + ", "
                         + FormsColumns.JR_VERSION + ", "
-                        + ((oldVersion == 3) ? "" : (FormsColumns.BASE64_RSA_PUBLIC_KEY + ", "))
+                        + ((oldVersion != 3) ? "" : (FormsColumns.BASE64_RSA_PUBLIC_KEY + ", "))
                         + FormsColumns.JRCACHE_FILE_PATH + ") SELECT " 
                 		+ FormsColumns._ID + ", "
                 		+ FormsColumns.DISPLAY_NAME + ", "
@@ -138,7 +138,7 @@
                                 " WHEN " + MODEL_VERSION + " IS NULL AND " + UI_VERSION + " IS NOT NULL THEN " +
                                     "'.' || CAST(" + UI_VERSION + " AS TEXT)" + 
                                 " ELSE NULL END, "
-                        + ((oldVersion == 3) ? "" : (FormsColumns.BASE64_RSA_PUBLIC_KEY + ", "))
+                        + ((oldVersion != 3) ? "" : (FormsColumns.BASE64_RSA_PUBLIC_KEY + ", "))
                         + FormsColumns.JRCACHE_FILE_PATH + " FROM " + FORMS_TABLE_NAME);
 
         		// risky failures here...
