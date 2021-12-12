diff --git a/WordPress/src/main/java/org/wordpress/android/datasets/AccountTable.java b/WordPress/src/main/java/org/wordpress/android/datasets/AccountTable.java
index 942774e..70ad360 100644
--- a/WordPress/src/main/java/org/wordpress/android/datasets/AccountTable.java
+++ b/WordPress/src/main/java/org/wordpress/android/datasets/AccountTable.java
@@ -76,7 +76,7 @@
         values.put("about_me", account.getAboutMe());
         values.put("new_email", account.getNewEmail());
         values.put("pending_email_change", account.getPendingEmailChange());
-        values.put("web_address", account.getPendingEmailChange());
+        values.put("web_address", account.getWebAddress());
         database.insertWithOnConflict(ACCOUNT_TABLE, null, values, SQLiteDatabase.CONFLICT_REPLACE);
     }
 
