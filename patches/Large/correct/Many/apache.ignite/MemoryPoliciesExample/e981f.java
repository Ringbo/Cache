diff --git a/examples/src/main/java/org/apache/ignite/examples/datagrid/MemoryPoliciesExample.java b/examples/src/main/java/org/apache/ignite/examples/datagrid/MemoryPoliciesExample.java
index 52cda5f..045f88b 100644
--- a/examples/src/main/java/org/apache/ignite/examples/datagrid/MemoryPoliciesExample.java
+++ b/examples/src/main/java/org/apache/ignite/examples/datagrid/MemoryPoliciesExample.java
@@ -43,11 +43,11 @@
     /** Name of the default memory policy defined in 'example-memory-policies.xml'. */
     public static final String POLICY_DEFAULT = "Default_Region";
 
-    /** Name of the memory policy that creates a memory region limited by 20 MB with eviction enabled */
-    public static final String POLICY_20MB_EVICTION = "20MB_Region_Eviction";
+    /** Name of the memory policy that creates a memory region limited by 40 MB with eviction enabled */
+    public static final String POLICY_40MB_EVICTION = "40MB_Region_Eviction";
 
     /** Name of the memory policy that creates a memory region mapped to a memory-mapped file. */
-    public static final String POLICY_15MB_MEMORY_MAPPED_FILE = "15MB_Region_Swapping";
+    public static final String POLICY_30MB_MEMORY_MAPPED_FILE = "30MB_Region_Swapping";
 
     /**
      * Executes example.
@@ -66,19 +66,19 @@
              */
             CacheConfiguration<Integer, Integer> firstCacheCfg = new CacheConfiguration<>("firstCache");
 
-            firstCacheCfg.setMemoryPolicyName(POLICY_20MB_EVICTION);
+            firstCacheCfg.setMemoryPolicyName(POLICY_40MB_EVICTION);
             firstCacheCfg.setCacheMode(CacheMode.PARTITIONED);
             firstCacheCfg.setAtomicityMode(CacheAtomicityMode.TRANSACTIONAL);
 
             CacheConfiguration<Integer, Integer> secondCacheCfg = new CacheConfiguration<>("secondCache");
-            secondCacheCfg.setMemoryPolicyName(POLICY_20MB_EVICTION);
+            secondCacheCfg.setMemoryPolicyName(POLICY_40MB_EVICTION);
             secondCacheCfg.setCacheMode(CacheMode.REPLICATED);
             secondCacheCfg.setAtomicityMode(CacheAtomicityMode.ATOMIC);
 
             IgniteCache<Integer, Integer> firstCache = ignite.createCache(firstCacheCfg);
             IgniteCache<Integer, Integer> secondCache = ignite.createCache(secondCacheCfg);
 
-            System.out.println(">>> Started two caches bound to '" + POLICY_20MB_EVICTION + "' memory region.");
+            System.out.println(">>> Started two caches bound to '" + POLICY_40MB_EVICTION + "' memory region.");
 
             /**
              * Preparing a configuration for a cache that will be bound to the memory region defined by
@@ -86,11 +86,11 @@
              */
             CacheConfiguration<Integer, Integer> thirdCacheCfg = new CacheConfiguration<>("thirdCache");
 
-            thirdCacheCfg.setMemoryPolicyName(POLICY_15MB_MEMORY_MAPPED_FILE);
+            thirdCacheCfg.setMemoryPolicyName(POLICY_30MB_MEMORY_MAPPED_FILE);
 
             IgniteCache<Integer, Integer> thirdCache = ignite.createCache(thirdCacheCfg);
 
-            System.out.println(">>> Started a cache bound to '" + POLICY_15MB_MEMORY_MAPPED_FILE + "' memory region.");
+            System.out.println(">>> Started a cache bound to '" + POLICY_30MB_MEMORY_MAPPED_FILE + "' memory region.");
 
 
             /**
