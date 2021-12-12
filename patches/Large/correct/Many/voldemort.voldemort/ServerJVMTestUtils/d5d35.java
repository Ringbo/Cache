diff --git a/test/common/voldemort/utils/ServerJVMTestUtils.java b/test/common/voldemort/utils/ServerJVMTestUtils.java
index 77d8c73..1839ffd 100644
--- a/test/common/voldemort/utils/ServerJVMTestUtils.java
+++ b/test/common/voldemort/utils/ServerJVMTestUtils.java
@@ -134,7 +134,7 @@
         FileUtils.writeLines(serverProperties, Arrays.asList("node.id=" + node,
                                                              "bdb.cache.size=" + 1024 * 1024,
                                                              "enable.metadata.checking=" + false,
-                                                             "enable.network.classloader=" + true));
+                                                             "enable.network.classloader=" + false));
 
         return config.getVoldemortHome();
     }
