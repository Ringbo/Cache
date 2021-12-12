diff --git a/src/java/org/jivesoftware/openfire/keystore/IdentityStore.java b/src/java/org/jivesoftware/openfire/keystore/IdentityStore.java
index 3346b9b..8dede1a 100644
--- a/src/java/org/jivesoftware/openfire/keystore/IdentityStore.java
+++ b/src/java/org/jivesoftware/openfire/keystore/IdentityStore.java
@@ -539,7 +539,7 @@
                     boolean found = false;
                     for ( String identity : serverIdentities )
                     {
-                        if ( !DNSUtil.isNameCoveredByPattern( dnsId, identity ) )
+                        if ( DNSUtil.isNameCoveredByPattern( dnsId, identity ) )
                         {
                             found = true;
                             break;
