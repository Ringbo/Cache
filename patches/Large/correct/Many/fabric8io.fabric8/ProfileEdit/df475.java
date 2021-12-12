diff --git a/fabric/fabric-commands/src/main/java/org/fusesource/fabric/commands/ProfileEdit.java b/fabric/fabric-commands/src/main/java/org/fusesource/fabric/commands/ProfileEdit.java
index ab9da9d..9d3afbb 100644
--- a/fabric/fabric-commands/src/main/java/org/fusesource/fabric/commands/ProfileEdit.java
+++ b/fabric/fabric-commands/src/main/java/org/fusesource/fabric/commands/ProfileEdit.java
@@ -401,7 +401,7 @@
         String version = profile.getVersion();
         String location = id + " " + version + " " + resource;
         //Call the editor
-        ConsoleEditor editor = editorFactory.create(getTerminal());
+        ConsoleEditor editor = editorFactory.create("simple",getTerminal(), System.in, System.out);
         editor.setTitle("Profile");
         editor.setOpenEnabled(false);
         editor.setContentManager(new DatastoreContentManager(getFabricService().getDataStore()));
