diff --git a/jetty-spdy/spdy-jetty/src/test/java/org/eclipse/jetty/spdy/GoAwayTest.java b/jetty-spdy/spdy-jetty/src/test/java/org/eclipse/jetty/spdy/GoAwayTest.java
index ec2a0f6..6910f56 100644
--- a/jetty-spdy/spdy-jetty/src/test/java/org/eclipse/jetty/spdy/GoAwayTest.java
+++ b/jetty-spdy/spdy-jetty/src/test/java/org/eclipse/jetty/spdy/GoAwayTest.java
@@ -219,10 +219,10 @@
             Assert.assertThat(x.getCause(), CoreMatchers.instanceOf(ClosedChannelException.class));
         }
 
-        // Be sure the last good stream is the first
+        // The last good stream is the second, because it was received by the server
         Assert.assertTrue(goAwayLatch.await(5, TimeUnit.SECONDS));
         GoAwayInfo goAway = goAwayRef.get();
         Assert.assertNotNull(goAway);
-        Assert.assertEquals(stream1.getId(), goAway.getLastStreamId());
+        Assert.assertEquals(stream2.getId(), goAway.getLastStreamId());
     }
 }
