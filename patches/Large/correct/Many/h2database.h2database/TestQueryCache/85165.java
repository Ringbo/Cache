diff --git a/h2/src/test/org/h2/test/db/TestQueryCache.java b/h2/src/test/org/h2/test/db/TestQueryCache.java
index a3d7532..00f3ba7 100644
--- a/h2/src/test/org/h2/test/db/TestQueryCache.java
+++ b/h2/src/test/org/h2/test/db/TestQueryCache.java
@@ -50,14 +50,14 @@
             // stat.execute("set mode regular");
             // stat.execute("create table x()");
             // stat.execute("drop table x");
-            time = System.currentTimeMillis();
+            time = System.nanoTime();
             prep = conn.prepareStatement("select count(*) from test t1, test t2");
             prep.executeQuery();
             rs = stat.executeQuery("select count(*) from test t1, test t2");
             rs.next();
             int c = rs.getInt(1);
             assertEquals(1000000, c);
-            time = System.currentTimeMillis() - time;
+            time = System.nanoTime() - time;
             if (first == 0) {
                 first = time;
             } else {
