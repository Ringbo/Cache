diff --git a/flyway-core/src/main/java/com/googlecode/flyway/core/util/ResourceUtils.java b/flyway-core/src/main/java/com/googlecode/flyway/core/util/ResourceUtils.java
index 4902837..f12b31b 100644
--- a/flyway-core/src/main/java/com/googlecode/flyway/core/util/ResourceUtils.java
+++ b/flyway-core/src/main/java/com/googlecode/flyway/core/util/ResourceUtils.java
@@ -43,7 +43,7 @@
      * @return The resource contents as a string.
      */
     public static String loadResourceAsString(String location) {
-        return loadResourceAsString(new ClassPathResource(location), "UTF-8");
+        return loadResourceAsString(new ClassPathResource(location, ResourceUtils.class.getClassLoader()), "UTF-8");
     }
 
     /**
