diff --git a/value/src/test/java/com/google/auto/value/processor/CompilationTest.java b/value/src/test/java/com/google/auto/value/processor/CompilationTest.java
index 45bea31..50b8d6b 100644
--- a/value/src/test/java/com/google/auto/value/processor/CompilationTest.java
+++ b/value/src/test/java/com/google/auto/value/processor/CompilationTest.java
@@ -959,7 +959,7 @@
         "}");
     assertAbout(javaSources())
         .that(ImmutableList.of(javaFileObject, nestedJavaFileObject))
-        .withCompilerOptions("-Xlint:-processing")
+        .withCompilerOptions("-Xlint:-processing", "-implicit:none")
         .processedWith(new AutoValueProcessor())
         .compilesWithoutWarnings()
         .and()
