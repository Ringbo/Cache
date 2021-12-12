diff --git a/cmds/pm/src/com/android/commands/pm/Pm.java b/cmds/pm/src/com/android/commands/pm/Pm.java
index d71573f..9813cb1 100644
--- a/cmds/pm/src/com/android/commands/pm/Pm.java
+++ b/cmds/pm/src/com/android/commands/pm/Pm.java
@@ -1033,7 +1033,7 @@
 
             if (info != null) {
                 System.out.println("Success: created user id " + info.id);
-                return 1;
+                return 0;
             } else {
                 System.err.println("Error: couldn't create User.");
                 return 1;
