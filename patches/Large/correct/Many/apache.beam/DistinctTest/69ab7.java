diff --git a/sdks/java/extensions/euphoria/euphoria-operator-testkit/src/test/java/cz/seznam/euphoria/operator/test/DistinctTest.java b/sdks/java/extensions/euphoria/euphoria-operator-testkit/src/test/java/cz/seznam/euphoria/operator/test/DistinctTest.java
index 7ea6f12..7f9861a 100644
--- a/sdks/java/extensions/euphoria/euphoria-operator-testkit/src/test/java/cz/seznam/euphoria/operator/test/DistinctTest.java
+++ b/sdks/java/extensions/euphoria/euphoria-operator-testkit/src/test/java/cz/seznam/euphoria/operator/test/DistinctTest.java
@@ -131,7 +131,7 @@
 
       @Override
       protected DataSource<Integer> getDataSource() {
-        return ListDataSource.bounded(
+        return ListDataSource.unbounded(
             Arrays.asList(1, 2, 3, 3, 2, 1),
             Arrays.asList(1, 2, 3, 3, 2, 1));
       }
