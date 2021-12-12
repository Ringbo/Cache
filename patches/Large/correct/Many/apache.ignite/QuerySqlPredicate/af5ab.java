diff --git a/modules/core/src/main/java/org/apache/ignite/cache/query/QuerySqlPredicate.java b/modules/core/src/main/java/org/apache/ignite/cache/query/QuerySqlPredicate.java
index c61dd07..061b2a0 100644
--- a/modules/core/src/main/java/org/apache/ignite/cache/query/QuerySqlPredicate.java
+++ b/modules/core/src/main/java/org/apache/ignite/cache/query/QuerySqlPredicate.java
@@ -134,7 +134,7 @@
      * @param type Type.
      */
     public void setType(Class<?> type) {
-        this.type = type == null ? null : type.getName();
+        this.type = type == null ? null : type.getSimpleName();
     }
 
     /** {@inheritDoc} */
