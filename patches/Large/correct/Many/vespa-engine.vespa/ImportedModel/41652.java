diff --git a/searchlib/src/main/java/com/yahoo/searchlib/rankingexpression/integration/ml/ImportedModel.java b/searchlib/src/main/java/com/yahoo/searchlib/rankingexpression/integration/ml/ImportedModel.java
index aa33a71..045844e 100644
--- a/searchlib/src/main/java/com/yahoo/searchlib/rankingexpression/integration/ml/ImportedModel.java
+++ b/searchlib/src/main/java/com/yahoo/searchlib/rankingexpression/integration/ml/ImportedModel.java
@@ -103,26 +103,24 @@
      * if signatures are used, or the expression name if signatures are not used and there are multiple
      * expressions, and the third is the output name if signature names are used.
      */
-    // TODO: Get rids of name argument, which is needed to get the right name in unit tests using a mock package
-    //       with a non-standard application package layout
-    public List<Pair<String, RankingExpression>> outputExpressions(String modelName) {
+    public List<Pair<String, RankingExpression>> outputExpressions() {
         List<Pair<String, RankingExpression>> names = new ArrayList<>();
         for (Map.Entry<String, Signature> signatureEntry : signatures().entrySet()) {
             for (Map.Entry<String, String> outputEntry : signatureEntry.getValue().outputs().entrySet())
-                names.add(new Pair<>(modelName + "." + signatureEntry.getKey() + "." + outputEntry.getKey(),
+                names.add(new Pair<>(name + "." + signatureEntry.getKey() + "." + outputEntry.getKey(),
                                      expressions().get(outputEntry.getValue())));
             if (signatureEntry.getValue().outputs().isEmpty()) // fallback: Signature without outputs
-                names.add(new Pair<>(modelName + "." + signatureEntry.getKey(),
+                names.add(new Pair<>(name + "." + signatureEntry.getKey(),
                                      expressions().get(signatureEntry.getKey())));
         }
         if (signatures().isEmpty()) { // fallback for models without signatures
             if (expressions().size() == 1) {// Use just model name
-                names.add(new Pair<>(modelName,
+                names.add(new Pair<>(name,
                                      expressions().values().iterator().next()));
             }
             else {
                 for (Map.Entry<String, RankingExpression> expressionEntry : expressions().entrySet()) {
-                    names.add(new Pair<>(modelName + "." + expressionEntry.getKey(),
+                    names.add(new Pair<>(name + "." + expressionEntry.getKey(),
                                          expressionEntry.getValue()));
                 }
             }
