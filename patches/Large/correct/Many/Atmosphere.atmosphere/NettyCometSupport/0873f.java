diff --git a/modules/cpr/src/main/java/org/atmosphere/container/NettyCometSupport.java b/modules/cpr/src/main/java/org/atmosphere/container/NettyCometSupport.java
index 1f85702..42df182 100644
--- a/modules/cpr/src/main/java/org/atmosphere/container/NettyCometSupport.java
+++ b/modules/cpr/src/main/java/org/atmosphere/container/NettyCometSupport.java
@@ -34,7 +34,7 @@
     public final static String SUSPEND = NettyCometSupport.class.getName() + ".suspend";
     public final static String RESUME = NettyCometSupport.class.getName() + ".resume";
 
-    private static final Logger logger = LoggerFactory.getLogger(BlockingIOCometSupport.class);
+    private static final Logger logger = LoggerFactory.getLogger(NettyCometSupport.class);
 
     public NettyCometSupport(AtmosphereConfig config) {
         super(config);
