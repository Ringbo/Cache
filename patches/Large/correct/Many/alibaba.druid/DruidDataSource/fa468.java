diff --git a/src/main/java/com/alibaba/druid/pool/DruidDataSource.java b/src/main/java/com/alibaba/druid/pool/DruidDataSource.java
index 1ebeec5..96190fb 100644
--- a/src/main/java/com/alibaba/druid/pool/DruidDataSource.java
+++ b/src/main/java/com/alibaba/druid/pool/DruidDataSource.java
@@ -1569,7 +1569,7 @@
         value.setTestWhileIdle(this.isTestWhileIdle());
 
         value.setDefaultAutoCommit(this.isDefaultAutoCommit());
-        value.setDefaultReadOnly(this.isDefaultAutoCommit());
+        value.setDefaultReadOnly(this.getDefaultReadOnly());
         value.setDefaultTransactionIsolation(this.getDefaultTransactionIsolation());
 
         value.setLogicConnectErrorCount(connectErrorCount.getAndSet(0));
@@ -2294,7 +2294,7 @@
         dataMap.put("TestWhileIdle", this.isTestWhileIdle());
 
         dataMap.put("DefaultAutoCommit", this.isDefaultAutoCommit());
-        dataMap.put("DefaultReadOnly", this.isDefaultAutoCommit());
+        dataMap.put("DefaultReadOnly", this.getDefaultReadOnly());
         dataMap.put("DefaultTransactionIsolation", this.getDefaultTransactionIsolation());
 
         dataMap.put("LogicConnectCount", connectCount);
