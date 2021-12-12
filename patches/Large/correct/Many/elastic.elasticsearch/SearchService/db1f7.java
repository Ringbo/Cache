diff --git a/modules/elasticsearch/src/main/java/org/elasticsearch/search/SearchService.java b/modules/elasticsearch/src/main/java/org/elasticsearch/search/SearchService.java
index 9550636..f5bde47 100644
--- a/modules/elasticsearch/src/main/java/org/elasticsearch/search/SearchService.java
+++ b/modules/elasticsearch/src/main/java/org/elasticsearch/search/SearchService.java
@@ -414,10 +414,10 @@
             String sSource = "_na_";
             try {
                 sSource = Unicode.fromBytes(source, offset, length);
-            } catch (Error e1) {
+            } catch (Throwable e1) {
                 // ignore
             }
-            throw new SearchParseException(context, "Failed to parse [" + sSource + "]", e);
+            throw new SearchParseException(context, "Failed to parse source [" + sSource + "]", e);
         }
     }
 
