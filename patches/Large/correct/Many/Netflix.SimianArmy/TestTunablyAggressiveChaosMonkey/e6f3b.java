diff --git a/src/test/java/com/netflix/simianarmy/tunable/TestTunablyAggressiveChaosMonkey.java b/src/test/java/com/netflix/simianarmy/tunable/TestTunablyAggressiveChaosMonkey.java
index c044312..b768a2f 100644
--- a/src/test/java/com/netflix/simianarmy/tunable/TestTunablyAggressiveChaosMonkey.java
+++ b/src/test/java/com/netflix/simianarmy/tunable/TestTunablyAggressiveChaosMonkey.java
@@ -17,7 +17,7 @@
   public void testFullProbability_basic() {
     TestChaosMonkeyContext ctx = new TestChaosMonkeyContext("fullProbability.properties");
 
-    TunablyAggresiveChaosMonkey chaos = new TunablyAggresiveChaosMonkey(ctx);
+    TunablyAggressiveChaosMonkey chaos = new TunablyAggressiveChaosMonkey(ctx);
 
     InstanceGroup basic = new BasicInstanceGroup("basic", GroupTypes.TYPE_A, "region");
     
@@ -30,7 +30,7 @@
   public void testFullProbability_tuned() {
     TestChaosMonkeyContext ctx = new TestChaosMonkeyContext("fullProbability.properties");
 
-    TunablyAggresiveChaosMonkey chaos = new TunablyAggresiveChaosMonkey(ctx);
+    TunablyAggressiveChaosMonkey chaos = new TunablyAggressiveChaosMonkey(ctx);
 
     TunableInstanceGroup tuned = new TunableInstanceGroup("basic", GroupTypes.TYPE_A, "region");
     tuned.setAggressionCoefficient(0.5);
