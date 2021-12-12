diff --git a/presto-main/src/main/java/com/facebook/presto/testing/MaterializedResult.java b/presto-main/src/main/java/com/facebook/presto/testing/MaterializedResult.java
index d40c6b9..6c24d39 100644
--- a/presto-main/src/main/java/com/facebook/presto/testing/MaterializedResult.java
+++ b/presto-main/src/main/java/com/facebook/presto/testing/MaterializedResult.java
@@ -189,11 +189,11 @@
                 .toString();
     }
 
-    public Set<String> getOnlyColumnAsSet()
+    public Set<Object> getOnlyColumnAsSet()
     {
         checkState(types.size() == 1, "result set must have exactly one column");
         return rows.stream()
-                .map(row -> (String) row.getField(0))
+                .map(row -> row.getField(0))
                 .collect(toImmutableSet());
     }
 
