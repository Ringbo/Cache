diff --git a/modules/core/src/main/java/org/apache/ignite/cache/query/QueryTextPredicate.java b/modules/core/src/main/java/org/apache/ignite/cache/query/QueryTextPredicate.java
index e69db2c..4064f64 100644
--- a/modules/core/src/main/java/org/apache/ignite/cache/query/QueryTextPredicate.java
+++ b/modules/core/src/main/java/org/apache/ignite/cache/query/QueryTextPredicate.java
@@ -62,7 +62,7 @@
      * @param type Type.
      */
     public void setType(Class<?> type) {
-        setType(type == null ? null : type.getName());
+        setType(type == null ? null : type.getSimpleName());
     }
 
     /**
