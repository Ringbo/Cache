diff --git a/examples/src/main/java/org/gridgain/examples/datagrid/hibernate/HibernateL2CacheExample.java b/examples/src/main/java/org/gridgain/examples/datagrid/hibernate/HibernateL2CacheExample.java
index 33b539e..c65bf04 100644
--- a/examples/src/main/java/org/gridgain/examples/datagrid/hibernate/HibernateL2CacheExample.java
+++ b/examples/src/main/java/org/gridgain/examples/datagrid/hibernate/HibernateL2CacheExample.java
@@ -61,15 +61,13 @@
     /** JDBC URL for backing database (an H2 in-memory database is used). */
     private static final String JDBC_URL = "jdbc:h2:mem:example;DB_CLOSE_DELAY=-1";
 
-    /** Default path to hibernate configuration file. This path is relative to GridGain installation folder. */
-    private static final String HIBERNATE_DFLT_CFG = "hibernate/example-hibernate-L2-cache.xml";
+    /** Path to hibernate configuration file (will be resolved from application {@code CLASSPATH}). */
+    private static final String HIBERNATE_CFG = "hibernate/example-hibernate-L2-cache.xml";
 
     /**
      * Executes example.
      *
-     * @param args Command line arguments. First argument is optional and may contain absolute path to
-     *      hibernate configuration file. If this argument is not defined than
-     *      {@code hibernate/example-hibernate-L2-cache.xml} from application {@code CLASSPATH} will be used.
+     * @param args Command line arguments, none required.
      * @throws GridException If example execution failed.
      */
     public static void main(String[] args) throws GridException {
@@ -157,11 +155,10 @@
      * @return InputStream for resolved hibernate configuration file.
      */
     private static URL resolveHibernateConfig() {
-        URL hibernateCfg = ExamplesUtils.classLoader().getResource(HIBERNATE_DFLT_CFG);
+        URL hibernateCfg = ExamplesUtils.classLoader().getResource(HIBERNATE_CFG);
 
         if (hibernateCfg == null)
-            throw new RuntimeException("Cannot find hibernate configuration file in CLASSPATH: " +
-                HIBERNATE_DFLT_CFG);
+            throw new RuntimeException("Cannot find hibernate configuration file in CLASSPATH: " + HIBERNATE_CFG);
 
         return hibernateCfg;
     }
