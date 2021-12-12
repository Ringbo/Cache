diff --git a/jetty-client/src/main/java/org/eclipse/jetty/client/HttpClient.java b/jetty-client/src/main/java/org/eclipse/jetty/client/HttpClient.java
index abc94cd..023da71 100644
--- a/jetty-client/src/main/java/org/eclipse/jetty/client/HttpClient.java
+++ b/jetty-client/src/main/java/org/eclipse/jetty/client/HttpClient.java
@@ -729,7 +729,7 @@
      */
     public void setUserAgentField(HttpField agent)
     {
-        if (agent.getHeader() != HttpHeader.USER_AGENT)
+        if (agent != null && agent.getHeader() != HttpHeader.USER_AGENT)
             throw new IllegalArgumentException();
         this.agentField = agent;
     }
