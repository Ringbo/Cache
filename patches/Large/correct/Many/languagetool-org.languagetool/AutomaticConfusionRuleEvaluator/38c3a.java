diff --git a/languagetool-dev/src/main/java/org/languagetool/dev/bigdata/AutomaticConfusionRuleEvaluator.java b/languagetool-dev/src/main/java/org/languagetool/dev/bigdata/AutomaticConfusionRuleEvaluator.java
index 6e69dd4..4c1428c 100644
--- a/languagetool-dev/src/main/java/org/languagetool/dev/bigdata/AutomaticConfusionRuleEvaluator.java
+++ b/languagetool-dev/src/main/java/org/languagetool/dev/bigdata/AutomaticConfusionRuleEvaluator.java
@@ -47,7 +47,7 @@
   private static final int MAX_EXAMPLES = 1000;
   private static final List<Long> EVAL_FACTORS = Arrays.asList(10L, 100L, 1_000L, 10_000L, 100_000L, 1_000_000L, 10_000_000L);
   private static final float MIN_PRECISION = 0.99f;
-  private static final float MIN_RECALL = 0.5f;
+  private static final float MIN_RECALL = 0.1f;
 
   private final IndexSearcher searcher;
   private final Map<String, List<ConfusionSet>> knownSets;
@@ -100,7 +100,7 @@
         System.out.println("=> " + start + spaces + "    # " + entry.getValue().getSummary());
       }
     } else {
-      System.out.println("No good result found for " + part1 + "/" + part2 + ":");
+      System.out.println("No good result found for " + part1 + "/" + part2);
     }
   }
 
