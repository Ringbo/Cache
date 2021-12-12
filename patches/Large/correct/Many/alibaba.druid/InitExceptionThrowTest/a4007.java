diff --git a/src/test/java/com/alibaba/druid/bvt/pool/InitExceptionThrowTest.java b/src/test/java/com/alibaba/druid/bvt/pool/InitExceptionThrowTest.java
index b5f9d0a..1629fdd 100644
--- a/src/test/java/com/alibaba/druid/bvt/pool/InitExceptionThrowTest.java
+++ b/src/test/java/com/alibaba/druid/bvt/pool/InitExceptionThrowTest.java
@@ -14,7 +14,7 @@
     private int connectCount = 0;
 
     protected void setUp() throws Exception {
-        dataSource.setInitExceptionThrow(true);
+        dataSource.setInitExceptionThrow(false);
         dataSource.setUrl("jdbc:mock:xxx");
         dataSource.setDriver(new MockDriver() {
             public Connection connect(String url, Properties info) throws SQLException {
