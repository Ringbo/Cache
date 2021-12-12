diff --git a/ql/src/java/org/apache/hadoop/hive/ql/optimizer/calcite/translator/JoinTypeCheckCtx.java b/ql/src/java/org/apache/hadoop/hive/ql/optimizer/calcite/translator/JoinTypeCheckCtx.java
index 4e42197..871518c 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/optimizer/calcite/translator/JoinTypeCheckCtx.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/optimizer/calcite/translator/JoinTypeCheckCtx.java
@@ -54,7 +54,7 @@
   public JoinTypeCheckCtx(RowResolver leftRR, RowResolver rightRR, JoinType hiveJoinType)
       throws SemanticException {
     super(RowResolver.getCombinedRR(leftRR, rightRR), true, false, false, false, false, false, false, false,
-        false, false);
+        true, false);
     this.inputRRLst = ImmutableList.of(leftRR, rightRR);
     this.outerJoin = (hiveJoinType == JoinType.LEFTOUTER) || (hiveJoinType == JoinType.RIGHTOUTER)
         || (hiveJoinType == JoinType.FULLOUTER);
