diff --git a/h2/src/main/org/h2/store/LobStorageMap.java b/h2/src/main/org/h2/store/LobStorageMap.java
index ff5397c..1a0c777 100644
--- a/h2/src/main/org/h2/store/LobStorageMap.java
+++ b/h2/src/main/org/h2/store/LobStorageMap.java
@@ -113,7 +113,7 @@
             if (lastUsedKey >= 0) {
                 break;
             }
-            lobId = lobMap.floorKey(lobId);
+            lobId = lobMap.lowerKey(lobId);
         }
         // delete all blocks that are newer
         while (true) {
