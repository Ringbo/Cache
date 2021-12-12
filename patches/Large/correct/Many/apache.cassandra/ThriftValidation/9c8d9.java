diff --git a/src/java/org/apache/cassandra/thrift/ThriftValidation.java b/src/java/org/apache/cassandra/thrift/ThriftValidation.java
index bc64018..4f40938 100644
--- a/src/java/org/apache/cassandra/thrift/ThriftValidation.java
+++ b/src/java/org/apache/cassandra/thrift/ThriftValidation.java
@@ -511,7 +511,7 @@
         {
             // start_token/end_token can wrap, but key/token should not
             RowPosition stop = p.getTokenFactory().fromString(range.end_token).maxKeyBound(p);
-            if (RowPosition.forKey(range.start_key, p).compareTo(stop) > 0)
+            if (RowPosition.forKey(range.start_key, p).compareTo(stop) > 0 && !stop.isMinimum())
                 throw new InvalidRequestException("Start key's token sorts after end token");
         }
 
