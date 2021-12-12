diff --git a/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/endpoint/ConfigurationPropertiesReportEndpointSerializationTests.java b/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/endpoint/ConfigurationPropertiesReportEndpointSerializationTests.java
index 6b4c4a6..88938e8 100644
--- a/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/endpoint/ConfigurationPropertiesReportEndpointSerializationTests.java
+++ b/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/endpoint/ConfigurationPropertiesReportEndpointSerializationTests.java
@@ -166,7 +166,7 @@
 		Map<String, Object> map = (Map<String, Object>) nestedProperties
 				.get("properties");
 		assertNotNull(map);
-		assertEquals(2, map.size());
+		assertEquals(3, map.size());
 		assertEquals(null, (map.get("map")));
 	}
 
@@ -206,7 +206,8 @@
 		Map<String, Object> map = (Map<String, Object>) nestedProperties
 				.get("properties");
 		assertNotNull(map);
-		assertEquals(2, map.size());
+		// Only one property is mapped in metadata so the others are ignored
+		assertEquals(1, map.size());
 		assertEquals("foo", ((Map<String, Object>) map.get("map")).get("name"));
 	}
 
