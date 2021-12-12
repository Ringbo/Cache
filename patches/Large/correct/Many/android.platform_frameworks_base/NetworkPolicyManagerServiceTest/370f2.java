diff --git a/services/tests/servicestests/src/com/android/server/NetworkPolicyManagerServiceTest.java b/services/tests/servicestests/src/com/android/server/NetworkPolicyManagerServiceTest.java
index b4fd55e..a243e4d 100644
--- a/services/tests/servicestests/src/com/android/server/NetworkPolicyManagerServiceTest.java
+++ b/services/tests/servicestests/src/com/android/server/NetworkPolicyManagerServiceTest.java
@@ -242,13 +242,13 @@
 
     @Suppress
     public void testPolicyChangeTriggersBroadcast() throws Exception {
-        mService.setUidPolicy(UID_A, POLICY_NONE);
+        mService.setAppPolicy(UID_A, POLICY_NONE);
 
         // change background policy and expect broadcast
         final Future<Intent> backgroundChanged = mServiceContext.nextBroadcastIntent(
                 ConnectivityManager.ACTION_BACKGROUND_DATA_SETTING_CHANGED);
 
-        mService.setUidPolicy(UID_A, POLICY_REJECT_METERED_BACKGROUND);
+        mService.setAppPolicy(UID_A, POLICY_REJECT_METERED_BACKGROUND);
 
         backgroundChanged.get();
     }
@@ -316,7 +316,7 @@
         expectSetUidForeground(UID_A, true);
         future = expectRulesChanged(UID_A, RULE_ALLOW_ALL);
         replay();
-        mService.setUidPolicy(UID_A, POLICY_REJECT_METERED_BACKGROUND);
+        mService.setAppPolicy(UID_A, POLICY_REJECT_METERED_BACKGROUND);
         future.get();
         verifyAndReset();
 
@@ -357,7 +357,7 @@
         expectSetUidForeground(UID_A, true);
         future = expectRulesChanged(UID_A, RULE_ALLOW_ALL);
         replay();
-        mService.setUidPolicy(UID_A, POLICY_NONE);
+        mService.setAppPolicy(UID_A, POLICY_NONE);
         future.get();
         verifyAndReset();
 
@@ -379,7 +379,7 @@
         expectSetUidForeground(UID_A, false);
         future = expectRulesChanged(UID_A, RULE_REJECT_METERED);
         replay();
-        mService.setUidPolicy(UID_A, POLICY_REJECT_METERED_BACKGROUND);
+        mService.setAppPolicy(UID_A, POLICY_REJECT_METERED_BACKGROUND);
         future.get();
         verifyAndReset();
 
@@ -411,7 +411,7 @@
         future = expectRulesChanged(UID_A, RULE_ALLOW_ALL);
         replay();
         mProcessObserver.onForegroundActivitiesChanged(PID_1, UID_A, false);
-        mService.setUidPolicy(UID_A, POLICY_NONE);
+        mService.setAppPolicy(UID_A, POLICY_NONE);
         future.get();
         verifyAndReset();
 
@@ -420,7 +420,7 @@
         expectSetUidForeground(UID_A, false);
         future = expectRulesChanged(UID_A, RULE_REJECT_METERED);
         replay();
-        mService.setUidPolicy(UID_A, POLICY_REJECT_METERED_BACKGROUND);
+        mService.setAppPolicy(UID_A, POLICY_REJECT_METERED_BACKGROUND);
         future.get();
         verifyAndReset();
 
@@ -429,7 +429,7 @@
         expectSetUidForeground(UID_A, false);
         future = expectRulesChanged(UID_A, RULE_ALLOW_ALL);
         replay();
-        mService.setUidPolicy(UID_A, POLICY_NONE);
+        mService.setAppPolicy(UID_A, POLICY_NONE);
         future.get();
         verifyAndReset();
     }
@@ -605,7 +605,7 @@
         expectSetUidForeground(UID_A, false);
         future = expectRulesChanged(UID_A, RULE_REJECT_METERED);
         replay();
-        mService.setUidPolicy(UID_A, POLICY_REJECT_METERED_BACKGROUND);
+        mService.setAppPolicy(UID_A, POLICY_REJECT_METERED_BACKGROUND);
         future.get();
         verifyAndReset();
 
