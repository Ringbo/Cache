diff --git a/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-framework-core/src/main/java/org/apache/nifi/controller/repository/StandardProcessSession.java b/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-framework-core/src/main/java/org/apache/nifi/controller/repository/StandardProcessSession.java
index 22fee7f..d2ba55d 100644
--- a/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-framework-core/src/main/java/org/apache/nifi/controller/repository/StandardProcessSession.java
+++ b/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-framework-core/src/main/java/org/apache/nifi/controller/repository/StandardProcessSession.java
@@ -1210,7 +1210,7 @@
 
                     @Override
                     public FlowFileFilterResult filter(final FlowFile flowFile) {
-                        if (++polled <= maxResults) {
+                        if (++polled < maxResults) {
                             return FlowFileFilterResult.ACCEPT_AND_CONTINUE;
                         } else {
                             return FlowFileFilterResult.ACCEPT_AND_TERMINATE;
