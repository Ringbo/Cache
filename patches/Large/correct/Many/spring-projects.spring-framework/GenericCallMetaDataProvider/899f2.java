diff --git a/spring-jdbc/src/main/java/org/springframework/jdbc/core/metadata/GenericCallMetaDataProvider.java b/spring-jdbc/src/main/java/org/springframework/jdbc/core/metadata/GenericCallMetaDataProvider.java
index 4cda871..94fc7ce 100644
--- a/spring-jdbc/src/main/java/org/springframework/jdbc/core/metadata/GenericCallMetaDataProvider.java
+++ b/spring-jdbc/src/main/java/org/springframework/jdbc/core/metadata/GenericCallMetaDataProvider.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2016 the original author or authors.
+ * Copyright 2002-2017 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -361,15 +361,14 @@
 						columnType == DatabaseMetaData.procedureColumnOut)) {
 					if (logger.isDebugEnabled()) {
 						logger.debug("Skipping metadata for: " + columnType + " " + procs.getInt("DATA_TYPE") +
-							" " + procs.getString("TYPE_NAME") + " " + procs.getBoolean("NULLABLE") +
-							" (probably a member of a collection)"
-						);
+							" " + procs.getString("TYPE_NAME") + " " + procs.getInt("NULLABLE") +
+							" (probably a member of a collection)");
 					}
 				}
 				else {
 					CallParameterMetaData meta = new CallParameterMetaData(columnName, columnType,
-							procs.getInt("DATA_TYPE"), procs.getString("TYPE_NAME"), procs.getBoolean("NULLABLE")
-					);
+							procs.getInt("DATA_TYPE"), procs.getString("TYPE_NAME"),
+							procs.getInt("NULLABLE") == DatabaseMetaData.procedureNullable);
 					this.callParameterMetaData.add(meta);
 					if (logger.isDebugEnabled()) {
 						logger.debug("Retrieved metadata: " + meta.getParameterName() + " " +
