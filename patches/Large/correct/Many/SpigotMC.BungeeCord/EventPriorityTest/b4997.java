diff --git a/event/src/test/java/net/md_5/bungee/event/EventPriorityTest.java b/event/src/test/java/net/md_5/bungee/event/EventPriorityTest.java
index e5338ec..3881b73 100644
--- a/event/src/test/java/net/md_5/bungee/event/EventPriorityTest.java
+++ b/event/src/test/java/net/md_5/bungee/event/EventPriorityTest.java
@@ -8,7 +8,7 @@
 {
 
     private final EventBus bus = new EventBus();
-    private final CountDownLatch latch = new CountDownLatch( 5 );
+    private final CountDownLatch latch = new CountDownLatch( 7);
 
     @Test
     public void testPriority()
@@ -22,21 +22,21 @@
     @EventHandler(priority = Byte.MIN_VALUE)
     public void onMinPriority(PriorityTestEvent event)
     {
-        Assert.assertEquals( 5, latch.getCount() );
+        Assert.assertEquals( 7, latch.getCount() );
         latch.countDown();
     }
 
     @EventHandler(priority = EventPriority.LOWEST)
     public void onLowestPriority(PriorityTestEvent event)
     {
-        Assert.assertEquals( 4, latch.getCount() );
+        Assert.assertEquals( 6, latch.getCount() );
         latch.countDown();
     }
 
     @EventHandler
     public void onNormalPriority(PriorityTestEvent event)
     {
-        Assert.assertEquals( 3, latch.getCount() );
+        Assert.assertEquals( 4, latch.getCount() );
         latch.countDown();
     }
 
@@ -64,14 +64,14 @@
         @EventHandler(priority = EventPriority.HIGH)
         public void onHighPriority(PriorityTestEvent event)
         {
-            Assert.assertEquals( 2, latch.getCount() );
+            Assert.assertEquals( 3, latch.getCount() );
             latch.countDown();
         }
 
         @EventHandler(priority = EventPriority.LOW)
         public void onLowPriority(PriorityTestEvent event)
         {
-            Assert.assertEquals( 4, latch.getCount() );
+            Assert.assertEquals( 5, latch.getCount() );
             latch.countDown();
         }
     }
