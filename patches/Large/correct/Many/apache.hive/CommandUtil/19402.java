diff --git a/ql/src/java/org/apache/hadoop/hive/ql/processors/CommandUtil.java b/ql/src/java/org/apache/hadoop/hive/ql/processors/CommandUtil.java
index 7eceb21..87c8fbb 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/processors/CommandUtil.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/processors/CommandUtil.java
@@ -68,7 +68,7 @@
   static void authorizeCommandThrowEx(SessionState ss, HiveOperationType type,
       List<String> command) throws HiveAuthzPluginException, HiveAccessControlException {
     HivePrivilegeObject commandObj = HivePrivilegeObject.createHivePrivilegeObject(command);
-    ss.getAuthorizerV2().checkPrivileges(type, Arrays.asList(commandObj), null);
+    ss.getAuthorizerV2().checkPrivileges(type, Arrays.asList(commandObj), null, null);
   }
 
 
