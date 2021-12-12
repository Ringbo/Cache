diff --git a/spring-core/src/main/java/org/springframework/core/SimpleAliasRegistry.java b/spring-core/src/main/java/org/springframework/core/SimpleAliasRegistry.java
index 82fe661..1dfe2db 100644
--- a/spring-core/src/main/java/org/springframework/core/SimpleAliasRegistry.java
+++ b/spring-core/src/main/java/org/springframework/core/SimpleAliasRegistry.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2012 the original author or authors.
+ * Copyright 2002-2015 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -122,7 +122,7 @@
 				String registeredName = aliasCopy.get(alias);
 				String resolvedAlias = valueResolver.resolveStringValue(alias);
 				String resolvedName = valueResolver.resolveStringValue(registeredName);
-				if (resolvedAlias.equals(resolvedName)) {
+				if (resolvedAlias == null || resolvedName == null || resolvedAlias.equals(resolvedName)) {
 					this.aliasMap.remove(alias);
 				}
 				else if (!resolvedAlias.equals(alias)) {
