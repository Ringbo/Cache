diff --git a/services/java/com/android/server/print/PrintManagerService.java b/services/java/com/android/server/print/PrintManagerService.java
index 8a3997a..98acc27 100644
--- a/services/java/com/android/server/print/PrintManagerService.java
+++ b/services/java/com/android/server/print/PrintManagerService.java
@@ -366,7 +366,7 @@
                 pw.println("PRINT MANAGER STATE (dumpsys print)");
                 final int userStateCount = mUserStates.size();
                 for (int i = 0; i < userStateCount; i++) {
-                    UserState userState = mUserStates.get(i);
+                    UserState userState = mUserStates.valueAt(i);
                     userState.dump(fd, pw, "");
                     pw.println();
                 }
