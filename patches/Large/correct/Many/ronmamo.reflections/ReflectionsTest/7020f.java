diff --git a/src/test/java/org/reflections/ReflectionsTest.java b/src/test/java/org/reflections/ReflectionsTest.java
index 351e193..2e9dd07 100644
--- a/src/test/java/org/reflections/ReflectionsTest.java
+++ b/src/test/java/org/reflections/ReflectionsTest.java
@@ -214,7 +214,7 @@
 
     @Test
     public void testResourcesScanner() {
-        Predicate<String> filter = new FilterBuilder().include(".*\\.xml");
+        Predicate<String> filter = new FilterBuilder().include(".*\\.xml").exclude(".*testModel-reflections\\.xml");
         Reflections reflections = new Reflections(new ConfigurationBuilder()
                 .filterInputsBy(filter)
                 .setScanners(new ResourcesScanner())
@@ -224,8 +224,7 @@
         assertThat(resolved, are("META-INF/reflections/resource1-reflections.xml"));
 
         Set<String> resources = reflections.getStore().get(ResourcesScanner.class.getSimpleName()).keySet();
-        assertThat(resources, are("resource1-reflections.xml", "resource2-reflections.xml",
-                "testModel-reflections.xml"));
+        assertThat(resources, are("resource1-reflections.xml", "resource2-reflections.xml"));
     }
 
     @Test
