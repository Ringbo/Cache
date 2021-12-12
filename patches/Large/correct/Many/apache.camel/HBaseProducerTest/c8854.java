diff --git a/components/camel-hbase/src/test/java/org/apache/camel/component/hbase/HBaseProducerTest.java b/components/camel-hbase/src/test/java/org/apache/camel/component/hbase/HBaseProducerTest.java
index bb5041e..2efd3b7 100644
--- a/components/camel-hbase/src/test/java/org/apache/camel/component/hbase/HBaseProducerTest.java
+++ b/components/camel-hbase/src/test/java/org/apache/camel/component/hbase/HBaseProducerTest.java
@@ -100,7 +100,7 @@
                 }
             });
 
-            assertEquals(body[0][0][0], resp.getOut().getHeader(HbaseAttribute.HBASE_VALUE.asHeader()));
+            assertEquals(body[0][0][1], resp.getOut().getHeader(HbaseAttribute.HBASE_VALUE.asHeader()));
             assertEquals(body[0][1][2], resp.getOut().getHeader(HbaseAttribute.HBASE_VALUE.asHeader(2)));
         }
     }
