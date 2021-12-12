diff --git a/requery/src/main/java/io/requery/sql/RawTupleQuery.java b/requery/src/main/java/io/requery/sql/RawTupleQuery.java
index 64a048f..5c8d5f6 100644
--- a/requery/src/main/java/io/requery/sql/RawTupleQuery.java
+++ b/requery/src/main/java/io/requery/sql/RawTupleQuery.java
@@ -101,7 +101,7 @@
                         } catch (Exception ignored) {
                         }
                     }
-                    return new SingleResult<Tuple>(tuple);
+                    return new CollectionResult<Tuple>(tuple);
             }
         } catch (Exception e) {
             throw StatementExecutionException.closing(statement, e, sql);
