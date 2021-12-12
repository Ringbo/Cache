diff --git a/dubbo-remoting/dubbo-remoting-grizzly/src/main/java/org/apache/dubbo/remoting/transport/grizzly/GrizzlyClient.java b/dubbo-remoting/dubbo-remoting-grizzly/src/main/java/org/apache/dubbo/remoting/transport/grizzly/GrizzlyClient.java
index 30f47b8..2753d21 100644
--- a/dubbo-remoting/dubbo-remoting-grizzly/src/main/java/org/apache/dubbo/remoting/transport/grizzly/GrizzlyClient.java
+++ b/dubbo-remoting/dubbo-remoting-grizzly/src/main/java/org/apache/dubbo/remoting/transport/grizzly/GrizzlyClient.java
@@ -66,7 +66,7 @@
                 .setMaxPoolSize(Integer.MAX_VALUE)
                 .setKeepAliveTime(60L, TimeUnit.SECONDS);
         builder.setTcpNoDelay(true).setKeepAlive(true)
-                .setConnectionTimeout(getTimeout())
+                .setConnectionTimeout(getConnectTimeout())
                 .setIOStrategy(SameThreadIOStrategy.getInstance());
         transport = builder.build();
         transport.setProcessor(filterChainBuilder.build());
