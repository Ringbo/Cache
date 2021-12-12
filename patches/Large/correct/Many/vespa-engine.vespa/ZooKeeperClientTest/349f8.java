diff --git a/configserver/src/test/java/com/yahoo/vespa/config/server/deploy/ZooKeeperClientTest.java b/configserver/src/test/java/com/yahoo/vespa/config/server/deploy/ZooKeeperClientTest.java
index 1bd9249..cef3ab8 100644
--- a/configserver/src/test/java/com/yahoo/vespa/config/server/deploy/ZooKeeperClientTest.java
+++ b/configserver/src/test/java/com/yahoo/vespa/config/server/deploy/ZooKeeperClientTest.java
@@ -81,14 +81,14 @@
         String defsPath = appPath + ConfigCurator.DEFCONFIGS_ZK_SUBPATH;
         assertTrue(zk.exists(appPath, ConfigCurator.DEFCONFIGS_ZK_SUBPATH.replaceFirst("/", "")));
         List<String> children = zk.getChildren(defsPath);
-        assertEquals(defsPath + " children", 2, children.size());
+        assertEquals(defsPath + " children", 8, children.size());
         Collections.sort(children);
         assertThat(children.get(0), is("a.b.test2,"));
 
         assertTrue(zk.exists(appPath, ConfigCurator.USER_DEFCONFIGS_ZK_SUBPATH.replaceFirst("/", "")));
         String userDefsPath = appPath + ConfigCurator.USER_DEFCONFIGS_ZK_SUBPATH;
         children = zk.getChildren(userDefsPath);
-        assertThat(children.size(), is(2));
+        assertThat(children.size(), is(8));
         Collections.sort(children);
         assertThat(children.get(0), is("a.b.test2,"));
     }
