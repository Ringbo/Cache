diff --git a/src/main/java/net/minecraftforge/server/command/CommandGenerate.java b/src/main/java/net/minecraftforge/server/command/CommandGenerate.java
index c471398..de50825 100644
--- a/src/main/java/net/minecraftforge/server/command/CommandGenerate.java
+++ b/src/main/java/net/minecraftforge/server/command/CommandGenerate.java
@@ -65,7 +65,7 @@
             throw new WrongUsageException("commands.forge.gen.usage");
         }
 
-        BlockPos blockpos = parseBlockPos(sender, args, 1, false);
+        BlockPos blockpos = parseBlockPos(sender, args, 0, false);
         int count = parseInt(args[3], 10);
         int dim = args.length >= 5 ? parseInt(args[4]) : sender.getEntityWorld().provider.getDimension();
         int interval = args.length >= 6 ? parseInt(args[5]) : -1;
