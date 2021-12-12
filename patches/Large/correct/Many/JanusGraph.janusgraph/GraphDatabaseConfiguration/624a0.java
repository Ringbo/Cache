diff --git a/src/main/java/com/thinkaurelius/titan/graphdb/configuration/GraphDatabaseConfiguration.java b/src/main/java/com/thinkaurelius/titan/graphdb/configuration/GraphDatabaseConfiguration.java
index 1c0215c..b02efe1 100644
--- a/src/main/java/com/thinkaurelius/titan/graphdb/configuration/GraphDatabaseConfiguration.java
+++ b/src/main/java/com/thinkaurelius/titan/graphdb/configuration/GraphDatabaseConfiguration.java
@@ -154,7 +154,7 @@
      * Number of times the system attempts to acquire a unique id block before giving up and throwing an exception.
      */
     public static final String IDAUTHORITY_RETRY_COUNT_KEY = "idauthority-retries";
-    public static final int IDAUTHORITY_RETRY_COUNT_DEFAULT = 3;
+    public static final int IDAUTHORITY_RETRY_COUNT_DEFAULT = 20;
     /**
      * Size of the block to be acquired. Larger block sizes require fewer block applications but also leave a larger
      * fraction of the id pool occupied and potentially lost. For write heavy applications, larger block sizes should
