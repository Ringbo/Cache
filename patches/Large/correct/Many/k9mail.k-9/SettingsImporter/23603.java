diff --git a/k9mail/src/main/java/com/fsck/k9/preferences/SettingsImporter.java b/k9mail/src/main/java/com/fsck/k9/preferences/SettingsImporter.java
index 908714c..133f0a8 100644
--- a/k9mail/src/main/java/com/fsck/k9/preferences/SettingsImporter.java
+++ b/k9mail/src/main/java/com/fsck/k9/preferences/SettingsImporter.java
@@ -93,13 +93,13 @@
     public static class ImportResults {
         public final boolean globalSettings;
         public final List<AccountDescriptionPair> importedAccounts;
-        public final List<AccountDescription> errorneousAccounts;
+        public final List<AccountDescription> erroneousAccounts;
 
         private ImportResults(boolean globalSettings, List<AccountDescriptionPair> importedAccounts,
-                List<AccountDescription> errorneousAccounts) {
+                List<AccountDescription> erroneousAccounts) {
            this.globalSettings = globalSettings;
            this.importedAccounts = importedAccounts;
-           this.errorneousAccounts = errorneousAccounts;
+           this.erroneousAccounts = erroneousAccounts;
         }
     }
 
@@ -179,7 +179,7 @@
         {
             boolean globalSettingsImported = false;
             List<AccountDescriptionPair> importedAccounts = new ArrayList<>();
-            List<AccountDescription> errorneousAccounts = new ArrayList<>();
+            List<AccountDescription> erroneousAccounts = new ArrayList<>();
 
             Imported imported = parseSettings(inputStream, globalSettings, accountUuids, false);
 
@@ -252,17 +252,17 @@
                                         Log.w(K9.LOG_TAG, "Error while committing settings for account \"" +
                                                 importResult.original.name + "\" to the settings database.");
                                     }
-                                    errorneousAccounts.add(importResult.original);
+                                    erroneousAccounts.add(importResult.original);
                                 }
                             } catch (InvalidSettingValueException e) {
                                 if (K9.DEBUG) {
                                     Log.e(K9.LOG_TAG, "Encountered invalid setting while " +
                                             "importing account \"" + account.name + "\"", e);
                                 }
-                                errorneousAccounts.add(new AccountDescription(account.name, account.uuid));
+                                erroneousAccounts.add(new AccountDescription(account.name, account.uuid));
                             } catch (Exception e) {
                                 Log.e(K9.LOG_TAG, "Exception while importing account \"" + account.name + "\"", e);
-                                errorneousAccounts.add(new AccountDescription(account.name, account.uuid));
+                                erroneousAccounts.add(new AccountDescription(account.name, account.uuid));
                             }
                         } else {
                             Log.w(K9.LOG_TAG, "Was asked to import account with UUID " + accountUuid + 
@@ -289,7 +289,7 @@
             K9.loadPrefs(preferences);
             K9.setServicesEnabled(context);
 
-            return new ImportResults(globalSettingsImported, importedAccounts, errorneousAccounts);
+            return new ImportResults(globalSettingsImported, importedAccounts, erroneousAccounts);
 
         } catch (SettingsImportExportException e) {
             throw e;
