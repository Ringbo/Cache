diff --git a/liquibase-core/src/test/java/liquibase/util/SpringBootFatJarTest.java b/liquibase-core/src/test/java/liquibase/util/SpringBootFatJarTest.java
index 2f0181b..25d8160 100644
--- a/liquibase-core/src/test/java/liquibase/util/SpringBootFatJarTest.java
+++ b/liquibase-core/src/test/java/liquibase/util/SpringBootFatJarTest.java
@@ -8,7 +8,7 @@
     @Test
     public void testGetPathForResourceWithTwoBangs() {
         String result = SpringBootFatJar.getPathForResource("some/path!/that/has!/two/bangs");
-        assertEquals(result, "that/has/two/bangs");
+        assertEquals("that/has/two/bangs", result);
     }
 
     @Test
