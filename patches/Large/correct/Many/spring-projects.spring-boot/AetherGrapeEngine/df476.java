diff --git a/spring-boot-cli/src/main/java/org/springframework/boot/cli/compiler/grape/AetherGrapeEngine.java b/spring-boot-cli/src/main/java/org/springframework/boot/cli/compiler/grape/AetherGrapeEngine.java
index 263910b..96441a2 100644
--- a/spring-boot-cli/src/main/java/org/springframework/boot/cli/compiler/grape/AetherGrapeEngine.java
+++ b/spring-boot-cli/src/main/java/org/springframework/boot/cli/compiler/grape/AetherGrapeEngine.java
@@ -268,7 +268,7 @@
 			builder.setProxy(this.proxySelector.getProxy(repository));
 			repository = builder.build();
 		}
-		this.repositories.add(repository);
+		this.repositories.add(0, repository);
 	}
 
 	@Override
