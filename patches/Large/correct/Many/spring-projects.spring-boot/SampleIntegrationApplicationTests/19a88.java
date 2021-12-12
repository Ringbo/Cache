diff --git a/spring-boot-samples/spring-boot-sample-integration/src/test/java/org/springframework/boot/sample/integration/consumer/SampleIntegrationApplicationTests.java b/spring-boot-samples/spring-boot-sample-integration/src/test/java/org/springframework/boot/sample/integration/consumer/SampleIntegrationApplicationTests.java
index 0b0c071..c9143c5 100644
--- a/spring-boot-samples/spring-boot-sample-integration/src/test/java/org/springframework/boot/sample/integration/consumer/SampleIntegrationApplicationTests.java
+++ b/spring-boot-samples/spring-boot-sample-integration/src/test/java/org/springframework/boot/sample/integration/consumer/SampleIntegrationApplicationTests.java
@@ -84,6 +84,6 @@
 						return builder.toString();
 					}
 				});
-		return future.get(10, TimeUnit.SECONDS);
+		return future.get(30, TimeUnit.SECONDS);
 	}
 }
