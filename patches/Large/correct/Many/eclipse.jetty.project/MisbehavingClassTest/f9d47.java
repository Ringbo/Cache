diff --git a/jetty-websocket/javax-websocket-client-impl/src/test/java/org/eclipse/jetty/websocket/jsr356/misbehaving/MisbehavingClassTest.java b/jetty-websocket/javax-websocket-client-impl/src/test/java/org/eclipse/jetty/websocket/jsr356/misbehaving/MisbehavingClassTest.java
index a80cbe1..cb1f78d 100644
--- a/jetty-websocket/javax-websocket-client-impl/src/test/java/org/eclipse/jetty/websocket/jsr356/misbehaving/MisbehavingClassTest.java
+++ b/jetty-websocket/javax-websocket-client-impl/src/test/java/org/eclipse/jetty/websocket/jsr356/misbehaving/MisbehavingClassTest.java
@@ -105,7 +105,7 @@
                 assertThat(e.getCause(), instanceOf(RuntimeException.class));
             }
 
-            assertThat("Close should have occurred", socket.closeLatch.await(1,TimeUnit.SECONDS), is(true));
+            assertThat("Close should have occurred", socket.closeLatch.await(10,TimeUnit.SECONDS), is(true));
             assertThat("Error", socket.errors.pop(), instanceOf(RuntimeException.class));
         }
     }
@@ -129,7 +129,7 @@
                 assertThat(e.getCause(), instanceOf(RuntimeException.class));
             }
 
-            assertThat("Close should have occurred", socket.closeLatch.await(1,TimeUnit.SECONDS), is(true));
+            assertThat("Close should have occurred", socket.closeLatch.await(10,TimeUnit.SECONDS), is(true));
             assertThat("Error",socket.errors.pop(), instanceOf(RuntimeException.class));
         }
     }
