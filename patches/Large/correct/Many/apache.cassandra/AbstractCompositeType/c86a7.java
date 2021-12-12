diff --git a/src/java/org/apache/cassandra/db/marshal/AbstractCompositeType.java b/src/java/org/apache/cassandra/db/marshal/AbstractCompositeType.java
index 3e5f7cc..12ecd9f 100644
--- a/src/java/org/apache/cassandra/db/marshal/AbstractCompositeType.java
+++ b/src/java/org/apache/cassandra/db/marshal/AbstractCompositeType.java
@@ -222,7 +222,7 @@
             if (bb.remaining() != bytes.remaining())
                 sb.append(":");
 
-            AbstractType<?> comparator = getAndAppendNextComparator(i, bb, sb);
+            AbstractType<?> comparator = getAndAppendComparator(i, bb, sb);
             ByteBuffer value = getWithShortLength(bb);
 
             sb.append(escape(comparator.getString(value)));
