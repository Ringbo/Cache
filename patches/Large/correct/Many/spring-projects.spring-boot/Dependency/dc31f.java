diff --git a/spring-boot-project/spring-boot-cli/src/main/java/org/springframework/boot/cli/compiler/dependencies/Dependency.java b/spring-boot-project/spring-boot-cli/src/main/java/org/springframework/boot/cli/compiler/dependencies/Dependency.java
index e703714..52f7b6d 100644
--- a/spring-boot-project/spring-boot-cli/src/main/java/org/springframework/boot/cli/compiler/dependencies/Dependency.java
+++ b/spring-boot-project/spring-boot-cli/src/main/java/org/springframework/boot/cli/compiler/dependencies/Dependency.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2012-2018 the original author or authors.
+ * Copyright 2012-2019 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -145,7 +145,7 @@
 
 		Exclusion(String groupId, String artifactId) {
 			Assert.notNull(groupId, "GroupId must not be null");
-			Assert.notNull(groupId, "ArtifactId must not be null");
+			Assert.notNull(artifactId, "ArtifactId must not be null");
 			this.groupId = groupId;
 			this.artifactId = artifactId;
 		}
