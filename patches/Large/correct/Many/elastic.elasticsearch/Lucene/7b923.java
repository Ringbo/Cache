diff --git a/server/src/main/java/org/elasticsearch/common/lucene/Lucene.java b/server/src/main/java/org/elasticsearch/common/lucene/Lucene.java
index 6016c7c..47453aa 100644
--- a/server/src/main/java/org/elasticsearch/common/lucene/Lucene.java
+++ b/server/src/main/java/org/elasticsearch/common/lucene/Lucene.java
@@ -399,7 +399,7 @@
         out.writeVLong(totalHits.value);
         if (out.getVersion().onOrAfter(org.elasticsearch.Version.V_7_0_0_alpha1)) {
             out.writeEnum(totalHits.relation);
-        } else if (totalHits.relation != TotalHits.Relation.EQUAL_TO) {
+        } else if (totalHits.value > 0 && totalHits.relation != TotalHits.Relation.EQUAL_TO) {
             throw new IllegalArgumentException("Cannot serialize approximate total hit counts to nodes that are on a version < 7.0.0");
         }
     }
