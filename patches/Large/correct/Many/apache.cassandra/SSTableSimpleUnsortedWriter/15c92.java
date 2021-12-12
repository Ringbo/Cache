diff --git a/src/java/org/apache/cassandra/io/sstable/SSTableSimpleUnsortedWriter.java b/src/java/org/apache/cassandra/io/sstable/SSTableSimpleUnsortedWriter.java
index 38ba76a..af720c0 100644
--- a/src/java/org/apache/cassandra/io/sstable/SSTableSimpleUnsortedWriter.java
+++ b/src/java/org/apache/cassandra/io/sstable/SSTableSimpleUnsortedWriter.java
@@ -227,7 +227,7 @@
                             throw new AssertionError("Empty partition");
                         first = false;
                     }
-                    writer.close(true);
+                    writer.close();
                 }
             }
             catch (Throwable e)
