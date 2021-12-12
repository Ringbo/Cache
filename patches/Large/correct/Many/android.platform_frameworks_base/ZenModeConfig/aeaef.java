diff --git a/core/java/android/service/notification/ZenModeConfig.java b/core/java/android/service/notification/ZenModeConfig.java
index 510626b..5546e80 100644
--- a/core/java/android/service/notification/ZenModeConfig.java
+++ b/core/java/android/service/notification/ZenModeConfig.java
@@ -93,11 +93,11 @@
     private static final boolean DEFAULT_ALLOW_ALARMS = true;
     private static final boolean DEFAULT_ALLOW_MEDIA = true;
     private static final boolean DEFAULT_ALLOW_SYSTEM = false;
-    private static final boolean DEFAULT_ALLOW_CALLS = false;
+    private static final boolean DEFAULT_ALLOW_CALLS = true;
     private static final boolean DEFAULT_ALLOW_MESSAGES = false;
     private static final boolean DEFAULT_ALLOW_REMINDERS = false;
     private static final boolean DEFAULT_ALLOW_EVENTS = false;
-    private static final boolean DEFAULT_ALLOW_REPEAT_CALLERS = false;
+    private static final boolean DEFAULT_ALLOW_REPEAT_CALLERS = true;
     private static final boolean DEFAULT_CHANNELS_BYPASSING_DND = false;
     private static final int DEFAULT_SUPPRESSED_VISUAL_EFFECTS = 0;
 
@@ -486,7 +486,7 @@
                         rt.allowCallsFrom = from;
                         rt.allowMessagesFrom = from;
                     } else {
-                        rt.allowCallsFrom = DEFAULT_SOURCE;
+                        rt.allowCallsFrom = DEFAULT_CALLS_SOURCE;
                         rt.allowMessagesFrom = DEFAULT_SOURCE;
                     }
                     rt.allowAlarms = safeBoolean(parser, ALLOW_ATT_ALARMS, DEFAULT_ALLOW_ALARMS);
