diff --git a/cmds/pm/src/com/android/commands/pm/Pm.java b/cmds/pm/src/com/android/commands/pm/Pm.java
index ebf5085..393956f 100644
--- a/cmds/pm/src/com/android/commands/pm/Pm.java
+++ b/cmds/pm/src/com/android/commands/pm/Pm.java
@@ -624,7 +624,7 @@
                 }
             }
 
-            String grp = nextOption();
+            String grp = nextArg();
             ArrayList<String> groupList = new ArrayList<String>();
             if (groups) {
                 List<PermissionGroupInfo> infos =
