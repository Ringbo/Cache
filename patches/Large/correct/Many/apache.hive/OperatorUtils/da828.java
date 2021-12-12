diff --git a/ql/src/java/org/apache/hadoop/hive/ql/exec/OperatorUtils.java b/ql/src/java/org/apache/hadoop/hive/ql/exec/OperatorUtils.java
index 41507b1..a8ed74c 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/exec/OperatorUtils.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/exec/OperatorUtils.java
@@ -83,7 +83,7 @@
 
   public static <T> T findSingleOperatorUpstreamJoinAccounted(Operator<?> start, Class<T> clazz) {
     Set<T> found = findOperatorsUpstreamJoinAccounted(start, clazz, new HashSet<T>());
-    return found.size() == 1 ? found.iterator().next(): null;
+    return found.size() >= 1 ? found.iterator().next(): null;
   }
 
   public static <T> Set<T> findOperatorsUpstream(Collection<Operator<?>> starts, Class<T> clazz) {
