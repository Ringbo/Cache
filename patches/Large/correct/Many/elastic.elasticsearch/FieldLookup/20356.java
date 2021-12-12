diff --git a/modules/elasticsearch/src/main/java/org/elasticsearch/search/lookup/FieldLookup.java b/modules/elasticsearch/src/main/java/org/elasticsearch/search/lookup/FieldLookup.java
index bf695ae..7952c63 100644
--- a/modules/elasticsearch/src/main/java/org/elasticsearch/search/lookup/FieldLookup.java
+++ b/modules/elasticsearch/src/main/java/org/elasticsearch/search/lookup/FieldLookup.java
@@ -64,7 +64,7 @@
         value = null;
         valueLoaded = false;
         values.clear();
-        valuesLoaded = true;
+        valuesLoaded = false;
         doc = null;
     }
 
