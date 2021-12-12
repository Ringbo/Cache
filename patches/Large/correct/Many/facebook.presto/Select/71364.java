diff --git a/presto-product-tests/src/main/java/com/facebook/presto/tests/sqlserver/Select.java b/presto-product-tests/src/main/java/com/facebook/presto/tests/sqlserver/Select.java
index b2ddd1f..383407a 100644
--- a/presto-product-tests/src/main/java/com/facebook/presto/tests/sqlserver/Select.java
+++ b/presto-product-tests/src/main/java/com/facebook/presto/tests/sqlserver/Select.java
@@ -156,7 +156,7 @@
                                 Timestamp.valueOf("9999-12-31 23:59:59.999"), Timestamp.valueOf("2079-06-06 00:00:00"),
                                 Double.valueOf("12345678912.3456756"), Float.valueOf("12345678.6557")
                         ),
-                        row(null, null, null, null, null, null, null, null, null, null, null, null, null, null)
+                        row(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null)
                 );
     }
 
