diff --git a/components/camel-saxon/src/main/java/org/apache/camel/component/xquery/XQueryBuilder.java b/components/camel-saxon/src/main/java/org/apache/camel/component/xquery/XQueryBuilder.java
index d7aab9a..d0fc7bf 100644
--- a/components/camel-saxon/src/main/java/org/apache/camel/component/xquery/XQueryBuilder.java
+++ b/components/camel-saxon/src/main/java/org/apache/camel/component/xquery/XQueryBuilder.java
@@ -640,7 +640,7 @@
                 configuration = new Configuration();
                 configuration.setHostLanguage(Configuration.XQUERY);
                 configuration.setStripsWhiteSpace(isStripsAllWhiteSpace() ? Whitespace.ALL : Whitespace.IGNORABLE);
-                LOG.debug("Created new Configuration {}");
+                LOG.debug("Created new Configuration {}", configuration);
             } else {
                 LOG.debug("Using existing Configuration {}", configuration);
             }
