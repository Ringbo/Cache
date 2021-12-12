diff --git a/spring-context-support/src/main/java/org/springframework/ui/freemarker/FreeMarkerConfigurationFactory.java b/spring-context-support/src/main/java/org/springframework/ui/freemarker/FreeMarkerConfigurationFactory.java
index ee6e745..9d114f4 100644
--- a/spring-context-support/src/main/java/org/springframework/ui/freemarker/FreeMarkerConfigurationFactory.java
+++ b/spring-context-support/src/main/java/org/springframework/ui/freemarker/FreeMarkerConfigurationFactory.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2016 the original author or authors.
+ * Copyright 2002-2017 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -342,7 +342,7 @@
 				}
 				return new FileTemplateLoader(file);
 			}
-			catch (IOException ex) {
+			catch (Exception ex) {
 				if (logger.isDebugEnabled()) {
 					logger.debug("Cannot resolve template loader path [" + templateLoaderPath +
 							"] to [java.io.File]: using SpringTemplateLoader as fallback", ex);
