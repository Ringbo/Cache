diff --git a/src/test/java/com/netflix/simianarmy/chaos/TestChaosMonkeyContext.java b/src/test/java/com/netflix/simianarmy/chaos/TestChaosMonkeyContext.java
index e3e7e3f..ff2d475 100644
--- a/src/test/java/com/netflix/simianarmy/chaos/TestChaosMonkeyContext.java
+++ b/src/test/java/com/netflix/simianarmy/chaos/TestChaosMonkeyContext.java
@@ -123,7 +123,7 @@
                 InstanceGroup gB3 = new TestInstanceGroup(CrawlerTypes.TYPE_B, "name3", "reg1", "3:i-123456783");
                 InstanceGroup gC1 = new TestInstanceGroup(CrawlerTypes.TYPE_C, "name4", "reg1", "3:i-123456784", "3:i-123456785");
                 InstanceGroup gC2 = new TestInstanceGroup(CrawlerTypes.TYPE_C, "name5", "reg1", "3:i-123456786", "3:i-123456787");
-                return Arrays.asList(gA0, gA1, gB2, gB3, gC1);
+                return Arrays.asList(gA0, gA1, gB2, gB3, gC1, gC2);
             }
         };
     }
