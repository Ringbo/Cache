diff --git a/src/net/java/sip/communicator/impl/contactlist/MetaContactImpl.java b/src/net/java/sip/communicator/impl/contactlist/MetaContactImpl.java
index 68a4d1d..7dc3dca 100644
--- a/src/net/java/sip/communicator/impl/contactlist/MetaContactImpl.java
+++ b/src/net/java/sip/communicator/impl/contactlist/MetaContactImpl.java
@@ -316,7 +316,7 @@
             ? 1
             : 0;
 
-        return ( (10 - isOnline) - (10 - targetIsOnline)) * 1000000
+        return ( (10 - isOnline) - (10 - targetIsOnline)) * 100000000
             + getDisplayName().compareToIgnoreCase(target.getDisplayName())
             * 10000
             + getMetaUID().compareTo(target.getMetaUID());
