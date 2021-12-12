diff --git a/angel-ps/core/src/main/java/com/tencent/angel/utils/NetUtils.java b/angel-ps/core/src/main/java/com/tencent/angel/utils/NetUtils.java
index 34c42d2..fd824a7 100644
--- a/angel-ps/core/src/main/java/com/tencent/angel/utils/NetUtils.java
+++ b/angel-ps/core/src/main/java/com/tencent/angel/utils/NetUtils.java
@@ -135,7 +135,7 @@
       endPort = Integer.valueOf(portRangeArray[1]);
     }
 
-    int maxTryTime = 10;
+    int maxTryTime = 100;
     Random r = new Random();
     int port = -1;
 
