diff --git a/config-model/src/test/java/com/yahoo/vespa/model/content/ContentSearchClusterTest.java b/config-model/src/test/java/com/yahoo/vespa/model/content/ContentSearchClusterTest.java
index cc0624a..593fb6d 100644
--- a/config-model/src/test/java/com/yahoo/vespa/model/content/ContentSearchClusterTest.java
+++ b/config-model/src/test/java/com/yahoo/vespa/model/content/ContentSearchClusterTest.java
@@ -59,13 +59,13 @@
 
     @Test
     public void requireThatOnlyDiskLimitCanBeSet() throws Exception {
-        assertProtonResourceLimits(0.88, 0.9,
+        assertProtonResourceLimits(0.88, 0.8,
                 new ContentClusterBuilder().protonDiskLimit(0.88).getXml());
     }
 
     @Test
     public void requireThatOnlyMemoryLimitCanBeSet() throws Exception {
-        assertProtonResourceLimits(0.8, 0.77,
+        assertProtonResourceLimits(0.9, 0.77,
                 new ContentClusterBuilder().protonMemoryLimit(0.77).getXml());
     }
 
