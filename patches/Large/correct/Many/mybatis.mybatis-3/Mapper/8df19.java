diff --git a/src/test/java/org/apache/ibatis/submitted/parametrizedlist/Mapper.java b/src/test/java/org/apache/ibatis/submitted/parametrizedlist/Mapper.java
index 43e51a6..32a3bbd 100644
--- a/src/test/java/org/apache/ibatis/submitted/parametrizedlist/Mapper.java
+++ b/src/test/java/org/apache/ibatis/submitted/parametrizedlist/Mapper.java
@@ -16,9 +16,9 @@
   Map<Integer, User<String>> getAMapOfUsers();
 
   @Select("select id, name from users where id=1")
-  Map<Integer, Object> getUserAsAMap();
+  Map<String, Object> getUserAsAMap();
 
   @Select("select id, name from users")
-  List<Map<Integer, Object>> getAListOfMaps();
+  List<Map<String, Object>> getAListOfMaps();
   
 }
