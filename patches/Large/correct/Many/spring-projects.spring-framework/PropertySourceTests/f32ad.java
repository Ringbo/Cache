diff --git a/spring-core/src/test/java/org/springframework/core/env/PropertySourceTests.java b/spring-core/src/test/java/org/springframework/core/env/PropertySourceTests.java
index 28a51d0..de39c59 100644
--- a/spring-core/src/test/java/org/springframework/core/env/PropertySourceTests.java
+++ b/spring-core/src/test/java/org/springframework/core/env/PropertySourceTests.java
@@ -110,8 +110,7 @@
 					ps.toString(),
 					equalTo(String.format("%s [name='%s']",
 							ps.getClass().getSimpleName(),
-							name,
-							map.size())));
+							name)));
 		} finally {
 			logger.setLevel(original);
 		}
