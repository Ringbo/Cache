diff --git a/extensions/src/main/java/org/jivesoftware/smackx/iqprivate/PrivateDataManager.java b/extensions/src/main/java/org/jivesoftware/smackx/iqprivate/PrivateDataManager.java
index 5e831dd..120bdd3 100644
--- a/extensions/src/main/java/org/jivesoftware/smackx/iqprivate/PrivateDataManager.java
+++ b/extensions/src/main/java/org/jivesoftware/smackx/iqprivate/PrivateDataManager.java
@@ -60,7 +60,7 @@
 
     public static synchronized PrivateDataManager getInstanceFor(XMPPConnection connection) {
         PrivateDataManager privateDataManager = instances.get(connection);
-        if (connection == null) {
+        if (privateDataManager == null) {
             privateDataManager = new PrivateDataManager(connection);
         }
         return privateDataManager;
