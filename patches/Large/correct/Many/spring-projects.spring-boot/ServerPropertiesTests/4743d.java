diff --git a/spring-bootstrap-actuator/src/test/java/org/springframework/bootstrap/actuate/properties/ServerPropertiesTests.java b/spring-bootstrap-actuator/src/test/java/org/springframework/bootstrap/actuate/properties/ServerPropertiesTests.java
index bcf296f..975583b 100644
--- a/spring-bootstrap-actuator/src/test/java/org/springframework/bootstrap/actuate/properties/ServerPropertiesTests.java
+++ b/spring-bootstrap-actuator/src/test/java/org/springframework/bootstrap/actuate/properties/ServerPropertiesTests.java
@@ -29,7 +29,6 @@
  * Externalized configuration for server properties
  * 
  * @author Dave Syer
- * 
  */
 public class ServerPropertiesTests {
 
@@ -41,7 +40,7 @@
 		binder.bind(new MutablePropertyValues(Collections.singletonMap("server.address",
 				"127.0.0.1")));
 		assertFalse(binder.getBindingResult().hasErrors());
-		assertEquals(InetAddress.getLocalHost(), this.properties.getAddress());
+		assertEquals(InetAddress.getByName("127.0.0.1"), this.properties.getAddress());
 	}
 
 	@Test
