diff --git a/modules/core/src/test/java/org/apache/ignite/testframework/junits/GridAbstractTest.java b/modules/core/src/test/java/org/apache/ignite/testframework/junits/GridAbstractTest.java
index 139b708..b45e173 100644
--- a/modules/core/src/test/java/org/apache/ignite/testframework/junits/GridAbstractTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/testframework/junits/GridAbstractTest.java
@@ -840,7 +840,7 @@
                 cfg.setLocalHost("127.0.0.1");
 
                 if (((TcpDiscoverySpi)cfg.getDiscoverySpi()).getJoinTimeout() == 0)
-                    ((TcpDiscoverySpi)cfg.getDiscoverySpi()).setJoinTimeout(8000);
+                    ((TcpDiscoverySpi)cfg.getDiscoverySpi()).setJoinTimeout(10000);
             }
             else
                 cfg.setLocalHost(getTestResources().getLocalHost());
