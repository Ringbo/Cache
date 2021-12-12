diff --git a/requery/src/main/java/io/requery/sql/InsertReturningOperation.java b/requery/src/main/java/io/requery/sql/InsertReturningOperation.java
index 639d0aa..9ecfd35 100644
--- a/requery/src/main/java/io/requery/sql/InsertReturningOperation.java
+++ b/requery/src/main/java/io/requery/sql/InsertReturningOperation.java
@@ -100,7 +100,7 @@
                 connection.close();
                 MutableTuple tuple = new MutableTuple(1);
                 tuple.set(0, NamedExpression.ofInteger("count"), count);
-                return new SingleResult<Tuple>(tuple);
+                return new CollectionResult<Tuple>(tuple);
             } else {
                 ResultSet results = statement.getGeneratedKeys();
                 return new GeneratedKeyResult(configuration, selection, connection, results, count);
