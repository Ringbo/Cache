diff --git a/java/org/apache/catalina/ha/session/DeltaSession.java b/java/org/apache/catalina/ha/session/DeltaSession.java
index 96a2f8c..c9fd7f1 100644
--- a/java/org/apache/catalina/ha/session/DeltaSession.java
+++ b/java/org/apache/catalina/ha/session/DeltaSession.java
@@ -359,7 +359,7 @@
         if (notifyCluster) {
             if (log.isDebugEnabled())
                 log.debug(sm.getString("deltaSession.notifying",
-                                       ((DeltaManager)manager).getName(), 
+                                       ((ClusterManager)manager).getName(), 
                                        new Boolean(isPrimarySession()), 
                                        expiredId));
             if ( manager instanceof DeltaManager ) {
