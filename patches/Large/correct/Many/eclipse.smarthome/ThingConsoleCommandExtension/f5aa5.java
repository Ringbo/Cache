diff --git a/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/internal/console/ThingConsoleCommandExtension.java b/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/internal/console/ThingConsoleCommandExtension.java
index 1e1caa1..9913c47 100644
--- a/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/internal/console/ThingConsoleCommandExtension.java
+++ b/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/internal/console/ThingConsoleCommandExtension.java
@@ -67,7 +67,7 @@
                         console.println("Specify thing id to remove: things remove <thingUID> (e.g. \"hue:light:1\")");
                     }
                     return;
-                case SUBCMD_TRIGGER_CHANNEL:
+                case SUBCMD_TRIGGER:
                     if (args.length > 1) {
                         triggerChannel(console, args[1], args[2]);
                     } else {
@@ -108,7 +108,7 @@
         return Arrays.asList(new String[] { buildCommandUsage(SUBCMD_LIST, "lists all things"),
                 buildCommandUsage(SUBCMD_CLEAR, "removes all managed things"),
                 buildCommandUsage(SUBCMD_REMOVE + " <thingUID>", "removes a thing"),
-                buildCommandUsage(SUBCMD_TRIGGER_CHANNEL + " <channelUID> [<event>]",
+                buildCommandUsage(SUBCMD_TRIGGER + " <channelUID> [<event>]",
                         "triggers the <channelUID> with <event> (if given)") });
     }
 
