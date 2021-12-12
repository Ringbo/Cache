diff --git a/query/src/main/java/org/apache/kylin/query/util/DefaultQueryTransformer.java b/query/src/main/java/org/apache/kylin/query/util/DefaultQueryTransformer.java
index f32e562..5376493 100644
--- a/query/src/main/java/org/apache/kylin/query/util/DefaultQueryTransformer.java
+++ b/query/src/main/java/org/apache/kylin/query/util/DefaultQueryTransformer.java
@@ -134,7 +134,7 @@
             if (!m.find())
                 break;
 
-            int value = (int) Math.floor(Double.valueOf(m.group(2)));
+            int value = (int) Math.floor(Double.parseDouble(m.group(2)));
             sql = sql.substring(0, m.start(1)) + "'" + value + "'" + sql.substring(m.end(3));
         }
         
