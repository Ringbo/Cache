diff --git a/h2/src/test/org/h2/test/unit/TestCache.java b/h2/src/test/org/h2/test/unit/TestCache.java
index b9cf6ab..8909497 100644
--- a/h2/src/test/org/h2/test/unit/TestCache.java
+++ b/h2/src/test/org/h2/test/unit/TestCache.java
@@ -65,7 +65,7 @@
         for (int i = 0; i < 10; i++) {
             prep.setInt(1, i);
             r.nextBytes(buff);
-            prep.setBinaryStream(2, new ByteArrayInputStream(buff));
+            prep.setBinaryStream(2, new ByteArrayInputStream(buff), -1);
             prep.execute();
         }
         stat.execute("create table if not exists test(id int primary key, data varchar)");
