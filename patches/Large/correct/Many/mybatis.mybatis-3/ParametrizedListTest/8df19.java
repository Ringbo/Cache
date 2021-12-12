diff --git a/src/test/java/org/apache/ibatis/submitted/parametrizedlist/ParametrizedListTest.java b/src/test/java/org/apache/ibatis/submitted/parametrizedlist/ParametrizedListTest.java
index b487ee9..c16292f 100644
--- a/src/test/java/org/apache/ibatis/submitted/parametrizedlist/ParametrizedListTest.java
+++ b/src/test/java/org/apache/ibatis/submitted/parametrizedlist/ParametrizedListTest.java
@@ -93,7 +93,7 @@
     SqlSession sqlSession = sqlSessionFactory.openSession();
     try {
       Mapper mapper = sqlSession.getMapper(Mapper.class);
-      Map<Integer, Object> map = mapper.getUserAsAMap();
+      Map<String, Object> map = mapper.getUserAsAMap();
       Assert.assertEquals(1, map.get("ID"));
     } finally {
       sqlSession.close();
@@ -105,7 +105,7 @@
     SqlSession sqlSession = sqlSessionFactory.openSession();
     try {
       Mapper mapper = sqlSession.getMapper(Mapper.class);
-      List<Map<Integer, Object>> map = mapper.getAListOfMaps();
+      List<Map<String, Object>> map = mapper.getAListOfMaps();
       Assert.assertEquals(1, map.get(0).get("ID"));
     } finally {
       sqlSession.close();
