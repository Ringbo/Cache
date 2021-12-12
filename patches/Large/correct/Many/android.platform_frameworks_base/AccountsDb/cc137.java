diff --git a/services/core/java/com/android/server/accounts/AccountsDb.java b/services/core/java/com/android/server/accounts/AccountsDb.java
index 5370026..22543cb 100644
--- a/services/core/java/com/android/server/accounts/AccountsDb.java
+++ b/services/core/java/com/android/server/accounts/AccountsDb.java
@@ -599,7 +599,7 @@
             if (oldVersion == 2) {
                 // Remove uid based table and replace it with packageName based
                 db.execSQL("DROP TRIGGER IF EXISTS " + TABLE_ACCOUNTS + "DeleteVisibility");
-                db.execSQL("DROP TABLE IF EXISTS " + TABLE_ACCOUNTS);
+                db.execSQL("DROP TABLE IF EXISTS " + TABLE_VISIBILITY);
                 createAccountsVisibilityTable(db);
                 createAccountsDeletionVisibilityCleanupTrigger(db);
                 oldVersion++;
