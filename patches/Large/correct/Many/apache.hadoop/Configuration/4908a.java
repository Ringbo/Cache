diff --git a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/conf/Configuration.java b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/conf/Configuration.java
index dfbeec7..fce2194 100644
--- a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/conf/Configuration.java
+++ b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/conf/Configuration.java
@@ -2962,7 +2962,8 @@
             // xi:include are treated as inline and retain current source
             URL include = getResource(confInclude);
             if (include != null) {
-              Resource classpathResource = new Resource(include, name);
+              Resource classpathResource = new Resource(include, name,
+                  wrapper.isParserRestricted());
               loadResource(properties, classpathResource, quiet);
             } else {
               URL url;
@@ -2983,7 +2984,8 @@
                 }
                 url = href.toURI().toURL();
               }
-              Resource uriResource = new Resource(url, name);
+              Resource uriResource = new Resource(url, name,
+                  wrapper.isParserRestricted());
               loadResource(properties, uriResource, quiet);
             }
             break;
