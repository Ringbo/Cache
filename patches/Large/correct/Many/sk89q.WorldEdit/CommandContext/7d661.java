diff --git a/src/com/sk89q/minecraft/util/commands/CommandContext.java b/src/com/sk89q/minecraft/util/commands/CommandContext.java
index 9f57a8b..d2740fe 100644
--- a/src/com/sk89q/minecraft/util/commands/CommandContext.java
+++ b/src/com/sk89q/minecraft/util/commands/CommandContext.java
@@ -33,7 +33,7 @@
         int i = 1;
         
         for (; i < args.length; i++) {
-            if (args[i].charAt(0) == '-') {
+            if (args[i].charAt(0) == '-' && args[i].matches("^-[a-zA-Z]+$")) {
                 for (int k = 1; k < args[i].length(); k++) {
                     flags.add(args[i].charAt(k));
                 }
