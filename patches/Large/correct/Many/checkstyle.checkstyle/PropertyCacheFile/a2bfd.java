diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/PropertyCacheFile.java b/src/main/java/com/puppycrawl/tools/checkstyle/PropertyCacheFile.java
index fa6e7c8..d085d48 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/PropertyCacheFile.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/PropertyCacheFile.java
@@ -112,7 +112,7 @@
                 if (!currentConfigHash.equals(cachedConfigHash)) {
                     // Detected configuration change - clear cache
                     details.clear();
-                    details.put(CONFIG_HASH_KEY, currentConfigHash);
+                    details.setProperty(CONFIG_HASH_KEY, currentConfigHash);
                 }
             }
             finally {
@@ -121,7 +121,7 @@
         }
         else {
             // put the hash in the file if the file is going to be created
-            details.put(CONFIG_HASH_KEY, currentConfigHash);
+            details.setProperty(CONFIG_HASH_KEY, currentConfigHash);
         }
     }
 
@@ -169,7 +169,7 @@
      * @param timestamp the timestamp of the file
      */
     void put(String fileName, long timestamp) {
-        details.put(fileName, Long.toString(timestamp));
+        details.setProperty(fileName, Long.toString(timestamp));
     }
 
     /**
