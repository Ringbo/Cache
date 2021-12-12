diff --git a/src/test/org/apache/hadoop/hbase/TestInfoServers.java b/src/test/org/apache/hadoop/hbase/TestInfoServers.java
index 9a79b00..911ac44 100644
--- a/src/test/org/apache/hadoop/hbase/TestInfoServers.java
+++ b/src/test/org/apache/hadoop/hbase/TestInfoServers.java
@@ -50,11 +50,11 @@
     new HTable(conf, ".META.");
     int port = cluster.getMaster().getInfoServer().getPort();
     assertHasExpectedContent(new URL("http://localhost:" + port +
-      "/index.html"), "Master");
+      "/index.html"), "master");
     port = cluster.getRegionThreads().get(0).getRegionServer().
       getInfoServer().getPort();
     assertHasExpectedContent(new URL("http://localhost:" + port +
-      "/index.html"), "Region Server");
+      "/index.html"), "regionserver");
   }
   
   private void assertHasExpectedContent(final URL u, final String expected)
@@ -71,6 +71,6 @@
     }
     bis.close();
     String content = sb.toString();
-    assertTrue(content.matches(expected));
+    assertTrue(content.contains(expected));
   }
 }
\ No newline at end of file
