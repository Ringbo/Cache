diff --git a/source/org/jivesoftware/smackx/PrivateDataManager.java b/source/org/jivesoftware/smackx/PrivateDataManager.java
index 4cbc7fb..765337a 100644
--- a/source/org/jivesoftware/smackx/PrivateDataManager.java
+++ b/source/org/jivesoftware/smackx/PrivateDataManager.java
@@ -111,9 +111,9 @@
      * @param namespace the XML namespace.
      * @return the PrivateData provider.
      */
-    public static PrivateData getPrivateDataProvider(String elementName, String namespace) {
+    public static PrivateDataProvider getPrivateDataProvider(String elementName, String namespace) {
         String key = getProviderKey(elementName, namespace);
-        return (PrivateData)privateDataProviders.get(key);
+        return (PrivateDataProvider)privateDataProviders.get(key);
     }
 
     /**
