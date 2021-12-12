diff --git a/cmds/pm/src/com/android/commands/pm/Pm.java b/cmds/pm/src/com/android/commands/pm/Pm.java
index 4025553..d44a1df 100644
--- a/cmds/pm/src/com/android/commands/pm/Pm.java
+++ b/cmds/pm/src/com/android/commands/pm/Pm.java
@@ -930,7 +930,7 @@
                 // In non-split user mode, userId can only be SYSTEM
                 int parentUserId = userId >= 0 ? userId : UserHandle.USER_SYSTEM;
                 info = mUm.createRestrictedProfile(name, parentUserId);
-                mAm.addSharedAccountsFromParentUser(userId, parentUserId);
+                mAm.addSharedAccountsFromParentUser(parentUserId, userId);
             } else if (userId < 0) {
                 info = mUm.createUser(name, flags);
             } else {
