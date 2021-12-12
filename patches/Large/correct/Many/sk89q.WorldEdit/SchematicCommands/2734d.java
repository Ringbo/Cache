diff --git a/worldedit-core/src/main/java/com/sk89q/worldedit/command/SchematicCommands.java b/worldedit-core/src/main/java/com/sk89q/worldedit/command/SchematicCommands.java
index 9439f81..a72e7b8 100644
--- a/worldedit-core/src/main/java/com/sk89q/worldedit/command/SchematicCommands.java
+++ b/worldedit-core/src/main/java/com/sk89q/worldedit/command/SchematicCommands.java
@@ -263,7 +263,7 @@
         File dir = worldEdit.getWorkingDirectoryFile(worldEdit.getConfiguration().saveDir);
         List<File> fileList = allFiles(dir);
 
-        if (fileList.isEmpty()) {
+        if (fileList == null || fileList.isEmpty()) {
             actor.printError("No schematics found.");
             return;
         }
