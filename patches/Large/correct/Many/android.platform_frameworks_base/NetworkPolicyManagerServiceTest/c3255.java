diff --git a/services/tests/servicestests/src/com/android/server/NetworkPolicyManagerServiceTest.java b/services/tests/servicestests/src/com/android/server/NetworkPolicyManagerServiceTest.java
index 8b9f718..8392672 100644
--- a/services/tests/servicestests/src/com/android/server/NetworkPolicyManagerServiceTest.java
+++ b/services/tests/servicestests/src/com/android/server/NetworkPolicyManagerServiceTest.java
@@ -216,7 +216,7 @@
         expectLastCall().atLeastOnce();
 
         // expect to answer screen status during systemReady()
-        expect(mPowerManager.isScreenOn()).andReturn(true).atLeastOnce();
+        expect(mPowerManager.isInteractive()).andReturn(true).atLeastOnce();
         expect(mNetworkManager.isBandwidthControlEnabled()).andReturn(true).atLeastOnce();
         expectCurrentTime();
 
@@ -331,7 +331,7 @@
         verifyAndReset();
 
         // now turn screen off and verify REJECT rule
-        expect(mPowerManager.isScreenOn()).andReturn(false).atLeastOnce();
+        expect(mPowerManager.isInteractive()).andReturn(false).atLeastOnce();
         expectSetUidNetworkRules(UID_A, true);
         expectSetUidForeground(UID_A, false);
         future = expectRulesChanged(UID_A, RULE_REJECT_METERED);
@@ -341,7 +341,7 @@
         verifyAndReset();
 
         // and turn screen back on, verify ALLOW rule restored
-        expect(mPowerManager.isScreenOn()).andReturn(true).atLeastOnce();
+        expect(mPowerManager.isInteractive()).andReturn(true).atLeastOnce();
         expectSetUidNetworkRules(UID_A, false);
         expectSetUidForeground(UID_A, true);
         future = expectRulesChanged(UID_A, RULE_ALLOW_ALL);
