diff --git a/src/main/java/com/alibaba/druid/wall/WallProvider.java b/src/main/java/com/alibaba/druid/wall/WallProvider.java
index b99f34a..31e5c53 100644
--- a/src/main/java/com/alibaba/druid/wall/WallProvider.java
+++ b/src/main/java/com/alibaba/druid/wall/WallProvider.java
@@ -40,7 +40,7 @@
         lock.writeLock().lock();
         try {
             if (whiteList == null) {
-                whiteList = new LinkedHashMap<String, Object>(whileListMaxSize, 0.75f, true);
+                whiteList = new LinkedHashMap<String, Object>(whileListMaxSize, 0.75f, false);
             }
 
             whiteList.put(sql, PRESENT);
