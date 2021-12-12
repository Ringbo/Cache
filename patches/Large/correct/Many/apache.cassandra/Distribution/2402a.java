diff --git a/tools/stress/src/org/apache/cassandra/stress/generate/Distribution.java b/tools/stress/src/org/apache/cassandra/stress/generate/Distribution.java
index 0100006..30efd34 100644
--- a/tools/stress/src/org/apache/cassandra/stress/generate/Distribution.java
+++ b/tools/stress/src/org/apache/cassandra/stress/generate/Distribution.java
@@ -46,7 +46,7 @@
     {
         double sum = 0;
         double d = 0d;
-        for (int count = 0; count < 51 ; count++)
+        for (int count = 0; count < 50 ; count++)
         {
             sum += inverseCumProb(d);
             d += 0.02d;
