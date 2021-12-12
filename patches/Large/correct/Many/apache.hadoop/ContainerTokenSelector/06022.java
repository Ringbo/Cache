diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-common/src/main/java/org/apache/hadoop/yarn/security/ContainerTokenSelector.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-common/src/main/java/org/apache/hadoop/yarn/security/ContainerTokenSelector.java
index 5a3b494..a1c0a91 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-common/src/main/java/org/apache/hadoop/yarn/security/ContainerTokenSelector.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-common/src/main/java/org/apache/hadoop/yarn/security/ContainerTokenSelector.java
@@ -46,7 +46,7 @@
     }
     for (Token<? extends TokenIdentifier> token : tokens) {
       if (LOG.isDebugEnabled()) {
-        LOG.info("Looking for service: " + service + ". Current token is "
+        LOG.debug("Looking for service: " + service + ". Current token is "
             + token);
       }
       if (ContainerTokenIdentifier.KIND.equals(token.getKind()) && 
