diff --git a/spring-test/src/main/java/org/springframework/test/web/servlet/result/HeaderResultMatchers.java b/spring-test/src/main/java/org/springframework/test/web/servlet/result/HeaderResultMatchers.java
index ee47001..aac0bab 100644
--- a/spring-test/src/main/java/org/springframework/test/web/servlet/result/HeaderResultMatchers.java
+++ b/spring-test/src/main/java/org/springframework/test/web/servlet/result/HeaderResultMatchers.java
@@ -89,7 +89,7 @@
 		return new ResultMatcher() {
 			@Override
 			public void match(MvcResult result) {
-				assertEquals("Response header " + name, result.getResponse().getHeader(name), value);
+				assertEquals("Response header " + name, value, result.getResponse().getHeader(name));
 			}
 		};
 	}
