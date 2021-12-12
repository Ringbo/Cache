diff --git a/spock-core/src/main/java/spock/lang/Sputnik.java b/spock-core/src/main/java/spock/lang/Sputnik.java
index daf5994..dde8515 100755
--- a/spock-core/src/main/java/spock/lang/Sputnik.java
+++ b/spock-core/src/main/java/spock/lang/Sputnik.java
@@ -37,7 +37,7 @@
   // TODO: we probably shouldn't just throw these exceptions as-is
   public Sputnik(Class<?> clazz) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
     spec = new SpecInfoBuilder(clazz).build();
-    new JUnitMetadataGenerator(spec).generate();
+    new JUnitDescriptionGenerator(spec).generate();
   }
 
   public Description getDescription() {
