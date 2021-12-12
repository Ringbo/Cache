diff --git a/src/com/sk89q/util/commands/CommandContext.java b/src/com/sk89q/util/commands/CommandContext.java
index add5221..0b6c64c 100644
--- a/src/com/sk89q/util/commands/CommandContext.java
+++ b/src/com/sk89q/util/commands/CommandContext.java
@@ -47,7 +47,7 @@
         System.arraycopy(args, i, newArgs, 1, args.length - i);
         newArgs[0] = args[0];
         
-        this.args = args;
+        this.args = newArgs;
     }
     
     public String getCommand() {
