diff --git a/rt/rs/client/src/main/java/org/apache/cxf/jaxrs/client/spec/ClientImpl.java b/rt/rs/client/src/main/java/org/apache/cxf/jaxrs/client/spec/ClientImpl.java
index 8a19043..12649d8 100644
--- a/rt/rs/client/src/main/java/org/apache/cxf/jaxrs/client/spec/ClientImpl.java
+++ b/rt/rs/client/src/main/java/org/apache/cxf/jaxrs/client/spec/ClientImpl.java
@@ -346,7 +346,7 @@
                 }
                 bean.setThreadSafe(threadSafe);
                 if (threadSafe) {
-                    Integer cleanupPeriod = getIntValue(configProps.get(THREAD_SAFE_CLIENT_PROP));
+                    Integer cleanupPeriod = getIntValue(configProps.get(THREAD_SAFE_CLIENT_STATE_CLEANUP_PROP));
                     if (cleanupPeriod == null) {
                         cleanupPeriod = THREAD_SAFE_CLIENT_STATE_CLEANUP_PERIOD;
                     }
