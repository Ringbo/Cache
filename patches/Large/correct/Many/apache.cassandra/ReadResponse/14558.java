diff --git a/src/java/org/apache/cassandra/db/ReadResponse.java b/src/java/org/apache/cassandra/db/ReadResponse.java
index 6f418f9..a66cb6a 100644
--- a/src/java/org/apache/cassandra/db/ReadResponse.java
+++ b/src/java/org/apache/cassandra/db/ReadResponse.java
@@ -133,11 +133,11 @@
             }
         }
 
-        protected ColumnFilter selection(ColumnFilter sent)
+        protected ColumnFilter selection(ReadCommand sent)
         {
             // we didn't send anything, so we don't provide it in the serializer methods, but use the
             // object's reference to the original column filter we received
-            assert sent == null | sent == received;
+            assert sent == null || sent.columnFilter() == received;
             return received;
         }
     }
@@ -150,11 +150,11 @@
             super(null, data, SerializationHelper.Flag.FROM_REMOTE);
         }
 
-        protected ColumnFilter selection(ColumnFilter sent)
+        protected ColumnFilter selection(ReadCommand sent)
         {
             // we should always know what we sent, and should provide it in digest() and makeIterator()
             assert sent != null;
-            return sent;
+            return sent.columnFilter();
         }
     }
 
@@ -172,7 +172,7 @@
             this.flag = flag;
         }
 
-        protected abstract ColumnFilter selection(ColumnFilter filter);
+        protected abstract ColumnFilter selection(ReadCommand command);
 
         public UnfilteredPartitionIterator makeIterator(CFMetaData metadata, ReadCommand command)
         {
@@ -182,7 +182,7 @@
                 return UnfilteredPartitionIterators.serializerForIntraNode().deserialize(in,
                                                                                          MessagingService.current_version,
                                                                                          metadata,
-                                                                                         selection(command.columnFilter()),
+                                                                                         selection(command),
                                                                                          flag);
             }
             catch (IOException e)
