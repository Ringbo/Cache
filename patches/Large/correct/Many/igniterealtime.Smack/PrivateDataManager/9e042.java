diff --git a/source/org/jivesoftware/smackx/PrivateDataManager.java b/source/org/jivesoftware/smackx/PrivateDataManager.java
index 2a560b5..cd0999c 100644
--- a/source/org/jivesoftware/smackx/PrivateDataManager.java
+++ b/source/org/jivesoftware/smackx/PrivateDataManager.java
@@ -95,11 +95,11 @@
      *
      * @param elementName the XML element name.
      * @param namespace the XML namespace.
-     * @return the IQ provider.
+     * @return the PrivateData provider.
      */
-    public static Object getPrivateDataProvider(String elementName, String namespace) {
+    public static PrivateData getPrivateDataProvider(String elementName, String namespace) {
         String key = getProviderKey(elementName, namespace);
-        return privateDataProviders.get(key);
+        return (PrivateData)privateDataProviders.get(key);
     }
 
     /**
@@ -108,10 +108,10 @@
      *
      * @param elementName the XML element name.
      * @param namespace the XML namespace.
-     * @param provider the IQ provider.
+     * @param provider the private data provider.
      */
     public static void addPrivateDataProvider(String elementName, String namespace,
-            IQProvider provider)
+            PrivateDataProvider provider)
     {
         String key = getProviderKey(elementName, namespace);
         privateDataProviders.put(key, provider);
