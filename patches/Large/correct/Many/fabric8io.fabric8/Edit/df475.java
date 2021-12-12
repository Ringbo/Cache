diff --git a/fabric/fabric-zookeeper-commands/src/main/java/org/fusesource/fabric/zookeeper/commands/Edit.java b/fabric/fabric-zookeeper-commands/src/main/java/org/fusesource/fabric/zookeeper/commands/Edit.java
index 2a672b6..c584a8c 100644
--- a/fabric/fabric-zookeeper-commands/src/main/java/org/fusesource/fabric/zookeeper/commands/Edit.java
+++ b/fabric/fabric-zookeeper-commands/src/main/java/org/fusesource/fabric/zookeeper/commands/Edit.java
@@ -46,7 +46,7 @@
             curator.create().creatingParentsIfNeeded().withACL(ZooDefs.Ids.OPEN_ACL_UNSAFE).forPath(path);
         }
         //Call the editor
-        ConsoleEditor editor = editorFactory.create(getTerminal());
+        ConsoleEditor editor = editorFactory.create("simple",getTerminal(), System.in, System.out);
         editor.setTitle("Znode");
         editor.setContentManager(new ZookeeperContentManager(curator));
         editor.open(path);
