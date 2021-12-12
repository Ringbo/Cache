diff --git a/src/main/java/com/google/devtools/build/lib/skyframe/serialization/autocodec/AutoCodecProcessor.java b/src/main/java/com/google/devtools/build/lib/skyframe/serialization/autocodec/AutoCodecProcessor.java
index eb8e6c2..fb945a9 100644
--- a/src/main/java/com/google/devtools/build/lib/skyframe/serialization/autocodec/AutoCodecProcessor.java
+++ b/src/main/java/com/google/devtools/build/lib/skyframe/serialization/autocodec/AutoCodecProcessor.java
@@ -202,7 +202,7 @@
   private TypeSpec.Builder buildClassWithAutoValueBuilderStrategy(
       TypeElement encodedType, boolean startMemoizing) {
     TypeElement builderType = findBuilderType(encodedType);
-    List<ExecutableElement> getters = findGettersFromType(encodedType);
+    List<ExecutableElement> getters = findGettersFromType(encodedType, builderType);
     ExecutableElement builderCreationMethod = findBuilderCreationMethod(encodedType, builderType);
     ExecutableElement buildMethod = findBuildMethod(encodedType, builderType);
     TypeSpec.Builder codecClassBuilder =
@@ -287,14 +287,18 @@
     return builderType;
   }
 
-  private List<ExecutableElement> findGettersFromType(TypeElement encodedType) {
+  private List<ExecutableElement> findGettersFromType(
+      TypeElement encodedType, TypeElement builderTypeForFiltering) {
     List<ExecutableElement> result = new ArrayList<>();
     for (ExecutableElement method :
         ElementFilter.methodsIn(env.getElementUtils().getAllMembers(encodedType))) {
       if (!method.getModifiers().contains(Modifier.STATIC)
           && method.getModifiers().contains(Modifier.ABSTRACT)
           && method.getParameters().isEmpty()
-          && method.getReturnType().getKind() != TypeKind.VOID) {
+          && method.getReturnType().getKind() != TypeKind.VOID
+          && (!method.getReturnType().getKind().equals(TypeKind.DECLARED)
+              || !builderTypeForFiltering.equals(
+                  env.getTypeUtils().asElement(method.getReturnType())))) {
         result.add(method);
       }
     }
@@ -415,13 +419,13 @@
         ElementFilter.methodsIn(env.getElementUtils().getAllMembers(builderType));
     String varName = getNameFromGetter(getter);
     TypeMirror type = getter.getReturnType();
-    String setterName = addCamelCasePrefix(varName, "set");
+    ImmutableSet<String> setterNames = ImmutableSet.of(varName, addCamelCasePrefix(varName, "set"));
 
     ExecutableElement setterMethod = null;
     for (ExecutableElement method : methods) {
       if (!method.getModifiers().contains(Modifier.STATIC)
           && !method.getModifiers().contains(Modifier.PRIVATE)
-          && method.getSimpleName().toString().equals(setterName)
+          && setterNames.contains(method.getSimpleName().toString())
           && method.getReturnType().equals(builderType.asType())
           && method.getParameters().size() == 1
           && env.getTypeUtils()
