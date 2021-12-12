diff --git a/spring-boot/src/main/java/org/springframework/boot/env/PropertySourcesLoader.java b/spring-boot/src/main/java/org/springframework/boot/env/PropertySourcesLoader.java
index 4aa2a34..ac249e4 100644
--- a/spring-boot/src/main/java/org/springframework/boot/env/PropertySourcesLoader.java
+++ b/spring-boot/src/main/java/org/springframework/boot/env/PropertySourcesLoader.java
@@ -168,7 +168,7 @@
 
 		EnumerableCompositePropertySource group = getGeneric(basename);
 		group.add(source);
-		logger.info("Adding PropertySource: " + source + " in group: " + basename);
+		logger.trace("Adding PropertySource: " + source + " in group: " + basename);
 		if (this.propertySources.contains(group.getName())) {
 			this.propertySources.replace(group.getName(), group);
 		}
