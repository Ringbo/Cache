diff --git a/src/main/java/com/sk89q/minecraft/util/commands/CommandContext.java b/src/main/java/com/sk89q/minecraft/util/commands/CommandContext.java
index 604b4d1..0a36b7e 100644
--- a/src/main/java/com/sk89q/minecraft/util/commands/CommandContext.java
+++ b/src/main/java/com/sk89q/minecraft/util/commands/CommandContext.java
@@ -79,7 +79,7 @@
                 int endIndex;
                 for (endIndex = i; endIndex < args.length; ++endIndex) {
                     final String arg2 = args[endIndex];
-                    if (arg2.charAt(arg2.length() - 1) == quotedChar) {
+                    if (arg2.charAt(arg2.length() - 1) == quotedChar && arg2.length() > 1) {
                         if (endIndex != i) build.append(' ');
                         build.append(arg2.substring(endIndex == i ? 1 : 0, arg2.length() - 1));
                         break;
