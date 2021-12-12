diff --git a/src/main/java/org/elasticsearch/search/dfs/AggregatedDfs.java b/src/main/java/org/elasticsearch/search/dfs/AggregatedDfs.java
index 7577d95..b0c5738 100644
--- a/src/main/java/org/elasticsearch/search/dfs/AggregatedDfs.java
+++ b/src/main/java/org/elasticsearch/search/dfs/AggregatedDfs.java
@@ -72,7 +72,7 @@
             Term term = new Term(in.readString(), in.readBytesRef());
             TermStatistics stats = new TermStatistics(in.readBytesRef(), 
                     in.readVLong(), 
-                    DfsSearchResult.toNotAvailable(in.readVLong()));
+                    DfsSearchResult.subOne(in.readVLong()));
             termStatistics.put(term, stats);
         }
         fieldStatistics = DfsSearchResult.readFieldStats(in);
@@ -89,7 +89,7 @@
             TermStatistics stats = termTermStatisticsEntry.getValue();
             out.writeBytesRef(stats.term());
             out.writeVLong(stats.docFreq());
-            out.writeVLong(DfsSearchResult.plusOne(stats.totalTermFreq()));
+            out.writeVLong(DfsSearchResult.addOne(stats.totalTermFreq()));
         }
         DfsSearchResult.writeFieldStats(out, fieldStatistics);
         out.writeVLong(maxDoc);
