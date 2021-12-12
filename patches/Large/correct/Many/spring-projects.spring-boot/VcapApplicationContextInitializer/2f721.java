diff --git a/spring-boot/src/main/java/org/springframework/boot/context/initializer/VcapApplicationContextInitializer.java b/spring-boot/src/main/java/org/springframework/boot/context/initializer/VcapApplicationContextInitializer.java
index 9183196..181216c 100644
--- a/spring-boot/src/main/java/org/springframework/boot/context/initializer/VcapApplicationContextInitializer.java
+++ b/spring-boot/src/main/java/org/springframework/boot/context/initializer/VcapApplicationContextInitializer.java
@@ -63,7 +63,7 @@
  * to <code>vcap.application.*</code> in a fairly obvious way, and the VCAP_SERVICES
  * object is unwrapped so that it is a hash of objects with key equal to the service
  * instance name (e.g. "mysql" in the example above), and value equal to that instances
- * properties, and then flattened in the smae way. E.g.
+ * properties, and then flattened in the same way. E.g.
  * 
  * <pre>
  * vcap.application.instance_id: 2ce0ac627a6c8e47e936d829a3a47b5b
@@ -81,6 +81,10 @@
  * ...
  * </pre>
  * 
+ * N.B. this initializer is mainly intended for informational use (the application and
+ * instance ids are particularly useful). For service binding you might find that Spring
+ * Cloud is more convenient and more robust against potential changes in Cloud Foundry.
+ * 
  * @author Dave Syer
  */
 public class VcapApplicationContextInitializer implements
@@ -93,7 +97,9 @@
 
 	private static final String VCAP_SERVICES = "VCAP_SERVICES";
 
-	private int order = Integer.MIN_VALUE + 11;
+	// Intentionally before ConfigFileApplicationContextInitializer so values there can
+	// use these ones
+	private int order = Integer.MIN_VALUE + 9;
 
 	private JsonParser parser = JsonParserFactory.getJsonParser();
 
@@ -188,7 +194,7 @@
 			}
 		}
 		catch (Exception ex) {
-			logger.error("Could not parse VCAP_APPLICATION", ex);
+			logger.error("Could not parse VCAP_SERVICES", ex);
 		}
 		return properties;
 	}
