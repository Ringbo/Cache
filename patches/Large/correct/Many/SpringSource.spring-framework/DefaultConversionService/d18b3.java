diff --git a/spring-core/src/main/java/org/springframework/core/convert/support/DefaultConversionService.java b/spring-core/src/main/java/org/springframework/core/convert/support/DefaultConversionService.java
index 408d136..57c742b 100644
--- a/spring-core/src/main/java/org/springframework/core/convert/support/DefaultConversionService.java
+++ b/spring-core/src/main/java/org/springframework/core/convert/support/DefaultConversionService.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2015 the original author or authors.
+ * Copyright 2002-2016 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -141,8 +141,7 @@
 		converterRegistry.addConverter(Boolean.class, String.class, new ObjectToStringConverter());
 
 		converterRegistry.addConverterFactory(new StringToEnumConverterFactory());
-		converterRegistry.addConverter(Enum.class, String.class,
-				new EnumToStringConverter((ConversionService) converterRegistry));
+		converterRegistry.addConverter(new EnumToStringConverter((ConversionService) converterRegistry));
 
 		converterRegistry.addConverter(new StringToLocaleConverter());
 		converterRegistry.addConverter(Locale.class, String.class, new ObjectToStringConverter());
