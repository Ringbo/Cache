diff --git a/spring-batch-core/src/main/java/org/springframework/batch/core/jsr/configuration/xml/StepParser.java b/spring-batch-core/src/main/java/org/springframework/batch/core/jsr/configuration/xml/StepParser.java
index 3b9cc42..784a5d5 100644
--- a/spring-batch-core/src/main/java/org/springframework/batch/core/jsr/configuration/xml/StepParser.java
+++ b/spring-batch-core/src/main/java/org/springframework/batch/core/jsr/configuration/xml/StepParser.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2013-2014 the original author or authors.
+ * Copyright 2013-2018 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -37,6 +37,7 @@
  * @author Michael Minella
  * @author Glenn Renfro
  * @author Chris Schaefer
+ * @author Mahmoud Ben Hassine
  * @since 3.0
  */
 public class StepParser extends AbstractSingleBeanDefinitionParser {
@@ -67,11 +68,11 @@
 		}
 
 		String allowStartIfComplete = element.getAttribute(ALLOW_START_IF_COMPLETE_ATTRIBUTE);
-		boolean allowStartIfCompletValue = false;
+		boolean allowStartIfCompleteValue = false;
 		if(StringUtils.hasText(allowStartIfComplete)) {
 			bd.getPropertyValues().addPropertyValue("allowStartIfComplete",
 					allowStartIfComplete);
-			allowStartIfCompletValue = Boolean.valueOf(allowStartIfComplete);
+			allowStartIfCompleteValue = Boolean.valueOf(allowStartIfComplete);
 		}
 
 		new ListenerParser(JsrStepListenerFactoryBean.class, "listeners").parseListeners(element, parserContext, bd, stepName);
@@ -92,7 +93,7 @@
 				} else if(name.equals(CHUNK_ELEMENT)) {
 					new ChunkParser().parse(nestedElement, bd, parserContext, stepName);
 				} else if(name.equals(PARTITION_ELEMENT)) {
-					new PartitionParser(stepName, allowStartIfCompletValue).parse(nestedElement, bd, parserContext, stepName);
+					new PartitionParser(stepName, allowStartIfCompleteValue).parse(nestedElement, bd, parserContext, stepName);
 				}
 			}
 		}
