diff --git a/library/src/main/java/com/orm/SugarRecord.java b/library/src/main/java/com/orm/SugarRecord.java
index ee80e4e..110f158 100644
--- a/library/src/main/java/com/orm/SugarRecord.java
+++ b/library/src/main/java/com/orm/SugarRecord.java
@@ -110,11 +110,11 @@
     }
 
     public static <T> T first(Class<T>type){
-        return findById(type, 0);
+        return findById(type, 1);
     }
 
     public static <T> T last(Class<T>type){
-        return findById(type, count(type) - 1);
+        return findById(type, count(type));
     }
 
     public static <T> Iterator<T> findAll(Class<T> type) {
