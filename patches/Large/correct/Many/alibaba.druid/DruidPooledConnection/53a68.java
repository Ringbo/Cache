diff --git a/src/main/java/com/alibaba/druid/pool/DruidPooledConnection.java b/src/main/java/com/alibaba/druid/pool/DruidPooledConnection.java
index a211164..4557d28 100644
--- a/src/main/java/com/alibaba/druid/pool/DruidPooledConnection.java
+++ b/src/main/java/com/alibaba/druid/pool/DruidPooledConnection.java
@@ -149,7 +149,7 @@
                     return;
                 }
                 
-                LOG.warn("clear parameter error", ex);
+                LOG.error("clear parameter error", ex);
             }
         }
 
