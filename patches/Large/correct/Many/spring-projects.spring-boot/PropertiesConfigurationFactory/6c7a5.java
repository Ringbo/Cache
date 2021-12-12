diff --git a/spring-boot/src/main/java/org/springframework/boot/bind/PropertiesConfigurationFactory.java b/spring-boot/src/main/java/org/springframework/boot/bind/PropertiesConfigurationFactory.java
index b9582f6..52baf22 100644
--- a/spring-boot/src/main/java/org/springframework/boot/bind/PropertiesConfigurationFactory.java
+++ b/spring-boot/src/main/java/org/springframework/boot/bind/PropertiesConfigurationFactory.java
@@ -53,9 +53,9 @@
 public class PropertiesConfigurationFactory<T> implements FactoryBean<T>,
 		MessageSourceAware, InitializingBean {
 
-	private static final char[] EXACT_DELIMETERS = { '_', '.', '[' };
+	private static final char[] EXACT_DELIMITERS = { '_', '.', '[' };
 
-	private static final char[] TARGET_NAME_DELIMETERS = { '_', '.' };
+	private static final char[] TARGET_NAME_DELIMITERS = { '_', '.' };
 
 	private final Log logger = LogFactory.getLog(getClass());
 
@@ -308,13 +308,13 @@
 		if (this.ignoreUnknownFields && !isMapTarget()) {
 			// Since unknown fields are ignored we can filter them out early to save
 			// unnecessary calls to the PropertySource.
-			return new DefaultPropertyNamePatternsMatcher(EXACT_DELIMETERS, true, names);
+			return new DefaultPropertyNamePatternsMatcher(EXACT_DELIMITERS, true, names);
 		}
 		if (this.targetName != null) {
 			// We can filter properties to those starting with the target name, but
 			// we can't do a complete filter since we need to trigger the
 			// unknown fields check
-			return new DefaultPropertyNamePatternsMatcher(TARGET_NAME_DELIMETERS,
+			return new DefaultPropertyNamePatternsMatcher(TARGET_NAME_DELIMITERS,
 					this.targetName);
 		}
 		// Not ideal, we basically can't filter anything
