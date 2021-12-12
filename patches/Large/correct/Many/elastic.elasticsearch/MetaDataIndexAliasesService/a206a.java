diff --git a/src/main/java/org/elasticsearch/cluster/metadata/MetaDataIndexAliasesService.java b/src/main/java/org/elasticsearch/cluster/metadata/MetaDataIndexAliasesService.java
index fe92351..b470c6f 100644
--- a/src/main/java/org/elasticsearch/cluster/metadata/MetaDataIndexAliasesService.java
+++ b/src/main/java/org/elasticsearch/cluster/metadata/MetaDataIndexAliasesService.java
@@ -129,7 +129,7 @@
                                     } finally {
                                         parser.close();
                                     }
-                                } catch (Exception e) {
+                                } catch (Throwable e) {
                                     listener.onFailure(new ElasticSearchIllegalArgumentException("failed to parse filter for [" + aliasAction.alias() + "]", e));
                                     return currentState;
                                 }
