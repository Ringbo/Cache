diff --git a/h2o-core/src/main/java/water/api/TypeaheadHandler.java b/h2o-core/src/main/java/water/api/TypeaheadHandler.java
index 8dc6bb1..8b50be3 100644
--- a/h2o-core/src/main/java/water/api/TypeaheadHandler.java
+++ b/h2o-core/src/main/java/water/api/TypeaheadHandler.java
@@ -5,7 +5,7 @@
 
 class TypeaheadHandler extends Handler {
   @SuppressWarnings("unused") // called through reflection by RequestServer
-  public Schema files(int version, TypeaheadV3 t) {
+  public TypeaheadV3 files(int version, TypeaheadV3 t) {
     ArrayList<String> matches = H2O.getPM().calcTypeaheadMatches(t.src, t.limit);
     t.matches = matches.toArray(new String[matches.size()]);
     return t;
