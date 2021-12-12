diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/intentions/control/CreateParameterForFieldIntention.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/intentions/control/CreateParameterForFieldIntention.java
index 49865e8..f14d383 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/intentions/control/CreateParameterForFieldIntention.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/intentions/control/CreateParameterForFieldIntention.java
@@ -263,9 +263,9 @@
     return findCandidatesCached(constructor, (GrTypeDefinition)clazz);
   }
 
-  private static List<GrField> findCandidates(GrMethod constructor, final GrTypeDefinition clazz) {
+  private static List<GrField> findCandidates(PsiMethod constructor, final GrTypeDefinition clazz) {
     final List<GrField> usedFields = new ArrayList<GrField>();
-    final GrOpenBlock block = constructor.getBlock();
+    final GrOpenBlock block = constructor instanceof GrMethod ? ((GrMethod)constructor).getBlock() : null;
     if (block == null) {
       return usedFields;
     }
@@ -308,7 +308,7 @@
     return fields;
   }
 
-  private static List<GrField> findCandidatesCached(final GrMethod constructor, final GrTypeDefinition clazz) {
+  private static List<GrField> findCandidatesCached(final PsiMethod constructor, final GrTypeDefinition clazz) {
     final CachedValue<List<GrField>> value = constructor.getUserData(FIELD_CANDIDATES);
     if (value != null && value.getValue() != null) return value.getValue();
     final CachedValue<List<GrField>> cachedValue =
@@ -335,7 +335,7 @@
     final PsiMethod[] constructors = psiClass.getConstructors();
     final PsiManager manager = field.getManager();
     for (PsiMethod constructor : constructors) {
-      final List<GrField> fields = findCandidatesCached(((GrMethod)constructor), psiClass);
+      final List<GrField> fields = findCandidatesCached(constructor, psiClass);
       if (ContainerUtil.find(fields, new Condition<GrField>() {
         @Override
         public boolean value(GrField grField) {
