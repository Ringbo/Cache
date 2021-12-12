diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/security/HBasePolicyProvider.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/security/HBasePolicyProvider.java
index a1c32ff..6fcaddd 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/security/HBasePolicyProvider.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/security/HBasePolicyProvider.java
@@ -51,7 +51,7 @@
     conf.set("hadoop.policy.file", "hbase-policy.xml");
     if (conf.getBoolean(
           ServiceAuthorizationManager.SERVICE_AUTHORIZATION_CONFIG, false)) {
-      ServiceAuthorizationManager.refresh(conf, new HBasePolicyProvider());
+      authManager.refresh(conf, new HBasePolicyProvider());
     }
   }
 }
