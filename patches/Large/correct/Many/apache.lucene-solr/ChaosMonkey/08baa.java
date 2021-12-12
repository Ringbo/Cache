diff --git a/solr/core/src/test/org/apache/solr/cloud/ChaosMonkey.java b/solr/core/src/test/org/apache/solr/cloud/ChaosMonkey.java
index ef424a9..eb68fdb 100644
--- a/solr/core/src/test/org/apache/solr/cloud/ChaosMonkey.java
+++ b/solr/core/src/test/org/apache/solr/cloud/ChaosMonkey.java
@@ -99,9 +99,9 @@
   public void expireRandomSession() throws KeeperException, InterruptedException {
     String sliceName = getRandomSlice();
     
-    JettySolrRunner jetty = getRandomJetty(sliceName, aggressivelyKillLeaders).jetty;
+    CloudJettyRunner jetty = getRandomJetty(sliceName, aggressivelyKillLeaders);
     if (jetty != null) {
-      expireSession(jetty);
+      expireSession(jetty.jetty);
       expires.incrementAndGet();
     }
   }
@@ -110,9 +110,9 @@
     monkeyLog("cause connection loss!");
     
     String sliceName = getRandomSlice();
-    JettySolrRunner jetty = getRandomJetty(sliceName, aggressivelyKillLeaders).jetty;
+    CloudJettyRunner jetty = getRandomJetty(sliceName, aggressivelyKillLeaders);
     if (jetty != null) {
-      causeConnectionLoss(jetty);
+      causeConnectionLoss(jetty.jetty);
       connloss.incrementAndGet();
     }
   }
