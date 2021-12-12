diff --git a/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/olap/job/IndexRemoveJob.java b/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/olap/job/IndexRemoveJob.java
index f233216..86acca1 100644
--- a/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/olap/job/IndexRemoveJob.java
+++ b/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/olap/job/IndexRemoveJob.java
@@ -137,7 +137,7 @@
     public List<SliceQuery> getQueries() {
         if (isGlobalGraphIndex()) {
             //Everything
-            return ImmutableList.of(new SliceQuery(BufferUtil.zeroBuffer(128), BufferUtil.oneBuffer(128)));
+            return ImmutableList.of(new SliceQuery(BufferUtil.zeroBuffer(1), BufferUtil.oneBuffer(128)));
         } else {
             RelationTypeIndexWrapper wrapper = (RelationTypeIndexWrapper)index;
             InternalRelationType wrappedType = wrapper.getWrappedType();
