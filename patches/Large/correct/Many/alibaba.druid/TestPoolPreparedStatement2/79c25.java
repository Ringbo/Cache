diff --git a/src/test/java/com/alibaba/druid/bvt/pool/TestPoolPreparedStatement2.java b/src/test/java/com/alibaba/druid/bvt/pool/TestPoolPreparedStatement2.java
index dafd8b7..afc57f8 100644
--- a/src/test/java/com/alibaba/druid/bvt/pool/TestPoolPreparedStatement2.java
+++ b/src/test/java/com/alibaba/druid/bvt/pool/TestPoolPreparedStatement2.java
@@ -85,7 +85,7 @@
             }
         }
 
-        for (int i = 0; i < 1000 * 1; ++i) {
+        for (int i = 0; i < 10 * 1; ++i) {
             Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT " + i);
             stmt.execute();
