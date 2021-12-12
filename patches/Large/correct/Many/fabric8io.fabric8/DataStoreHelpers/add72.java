diff --git a/fabric/fabric-core/src/main/scala/org/fusesource/fabric/internal/DataStoreHelpers.java b/fabric/fabric-core/src/main/scala/org/fusesource/fabric/internal/DataStoreHelpers.java
index 7e07db9..d85abe8 100644
--- a/fabric/fabric-core/src/main/scala/org/fusesource/fabric/internal/DataStoreHelpers.java
+++ b/fabric/fabric-core/src/main/scala/org/fusesource/fabric/internal/DataStoreHelpers.java
@@ -116,14 +116,14 @@
      * @return  The target value or an empty String.
      */
     public static String substituteBundleProperty(String key, BundleContext bundleContext) {
-        String value = "";
+        String value = null;
         if (bundleContext != null) {
             value = bundleContext.getProperty(key);
         }
         if (value == null) {
-            value = System.getProperty(key, "");
+            value = System.getProperty(key);
         }
-        return value;
+        return value != null ? value : "";
     }
 
 }
