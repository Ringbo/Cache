diff --git a/samples/chat/src/main/java/org/atmosphere/samples/chat/ChatAtmosphereHandler.java b/samples/chat/src/main/java/org/atmosphere/samples/chat/ChatAtmosphereHandler.java
index 3498112..d355f77 100644
--- a/samples/chat/src/main/java/org/atmosphere/samples/chat/ChatAtmosphereHandler.java
+++ b/samples/chat/src/main/java/org/atmosphere/samples/chat/ChatAtmosphereHandler.java
@@ -102,7 +102,7 @@
                 if (clusterType.equals("jgroups")){
                     event.getAtmosphereConfig().getServletContext().log("JGroupsFilter enabled");
                     bc.getBroadcasterConfig().addFilter(
-                            new JGroupsFilter(bc, event.getAtmosphereConfig().getWebServerName()));
+                            new JGroupsFilter(bc));
                 }
             }
 
