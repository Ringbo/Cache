diff --git a/core/src/main/java/org/apache/calcite/sql2rel/RelFieldTrimmer.java b/core/src/main/java/org/apache/calcite/sql2rel/RelFieldTrimmer.java
index f7e6b35..2f0218b 100644
--- a/core/src/main/java/org/apache/calcite/sql2rel/RelFieldTrimmer.java
+++ b/core/src/main/java/org/apache/calcite/sql2rel/RelFieldTrimmer.java
@@ -824,7 +824,7 @@
         RelBuilder.AggCall newAggCall =
             relBuilder.aggregateCall(aggCall.getAggregation(),
                 aggCall.isDistinct(), filterArg, aggCall.name, args);
-        mapping.set(groupCount + indicatorCount + newAggCallList.size(), j);
+        mapping.set(j, groupCount + indicatorCount + newAggCallList.size());
         newAggCallList.add(newAggCall);
       }
       ++j;
