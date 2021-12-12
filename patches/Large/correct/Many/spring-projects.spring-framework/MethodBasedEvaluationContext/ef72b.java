diff --git a/spring-context/src/main/java/org/springframework/context/expression/MethodBasedEvaluationContext.java b/spring-context/src/main/java/org/springframework/context/expression/MethodBasedEvaluationContext.java
index a20446f..827a4df 100644
--- a/spring-context/src/main/java/org/springframework/context/expression/MethodBasedEvaluationContext.java
+++ b/spring-context/src/main/java/org/springframework/context/expression/MethodBasedEvaluationContext.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2016 the original author or authors.
+ * Copyright 2002-2018 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -101,7 +101,7 @@
 			}
 			setVariable("a" + i, value);
 			setVariable("p" + i, value);
-			if (paramNames != null) {
+			if (paramNames != null && paramNames[i] != null) {
 				setVariable(paramNames[i], value);
 			}
 		}
