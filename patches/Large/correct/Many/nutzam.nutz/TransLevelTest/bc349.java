diff --git a/test/org/nutz/trans/TransLevelTest.java b/test/org/nutz/trans/TransLevelTest.java
index 75fb2e1..882e79a 100644
--- a/test/org/nutz/trans/TransLevelTest.java
+++ b/test/org/nutz/trans/TransLevelTest.java
@@ -157,7 +157,7 @@
     @Test
     public void testReadCommitted() {
         // SqlServer/hsql 在这个测试中，两个线程会相互等待 ...
-        if (dao.meta().isSqlServer() || dao.meta().isHsql()) {
+        if (dao.meta().isSqlServer() || dao.meta().isHsql() || dao.meta().isDerby()) {
             Nutzs.notSupport(dao.meta());
         }
         // H2 会在抛异常：Timeout trying to lock table "TRANS_COMPANY";
