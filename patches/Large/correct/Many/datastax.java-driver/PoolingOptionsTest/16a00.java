diff --git a/driver-core/src/test/java/com/datastax/driver/core/PoolingOptionsTest.java b/driver-core/src/test/java/com/datastax/driver/core/PoolingOptionsTest.java
index 4358a09..72f26bd 100644
--- a/driver-core/src/test/java/com/datastax/driver/core/PoolingOptionsTest.java
+++ b/driver-core/src/test/java/com/datastax/driver/core/PoolingOptionsTest.java
@@ -49,7 +49,7 @@
                                .isAtDistance(HostDistance.LOCAL);
             // Wait for the node to be up, because apparently on Jenkins it's still only ADDED when we reach this line
             assertThat(cluster).host(2)
-                               .comesUpWithin(20, SECONDS)
+                               .comesUpWithin(120, SECONDS)
                                .isAtDistance(HostDistance.LOCAL);
 
             // Bring host 3 up, its presence should be acknowledged but it should be ignored
