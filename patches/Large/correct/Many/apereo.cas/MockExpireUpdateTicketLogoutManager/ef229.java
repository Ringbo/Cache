diff --git a/cas-server-core/src/test/java/org/jasig/cas/MockExpireUpdateTicketLogoutManager.java b/cas-server-core/src/test/java/org/jasig/cas/MockExpireUpdateTicketLogoutManager.java
index 85d8e31..359fe74 100644
--- a/cas-server-core/src/test/java/org/jasig/cas/MockExpireUpdateTicketLogoutManager.java
+++ b/cas-server-core/src/test/java/org/jasig/cas/MockExpireUpdateTicketLogoutManager.java
@@ -47,6 +47,6 @@
 
     @Override
     public String createFrontChannelLogoutMessage(final LogoutRequest logoutRequest) {
-        throw new IllegalArgumentException("Not implemented");
+        throw new UnsupportedOperationException("Not implemented");
     }
 }
