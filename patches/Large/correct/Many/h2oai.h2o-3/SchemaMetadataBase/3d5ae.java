diff --git a/h2o-core/src/main/java/water/api/SchemaMetadataBase.java b/h2o-core/src/main/java/water/api/SchemaMetadataBase.java
index f7d6281..6653eeb 100644
--- a/h2o-core/src/main/java/water/api/SchemaMetadataBase.java
+++ b/h2o-core/src/main/java/water/api/SchemaMetadataBase.java
@@ -93,8 +93,7 @@
    * @param ab
    * @return
    */
-  public AutoBuffer writeJSON_impl(AutoBuffer ab) {
-
+  public final AutoBuffer writeJSON_impl(AutoBuffer ab) {
     ab.putJSONStr("name", name);                                      ab.put1(',');
     ab.putJSONStr("type", type);                                      ab.put1(',');
     ab.putJSONStrUnquoted("is_schema", is_schema ? "true" : "false"); ab.put1(',');
