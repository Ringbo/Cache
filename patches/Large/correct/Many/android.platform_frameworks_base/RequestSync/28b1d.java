diff --git a/cmds/requestsync/src/com/android/commands/requestsync/RequestSync.java b/cmds/requestsync/src/com/android/commands/requestsync/RequestSync.java
index 808618f..50ee564 100644
--- a/cmds/requestsync/src/com/android/commands/requestsync/RequestSync.java
+++ b/cmds/requestsync/src/com/android/commands/requestsync/RequestSync.java
@@ -128,15 +128,15 @@
             } else if (opt.equals("--el") || opt.equals("--extra-long")) {
                 final String key = nextArgRequired();
                 final String value = nextArgRequired();
-                mExtras.putLong(key, Long.valueOf(value));
+                mExtras.putLong(key, Long.parseLong(value));
             } else if (opt.equals("--ef") || opt.equals("--extra-float")) {
                 final String key = nextArgRequired();
                 final String value = nextArgRequired();
-                mExtras.putFloat(key, Long.valueOf(value));
+                mExtras.putFloat(key, Long.parseLong(value));
             } else if (opt.equals("--ed") || opt.equals("--extra-double")) {
                 final String key = nextArgRequired();
                 final String value = nextArgRequired();
-                mExtras.putFloat(key, Long.valueOf(value));
+                mExtras.putFloat(key, Long.parseLong(value));
             } else if (opt.equals("--ez") || opt.equals("--extra-bool")) {
                 final String key = nextArgRequired();
                 final String value = nextArgRequired();
