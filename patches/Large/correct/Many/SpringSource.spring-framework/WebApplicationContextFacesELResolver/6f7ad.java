diff --git a/spring-web/src/main/java/org/springframework/web/jsf/el/WebApplicationContextFacesELResolver.java b/spring-web/src/main/java/org/springframework/web/jsf/el/WebApplicationContextFacesELResolver.java
index 83b4af6..bd41969 100644
--- a/spring-web/src/main/java/org/springframework/web/jsf/el/WebApplicationContextFacesELResolver.java
+++ b/spring-web/src/main/java/org/springframework/web/jsf/el/WebApplicationContextFacesELResolver.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2017 the original author or authors.
+ * Copyright 2002-2018 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -150,7 +150,7 @@
 	public boolean isReadOnly(ELContext elContext, Object base, Object property) throws ELException {
 		if (base instanceof WebApplicationContext) {
 			elContext.setPropertyResolved(true);
-			return false;
+			return true;
 		}
 		return false;
 	}
@@ -168,9 +168,9 @@
 
 
 	/**
-	 * Retrieve the WebApplicationContext reference to expose.
-	 * <p>The default implementation delegates to FacesContextUtils,
-	 * returning {@code null} if no WebApplicationContext found.
+	 * Retrieve the {@link WebApplicationContext} reference to expose.
+	 * <p>The default implementation delegates to {@link FacesContextUtils},
+	 * returning {@code null} if no {@code WebApplicationContext} found.
 	 * @param elContext the current JSF ELContext
 	 * @return the Spring web application context
 	 * @see org.springframework.web.jsf.FacesContextUtils#getWebApplicationContext
