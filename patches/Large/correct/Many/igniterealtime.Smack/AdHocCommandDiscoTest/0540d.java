diff --git a/test/org/jivesoftware/smackx/commands/AdHocCommandDiscoTest.java b/test/org/jivesoftware/smackx/commands/AdHocCommandDiscoTest.java
index 3ead951..e07ba48 100644
--- a/test/org/jivesoftware/smackx/commands/AdHocCommandDiscoTest.java
+++ b/test/org/jivesoftware/smackx/commands/AdHocCommandDiscoTest.java
@@ -76,10 +76,9 @@
             manager1.registerCommand("test", "test node", LocalCommand.class);
             
             AdHocCommandManager manager2 = AdHocCommandManager.getAddHocCommandsManager(getConnection(1));
-            DiscoverItems items = manager2.discoverCommands(getBareJID(0));
+            DiscoverItems items = manager2.discoverCommands(getFullJID(0));
 
-            System.out.println(items.toXML());
-            //TODO: test that "test" node is in disco items
+            assertTrue("Disco for command test failed", items.getItems().next().getNode().equals("test"));
         }
         catch (Exception e) {
             fail(e.getMessage());
