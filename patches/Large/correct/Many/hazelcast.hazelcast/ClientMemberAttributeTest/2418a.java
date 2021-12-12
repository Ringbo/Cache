diff --git a/hazelcast-client/src/test/java/com/hazelcast/client/ClientMemberAttributeTest.java b/hazelcast-client/src/test/java/com/hazelcast/client/ClientMemberAttributeTest.java
index 7b23ac2..3d6a6e6 100644
--- a/hazelcast-client/src/test/java/com/hazelcast/client/ClientMemberAttributeTest.java
+++ b/hazelcast-client/src/test/java/com/hazelcast/client/ClientMemberAttributeTest.java
@@ -63,7 +63,7 @@
             localMember.setStringAttribute("key" + i, HazelcastTestSupport.randomString());
         }
 
-        assertOpenEventually(countDownLatch, 30);
+        assertOpenEventually(countDownLatch);
     }
 
     @Test(timeout = 120000)
@@ -183,7 +183,7 @@
         m1.setIntAttribute("Test2", 321);
 
         // Force sleep to distribute value
-        latch.await(2, TimeUnit.SECONDS);
+        assertOpenEventually(latch);
 
         assertNotNull(member.getIntAttribute("Test2"));
         assertEquals(321, (int) member.getIntAttribute("Test2"));
@@ -239,7 +239,7 @@
         m1.setIntAttribute("Test", 321);
 
         // Force sleep to distribute value
-        latch.await(2, TimeUnit.SECONDS);
+        assertOpenEventually(latch);
 
         assertNotNull(member.getIntAttribute("Test"));
         assertEquals(321, (int) member.getIntAttribute("Test"));
@@ -295,7 +295,7 @@
         m1.removeAttribute("Test");
 
         // Force sleep to distribute value
-        latch.await(2, TimeUnit.SECONDS);
+        assertOpenEventually(latch);
 
         assertNull(member.getIntAttribute("Test"));
 
