diff --git a/services/core/java/com/android/server/accounts/AccountManagerService.java b/services/core/java/com/android/server/accounts/AccountManagerService.java
index 0d4f5cb..0ffc779 100644
--- a/services/core/java/com/android/server/accounts/AccountManagerService.java
+++ b/services/core/java/com/android/server/accounts/AccountManagerService.java
@@ -2118,13 +2118,14 @@
                             userId));
         }
         /*
-         * Only the system or authenticator should be allowed to remove accounts for that
-         * authenticator.  This will let users remove accounts (via Settings in the system) but not
-         * arbitrary applications (like competing authenticators).
+         * Only the system, authenticator or profile owner should be allowed to remove accounts for
+         * that authenticator.  This will let users remove accounts (via Settings in the system) but
+         * not arbitrary applications (like competing authenticators).
          */
         UserHandle user = UserHandle.of(userId);
         if (!isAccountManagedByCaller(account.type, callingUid, user.getIdentifier())
-                && !isSystemUid(callingUid)) {
+                && !isSystemUid(callingUid)
+                && !isProfileOwner(callingUid)) {
             String msg = String.format(
                     "uid %s cannot remove accounts of type: %s",
                     callingUid,
