diff --git a/grails-gsp/src/main/groovy/org/grails/gsp/io/DefaultGroovyPageLocator.java b/grails-gsp/src/main/groovy/org/grails/gsp/io/DefaultGroovyPageLocator.java
index a6971be..a23ba90 100644
--- a/grails-gsp/src/main/groovy/org/grails/gsp/io/DefaultGroovyPageLocator.java
+++ b/grails-gsp/src/main/groovy/org/grails/gsp/io/DefaultGroovyPageLocator.java
@@ -311,9 +311,7 @@
         } else {
             searchPaths = CollectionUtils.newList(
                 GrailsResourceUtils.appendPiecesForUri(SLASHED_VIEWS_DIR_PATH, uri),
-                GrailsResourceUtils.appendPiecesForUri(PATH_TO_WEB_INF_VIEWS, uri),
-                uri,
-                GrailsResourceUtils.CLASSPATH_URL_PREFIX + uri);
+                uri);
         }
         return searchPaths;
     }
