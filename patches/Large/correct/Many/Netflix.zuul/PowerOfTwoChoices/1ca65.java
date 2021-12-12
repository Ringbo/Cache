diff --git a/zuul-netty/src/main/java/com/netflix/zuul/rxnetty/PowerOfTwoChoices.java b/zuul-netty/src/main/java/com/netflix/zuul/rxnetty/PowerOfTwoChoices.java
index f45c575..34f80e5 100644
--- a/zuul-netty/src/main/java/com/netflix/zuul/rxnetty/PowerOfTwoChoices.java
+++ b/zuul-netty/src/main/java/com/netflix/zuul/rxnetty/PowerOfTwoChoices.java
@@ -70,7 +70,7 @@
             }
 
             private HostHolder<ByteBuf, ByteBuf> selectNext() {
-                for (int i = 0; i < 3; i++) {
+                for (int i = 0; i < 5; i++) {
                     int pos  = rand.nextInt(hosts.size());
                     HostHolder<ByteBuf, ByteBuf> first  = hosts.get(pos);
                     int pos2 = (rand.nextInt(hosts.size() - 1) + pos + 1) % hosts.size();
@@ -144,7 +144,7 @@
             sub.assertError(NoHostsAvailableException.class);
 
             Assert.assertEquals("Unexpected number of hosts in the pool.", 2, rule.clientMetrics.getHostsInPool().get());
-            Assert.assertEquals("Unexpected number of Unusable hosts found count.", 3,
+            Assert.assertEquals("Unexpected number of Unusable hosts found count.", 5,
                                 rule.clientMetrics.getFoundUnusableHosts().count());
             Assert.assertEquals("Unexpected number of no usable hosts count.", 1,
                                 rule.clientMetrics.getNoUsableHosts().count());
@@ -177,7 +177,7 @@
                 return new Statement() {
                     @Override
                     public void evaluate() throws Throwable {
-                        clientMetrics = new HttpClientMetrics("");
+                        clientMetrics = new HttpClientMetrics(StrategyRule.this.toString());
                         strategy = new PowerOfTwoChoices(clientMetrics);
                         base.evaluate();
                     }
