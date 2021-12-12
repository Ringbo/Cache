diff --git a/dubbo-config/dubbo-config-spring/src/main/java/org/apache/dubbo/config/spring/util/PropertySourcesUtils.java b/dubbo-config/dubbo-config-spring/src/main/java/org/apache/dubbo/config/spring/util/PropertySourcesUtils.java
index b613787..28d43fc 100644
--- a/dubbo-config/dubbo-config-spring/src/main/java/org/apache/dubbo/config/spring/util/PropertySourcesUtils.java
+++ b/dubbo-config/dubbo-config-spring/src/main/java/org/apache/dubbo/config/spring/util/PropertySourcesUtils.java
@@ -55,7 +55,7 @@
                     if (name.startsWith(normalizedPrefix)) {
                         String subName = name.substring(normalizedPrefix.length());
                         String value = propertyResolver.getProperty(name);
-                        subProperties.put(subName, value);
+                        subProperties.putIfAbsent(subName, value);
                     }
                 }
             }
