diff --git a/src/main/java/org/elasticsearch/hadoop/rest/QueryBuilder.java b/src/main/java/org/elasticsearch/hadoop/rest/QueryBuilder.java
index 382bdb8..5ac8ad8 100644
--- a/src/main/java/org/elasticsearch/hadoop/rest/QueryBuilder.java
+++ b/src/main/java/org/elasticsearch/hadoop/rest/QueryBuilder.java
@@ -86,7 +86,7 @@
                     IOUtils.asBytes(bodyQuery, in);
                 }
             } catch (IOException ex) {
-                throw new IllegalStateException(ex);
+                throw new IllegalArgumentException(String.format("Cannot determine specified query - doesn't appear to be URI or JSON based and location [%s] cannot be opened", query));
             }
         }
     }
