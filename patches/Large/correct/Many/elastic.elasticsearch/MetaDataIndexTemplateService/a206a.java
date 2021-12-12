diff --git a/src/main/java/org/elasticsearch/cluster/metadata/MetaDataIndexTemplateService.java b/src/main/java/org/elasticsearch/cluster/metadata/MetaDataIndexTemplateService.java
index 0190207..64686f8 100644
--- a/src/main/java/org/elasticsearch/cluster/metadata/MetaDataIndexTemplateService.java
+++ b/src/main/java/org/elasticsearch/cluster/metadata/MetaDataIndexTemplateService.java
@@ -93,7 +93,7 @@
 
         try {
             validate(request);
-        } catch (Exception e) {
+        } catch (Throwable e) {
             listener.onFailure(e);
             return;
         }
@@ -110,7 +110,7 @@
             for (Map.Entry<String, IndexMetaData.Custom> entry : request.customs.entrySet()) {
                 templateBuilder.putCustom(entry.getKey(), entry.getValue());
             }
-        } catch (Exception e) {
+        } catch (Throwable e) {
             listener.onFailure(e);
             return;
         }
