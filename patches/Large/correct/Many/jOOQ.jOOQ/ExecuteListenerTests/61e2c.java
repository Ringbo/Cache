diff --git a/jOOQ-test/src/org/jooq/test/_/testcases/ExecuteListenerTests.java b/jOOQ-test/src/org/jooq/test/_/testcases/ExecuteListenerTests.java
index 2e11cd7..dc0802a 100644
--- a/jOOQ-test/src/org/jooq/test/_/testcases/ExecuteListenerTests.java
+++ b/jOOQ-test/src/org/jooq/test/_/testcases/ExecuteListenerTests.java
@@ -113,7 +113,7 @@
         assertEquals(3, ResultQueryListener.renderEnd);
         assertEquals(4, ResultQueryListener.prepareStart);
         assertEquals(5, ResultQueryListener.prepareEnd);
-        assertEquals(plus > 2 ? 6 : 0, ResultQueryListener.bindStart);
+        assertEquals(plus > 0 ? 6 : 0, ResultQueryListener.bindStart);
         assertEquals(plus > 0 ? 7 : 0, ResultQueryListener.bindEnd);
         assertEquals(6 + plus, ResultQueryListener.executeStart);
         assertEquals(7 + plus, ResultQueryListener.executeEnd);
