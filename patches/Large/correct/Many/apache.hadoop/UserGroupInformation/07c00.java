diff --git a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/security/UserGroupInformation.java b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/security/UserGroupInformation.java
index dde5dcd..178a472 100644
--- a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/security/UserGroupInformation.java
+++ b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/security/UserGroupInformation.java
@@ -1560,7 +1560,7 @@
       return Subject.doAs(subject, action);
     } catch (PrivilegedActionException pae) {
       Throwable cause = pae.getCause();
-      LOG.error("PriviledgedActionException as:"+this+" cause:"+cause);
+      LOG.warn("PriviledgedActionException as:"+this+" cause:"+cause);
       if (cause instanceof IOException) {
         throw (IOException) cause;
       } else if (cause instanceof Error) {
