diff --git a/spring-boot/src/main/java/org/springframework/boot/context/initializer/VcapApplicationContextInitializer.java b/spring-boot/src/main/java/org/springframework/boot/context/initializer/VcapApplicationContextInitializer.java
index 1b66e80..be21629 100644
--- a/spring-boot/src/main/java/org/springframework/boot/context/initializer/VcapApplicationContextInitializer.java
+++ b/spring-boot/src/main/java/org/springframework/boot/context/initializer/VcapApplicationContextInitializer.java
@@ -160,7 +160,7 @@
 				properties.putAll(map);
 			}
 		}
-		catch (IllegalArgumentException e) {
+		catch (Exception e) {
 			logger.error("Could not parse VCAP_APPLICATION", e);
 		}
 		return properties;
@@ -187,7 +187,7 @@
 				}
 			}
 		}
-		catch (IllegalArgumentException e) {
+		catch (Exception e) {
 			logger.error("Could not parse VCAP_APPLICATION", e);
 		}
 		return properties;
