diff --git a/spring-boot-cli/src/main/java/org/springframework/boot/cli/command/options/OptionHandler.java b/spring-boot-cli/src/main/java/org/springframework/boot/cli/command/options/OptionHandler.java
index ff8bbd6..629150f 100644
--- a/spring-boot-cli/src/main/java/org/springframework/boot/cli/command/options/OptionHandler.java
+++ b/spring-boot-cli/src/main/java/org/springframework/boot/cli/command/options/OptionHandler.java
@@ -87,7 +87,7 @@
 				argsToUse[i] = "--cp";
 			}
 		}
-		OptionSet options = getParser().parse(args);
+		OptionSet options = getParser().parse(argsToUse);
 		return run(options);
 	}
 
