diff --git a/src/java/org/apache/cassandra/utils/SigarLibrary.java b/src/java/org/apache/cassandra/utils/SigarLibrary.java
index fb3d3ae..bcd4021 100644
--- a/src/java/org/apache/cassandra/utils/SigarLibrary.java
+++ b/src/java/org/apache/cassandra/utils/SigarLibrary.java
@@ -165,7 +165,7 @@
             if (swapEnabled || !goodAddressSpace || !goodFileLimits || !goodProcNumber)
             {
                 logger.warn("Cassandra server running in degraded mode. Is swap disabled? : {},  Address space adequate? : {}, " +
-                            " nofile limit adequate? : {}, nproc limit adequate? : {} ", swapEnabled, goodAddressSpace,
+                            " nofile limit adequate? : {}, nproc limit adequate? : {} ", !swapEnabled, goodAddressSpace,
                             goodFileLimits, goodProcNumber );
             }
             else
