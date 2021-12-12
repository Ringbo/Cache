diff --git a/plugins/discovery-ec2/src/test/java/org/elasticsearch/discovery/ec2/Ec2DiscoveryTests.java b/plugins/discovery-ec2/src/test/java/org/elasticsearch/discovery/ec2/Ec2DiscoveryTests.java
index 4fc3fae..6f88be2 100644
--- a/plugins/discovery-ec2/src/test/java/org/elasticsearch/discovery/ec2/Ec2DiscoveryTests.java
+++ b/plugins/discovery-ec2/src/test/java/org/elasticsearch/discovery/ec2/Ec2DiscoveryTests.java
@@ -251,7 +251,7 @@
         for (int i=0; i<3; i++) {
             provider.buildDynamicNodes();
         }
-        assertEquals(provider.fetchCount, is(3));
+        assertThat(provider.fetchCount, is(3));
     }
 
     public void testGetNodeListCached() throws Exception {
@@ -268,11 +268,11 @@
         for (int i=0; i<3; i++) {
             provider.buildDynamicNodes();
         }
-        assertEquals(provider.fetchCount, is(1));
+        assertThat(provider.fetchCount, is(1));
         Thread.sleep(1_000L); // wait for cache to expire
         for (int i=0; i<3; i++) {
             provider.buildDynamicNodes();
         }
-        assertEquals(provider.fetchCount, is(2));
+        assertThat(provider.fetchCount, is(2));
     }
 }
