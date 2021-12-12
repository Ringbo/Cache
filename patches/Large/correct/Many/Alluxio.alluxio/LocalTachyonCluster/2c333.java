diff --git a/core/src/test/java/tachyon/master/LocalTachyonCluster.java b/core/src/test/java/tachyon/master/LocalTachyonCluster.java
index a135fee..cf2f979 100644
--- a/core/src/test/java/tachyon/master/LocalTachyonCluster.java
+++ b/core/src/test/java/tachyon/master/LocalTachyonCluster.java
@@ -156,7 +156,7 @@
     System.setProperty("tachyon.worker.selector.threads", Integer.toString(1));
     System.setProperty("tachyon.worker.server.threads", Integer.toString(2));
     System.setProperty("tachyon.worker.network.netty.worker.threads", Integer.toString(2));
-    System.setProperty("tachyon.master.web.threads", Integer.toString(1));
+    System.setProperty("tachyon.master.web.threads", Integer.toString(9));
 
     CommonConf.clear();
     MasterConf.clear();
