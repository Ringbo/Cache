diff --git a/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/properties/CrshPropertiesTests.java b/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/properties/CrshPropertiesTests.java
index d00cabc..0a8ee24 100644
--- a/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/properties/CrshPropertiesTests.java
+++ b/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/properties/CrshPropertiesTests.java
@@ -92,7 +92,7 @@
 		binder.bind(new MutablePropertyValues(Collections.singletonMap("shell.config_path_patterns",
 				"pattern1, pattern2")));
 		assertFalse(binder.getBindingResult().hasErrors());
-		assertEquals(2, props.getConfigPathPatterns().length, 2);
+		assertEquals(2, props.getConfigPathPatterns().length);
 		Assert.assertArrayEquals(new String[] { "pattern1", "pattern2" }, props.getConfigPathPatterns());
 	}
 
@@ -104,7 +104,7 @@
 		binder.bind(new MutablePropertyValues(Collections.singletonMap("shell.disabled_plugins",
 				"pattern1, pattern2")));
 		assertFalse(binder.getBindingResult().hasErrors());
-		assertEquals(2, props.getDisabledPlugins().length, 2);
+		assertEquals(2, props.getDisabledPlugins().length);
 		assertArrayEquals(new String[] { "pattern1", "pattern2" }, props.getDisabledPlugins());
 	}
 
