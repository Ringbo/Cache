diff --git a/src/java/org/apache/cassandra/tools/nodetool/TopPartitions.java b/src/java/org/apache/cassandra/tools/nodetool/TopPartitions.java
index b473a8d..931ac62 100644
--- a/src/java/org/apache/cassandra/tools/nodetool/TopPartitions.java
+++ b/src/java/org/apache/cassandra/tools/nodetool/TopPartitions.java
@@ -59,7 +59,7 @@
         checkArgument(topCount < size, "TopK count (-k) option must be smaller then the summary capacity (-s)");
         String keyspace = args.get(0);
         String cfname = args.get(1);
-        Integer duration = Integer.parseInt(args.get(2));
+        Integer duration = Integer.valueOf(args.get(2));
         // generate the list of samplers
         List<Sampler> targets = Lists.newArrayList();
         for (String s : samplers.split(","))
@@ -97,7 +97,7 @@
             if(!first)
                 System.out.println();
             System.out.println(result.getKey().toString()+ " Sampler:");
-            System.out.printf("  Cardinality: ~%d (%d capacity)%n", (long) sampling.get("cardinality"), size);
+            System.out.printf("  Cardinality: ~%d (%d capacity)%n", sampling.get("cardinality"), size);
             System.out.printf("  Top %d partitions:%n", topCount);
             if (topk.size() == 0)
             {
