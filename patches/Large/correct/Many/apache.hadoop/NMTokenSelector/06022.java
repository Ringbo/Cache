diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-common/src/main/java/org/apache/hadoop/yarn/security/NMTokenSelector.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-common/src/main/java/org/apache/hadoop/yarn/security/NMTokenSelector.java
index c57e4a2..43899b5 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-common/src/main/java/org/apache/hadoop/yarn/security/NMTokenSelector.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-common/src/main/java/org/apache/hadoop/yarn/security/NMTokenSelector.java
@@ -42,7 +42,7 @@
     }
     for (Token<? extends TokenIdentifier> token : tokens) {
       if (LOG.isDebugEnabled()) {
-        LOG.info("Looking for service: " + service + ". Current token is "
+        LOG.debug("Looking for service: " + service + ". Current token is "
             + token);
       }
       if (NMTokenIdentifier.KIND.equals(token.getKind()) && 
