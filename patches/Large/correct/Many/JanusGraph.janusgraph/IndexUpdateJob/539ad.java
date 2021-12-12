diff --git a/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/olap/job/IndexUpdateJob.java b/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/olap/job/IndexUpdateJob.java
index a5bc6c1..4801db4 100644
--- a/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/olap/job/IndexUpdateJob.java
+++ b/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/olap/job/IndexUpdateJob.java
@@ -42,7 +42,7 @@
     public static final ConfigOption<String> INDEX_RELATION_TYPE = new ConfigOption<String>(INDEX_JOB_NS,"relation-type",
             "For a vertex-centric index, this is the name of the index associated with the " +
                     "relation type configured under index-name. This should remain empty for global graph indexes.",
-            ConfigOption.Type.LOCAL, "");
+            ConfigOption.Type.LOCAL, "", str -> null != str);
 
 
     protected String indexRelationTypeName = null;
