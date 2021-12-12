diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/rest/handlers/top/GridTopologyCommandHandler.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/rest/handlers/top/GridTopologyCommandHandler.java
index d563f9f..983292c 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/rest/handlers/top/GridTopologyCommandHandler.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/rest/handlers/top/GridTopologyCommandHandler.java
@@ -261,7 +261,8 @@
             for (Iterator<Map.Entry<String, Object>> i = attrs.entrySet().iterator(); i.hasNext();) {
                 Map.Entry<String, Object> e = i.next();
 
-                if (!e.getKey().startsWith("org.apache.ignite.") && System.getProperty(e.getKey()) == null) {
+                if (!e.getKey().startsWith("org.apache.ignite.") && !e.getKey().startsWith("plugins.") &&
+                    System.getProperty(e.getKey()) == null) {
                     i.remove();
 
                     continue;
