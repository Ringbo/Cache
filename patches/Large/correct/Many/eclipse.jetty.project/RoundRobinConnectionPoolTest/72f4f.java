diff --git a/jetty-client/src/test/java/org/eclipse/jetty/client/RoundRobinConnectionPoolTest.java b/jetty-client/src/test/java/org/eclipse/jetty/client/RoundRobinConnectionPoolTest.java
index d831f23..c7bd158 100644
--- a/jetty-client/src/test/java/org/eclipse/jetty/client/RoundRobinConnectionPoolTest.java
+++ b/jetty-client/src/test/java/org/eclipse/jetty/client/RoundRobinConnectionPoolTest.java
@@ -74,7 +74,7 @@
             int base = i % maxConnections;
             int expected = remotePorts.get(base);
             int candidate = remotePorts.get(i);
-            Assert.assertThat(expected, Matchers.equalTo(candidate));
+            Assert.assertThat(client.dump() + System.lineSeparator() + remotePorts.toString(), expected, Matchers.equalTo(candidate));
             if (i > 0)
                 Assert.assertThat(remotePorts.get(i - 1), Matchers.not(Matchers.equalTo(candidate)));
         }
