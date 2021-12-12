diff --git a/src/protocol/java/org/apache/jmeter/protocol/java/config/gui/JavaConfigGui.java b/src/protocol/java/org/apache/jmeter/protocol/java/config/gui/JavaConfigGui.java
index 5ad54b8..bf203c7 100644
--- a/src/protocol/java/org/apache/jmeter/protocol/java/config/gui/JavaConfigGui.java
+++ b/src/protocol/java/org/apache/jmeter/protocol/java/config/gui/JavaConfigGui.java
@@ -264,7 +264,8 @@
             return client != null;
         } catch (Exception ex) {
             log.error("Error creating class:'"+className+"' in JavaSampler "+getName()
-                +", check for a missing jar in your jmeter 'search_paths' and 'plugin_dependency_paths' properties");
+                +", check for a missing jar in your jmeter 'search_paths' and 'plugin_dependency_paths' properties",
+                ex);
             return false;
         }
     }
