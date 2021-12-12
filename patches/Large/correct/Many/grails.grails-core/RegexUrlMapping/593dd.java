diff --git a/src/web/org/codehaus/groovy/grails/web/mapping/RegexUrlMapping.java b/src/web/org/codehaus/groovy/grails/web/mapping/RegexUrlMapping.java
index 6d414f8..3c6d525 100644
--- a/src/web/org/codehaus/groovy/grails/web/mapping/RegexUrlMapping.java
+++ b/src/web/org/codehaus/groovy/grails/web/mapping/RegexUrlMapping.java
@@ -259,7 +259,7 @@
                     addedParams = true;
                 }
                 else {
-                    uri.append(ENTITY_AMPERSAND);
+                    uri.append(AMPERSAND);
                 }
                 Object value = parameterValues.get(name);
                 if(value != null && value instanceof Collection) {
@@ -268,7 +268,7 @@
                         Object o = j.next();
                         appendValueToURI(encoding, uri, name, o);
                         if(j.hasNext()) {
-                            uri.append(ENTITY_AMPERSAND);
+                            uri.append(AMPERSAND);
                         }
                     }
                 }
@@ -278,7 +278,7 @@
                         Object o = multiValues[j];
                         appendValueToURI(encoding, uri, name, o);
                         if(j+1 < multiValues.length) {
-                            uri.append(ENTITY_AMPERSAND);
+                            uri.append(AMPERSAND);
                         }
                     }
                 }
