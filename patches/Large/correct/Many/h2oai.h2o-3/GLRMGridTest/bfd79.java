diff --git a/h2o-algos/src/test/java/hex/glrm/GLRMGridTest.java b/h2o-algos/src/test/java/hex/glrm/GLRMGridTest.java
index acd7cb6..948f535 100644
--- a/h2o-algos/src/test/java/hex/glrm/GLRMGridTest.java
+++ b/h2o-algos/src/test/java/hex/glrm/GLRMGridTest.java
@@ -139,7 +139,7 @@
       // 2nd iteration
       hyperParms.put("_k", new Integer[] { 3 });
       final String[] hyperParamNames2 = hyperParms.keySet().toArray(new String[hyperParms.size()]);
-      Arrays.sort(hyperParamNames1);
+      Arrays.sort(hyperParamNames2);
       final int hyperSpaceSize2 = ArrayUtils.crossProductSize(hyperParms);
       Assert.assertArrayEquals("Names of hyperspaces should be same!", hyperParamNames1, hyperParamNames2);
       final Job<Grid> gs2 = GridSearch.startGridSearch(gridKey, params, hyperParms);
