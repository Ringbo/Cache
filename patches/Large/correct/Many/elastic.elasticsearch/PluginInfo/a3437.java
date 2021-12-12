diff --git a/src/main/java/org/elasticsearch/action/admin/cluster/node/info/PluginInfo.java b/src/main/java/org/elasticsearch/action/admin/cluster/node/info/PluginInfo.java
index 800b97d..9dc6e24 100644
--- a/src/main/java/org/elasticsearch/action/admin/cluster/node/info/PluginInfo.java
+++ b/src/main/java/org/elasticsearch/action/admin/cluster/node/info/PluginInfo.java
@@ -207,13 +207,13 @@
 
     @Override
     public String toString() {
-        final StringBuffer sb = new StringBuffer("PluginInfo{");
+        final StringBuilder sb = new StringBuilder("PluginInfo{");
         sb.append("name='").append(name).append('\'');
         sb.append(", description='").append(description).append('\'');
         sb.append(", site=").append(site);
         sb.append(", jvm=").append(jvm);
         sb.append(", version='").append(version).append('\'');
-        sb.append(", isolation='").append(isolation);
+        sb.append(", isolation=").append(isolation);
         sb.append('}');
         return sb.toString();
     }
