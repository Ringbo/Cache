diff --git a/modules/core/src/main/java/org/apache/ignite/internal/IgniteKernal.java b/modules/core/src/main/java/org/apache/ignite/internal/IgniteKernal.java
index 05b1997..87ccf93 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/IgniteKernal.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/IgniteKernal.java
@@ -1192,7 +1192,7 @@
         if (cfg.getIncludeEventTypes() != null && cfg.getIncludeEventTypes().length != 0)
             perf.add("Disable grid events (remove 'includeEventTypes' from configuration)");
 
-        if (BinaryMarshaller.available() && (cfg.getMarshaller() != null || !(cfg.getMarshaller() instanceof BinaryMarshaller)))
+        if (BinaryMarshaller.available() && (cfg.getMarshaller() != null && !(cfg.getMarshaller() instanceof BinaryMarshaller)))
             perf.add("Use default binary marshaller (do not set 'marshaller' explicitly)");
     }
 
