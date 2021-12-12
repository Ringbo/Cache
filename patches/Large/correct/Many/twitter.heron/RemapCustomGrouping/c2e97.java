diff --git a/heron/api/src/java/org/apache/heron/streamlet/impl/groupings/RemapCustomGrouping.java b/heron/api/src/java/org/apache/heron/streamlet/impl/groupings/RemapCustomGrouping.java
index aa71f3a..b5bc823 100644
--- a/heron/api/src/java/org/apache/heron/streamlet/impl/groupings/RemapCustomGrouping.java
+++ b/heron/api/src/java/org/apache/heron/streamlet/impl/groupings/RemapCustomGrouping.java
@@ -53,7 +53,7 @@
   public List<Integer> chooseTasks(List<Object> values) {
     List<Integer> ret = new ArrayList<>();
     R obj = (R) values.get(0);
-    List<Integer> targets = remapFn.apply(obj, ret.size());
+    List<Integer> targets = remapFn.apply(obj, taskIds.size());
     for (Integer target : targets) {
       ret.add(Utils.assignKeyToTask(target, taskIds));
     }
