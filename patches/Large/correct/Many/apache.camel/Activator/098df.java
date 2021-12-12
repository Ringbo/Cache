diff --git a/core/camel-core-osgi/src/main/java/org/apache/camel/core/osgi/impl/Activator.java b/core/camel-core-osgi/src/main/java/org/apache/camel/core/osgi/impl/Activator.java
index dd105b0..ac1e0f5 100644
--- a/core/camel-core-osgi/src/main/java/org/apache/camel/core/osgi/impl/Activator.java
+++ b/core/camel-core-osgi/src/main/java/org/apache/camel/core/osgi/impl/Activator.java
@@ -235,7 +235,7 @@
             URL url3 = bundle.getEntry(META_INF_FALLBACK_TYPE_CONVERTER);
             if (url1 != null || url2 != null || url3 != null) {
                 LOG.debug("Found TypeConverter in bundle {}", bundle.getSymbolicName());
-                resolvers.add(new BundleTypeConverterLoader(bundle, url2 != null));
+                resolvers.add(new BundleTypeConverterLoader(bundle, url3 != null));
             }
         }
     }
