diff --git a/src/java/org/apache/cassandra/serializers/TimeSerializer.java b/src/java/org/apache/cassandra/serializers/TimeSerializer.java
index 1f1ce77..1857be3 100644
--- a/src/java/org/apache/cassandra/serializers/TimeSerializer.java
+++ b/src/java/org/apache/cassandra/serializers/TimeSerializer.java
@@ -46,7 +46,7 @@
             try
             {
                 long result = Long.parseLong(source);
-                if (result < 0 || result > TimeUnit.DAYS.toNanos(1))
+                if (result < 0 || result >= TimeUnit.DAYS.toNanos(1))
                     throw new NumberFormatException("Input long out of bounds: " + source);
                 return result;
             }
