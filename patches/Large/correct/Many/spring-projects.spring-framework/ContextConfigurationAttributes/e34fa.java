diff --git a/org.springframework.test/src/main/java/org/springframework/test/context/ContextConfigurationAttributes.java b/org.springframework.test/src/main/java/org/springframework/test/context/ContextConfigurationAttributes.java
index fd584ee..516c489 100644
--- a/org.springframework.test/src/main/java/org/springframework/test/context/ContextConfigurationAttributes.java
+++ b/org.springframework.test/src/main/java/org/springframework/test/context/ContextConfigurationAttributes.java
@@ -168,13 +168,13 @@
 	/**
 	 * Determine if this {@code ContextConfigurationAttributes} instance has 
 	 * either path-based resource locations or class-based resources.
-	 * @return <code>true</code> if neither the {@link #getLocations() locations}
-	 * nor the {@link #getClasses() classes} array is empty
+	 * @return <code>true</code> if either the {@link #getLocations() locations}
+	 * or the {@link #getClasses() classes} array is not empty
 	 * @see #getLocations()
 	 * @see #getClasses()
 	 */
 	public boolean hasResources() {
-		return !ObjectUtils.isEmpty(getLocations()) && !ObjectUtils.isEmpty(getClasses());
+		return !ObjectUtils.isEmpty(getLocations()) || !ObjectUtils.isEmpty(getClasses());
 	}
 
 	/**
