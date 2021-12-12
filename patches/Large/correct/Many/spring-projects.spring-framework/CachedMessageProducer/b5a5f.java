diff --git a/spring-jms/src/main/java/org/springframework/jms/connection/CachedMessageProducer.java b/spring-jms/src/main/java/org/springframework/jms/connection/CachedMessageProducer.java
index 4ff2ce0..63ebe12 100644
--- a/spring-jms/src/main/java/org/springframework/jms/connection/CachedMessageProducer.java
+++ b/spring-jms/src/main/java/org/springframework/jms/connection/CachedMessageProducer.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2013 the original author or authors.
+ * Copyright 2002-2014 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -284,7 +284,7 @@
 								target, args[0], args[1], deliveryMode, priority, timeToLive, args[2]);
 					}
 				}
-				return method.invoke(target, args);
+				return method.invoke(CachedMessageProducer.this, args);
 			}
 			catch (InvocationTargetException ex) {
 				throw ex.getTargetException();
