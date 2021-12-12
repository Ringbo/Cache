diff --git a/graylog2-server/src/main/java/org/graylog2/initializers/IndexerSetupService.java b/graylog2-server/src/main/java/org/graylog2/initializers/IndexerSetupService.java
index 745f4e6..26e4bb2 100644
--- a/graylog2-server/src/main/java/org/graylog2/initializers/IndexerSetupService.java
+++ b/graylog2-server/src/main/java/org/graylog2/initializers/IndexerSetupService.java
@@ -62,7 +62,7 @@
 public class IndexerSetupService extends AbstractIdleService {
     private static final Logger LOG = LoggerFactory.getLogger(IndexerSetupService.class);
     private static final Version MINIMUM_ES_VERSION = Version.V_1_3_4;
-    private static final Version MAXIMUM_ES_VERSION = Version.fromString("1.6.99");
+    private static final Version MAXIMUM_ES_VERSION = Version.fromString("1.7.99");
 
     private final Node node;
     private final ElasticsearchConfiguration configuration;
@@ -196,7 +196,7 @@
     }
 
     private void checkClusterVersion(Version clusterVersion) {
-        if (!clusterVersion.onOrAfter(MINIMUM_ES_VERSION) && !clusterVersion.onOrBefore(MAXIMUM_ES_VERSION)) {
+        if (!clusterVersion.onOrAfter(MINIMUM_ES_VERSION) || !clusterVersion.onOrBefore(MAXIMUM_ES_VERSION)) {
             LOG.error("Elasticsearch node is of the wrong version {}, it must be between {} and {}! "
                             + "Please make sure you are running the correct version of Elasticsearch.",
                     clusterVersion, MINIMUM_ES_VERSION, MAXIMUM_ES_VERSION);
