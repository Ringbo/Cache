diff --git a/core/java/android/accounts/AccountManagerService.java b/core/java/android/accounts/AccountManagerService.java
index 2b643c2..306159dd 100644
--- a/core/java/android/accounts/AccountManagerService.java
+++ b/core/java/android/accounts/AccountManagerService.java
@@ -163,7 +163,8 @@
                 new HashMap<Account, Integer>();
         private final Object cacheLock = new Object();
         /** protected by the {@link #cacheLock} */
-        private final HashMap<String, Account[]> accountCache = new HashMap<String, Account[]>();
+        private final HashMap<String, Account[]> accountCache =
+                new LinkedHashMap<String, Account[]>();
         /** protected by the {@link #cacheLock} */
         private HashMap<Account, HashMap<String, String>> userDataCache =
                 new HashMap<Account, HashMap<String, String>>();
@@ -296,7 +297,7 @@
             try {
                 accounts.accountCache.clear();
                 final HashMap<String, ArrayList<String>> accountNamesByType =
-                        new HashMap<String, ArrayList<String>>();
+                        new LinkedHashMap<String, ArrayList<String>>();
                 while (cursor.moveToNext()) {
                     final long accountId = cursor.getLong(0);
                     final String accountType = cursor.getString(1);
