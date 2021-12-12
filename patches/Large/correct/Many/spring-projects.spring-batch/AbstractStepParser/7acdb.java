diff --git a/spring-batch-core/src/main/java/org/springframework/batch/core/configuration/xml/AbstractStepParser.java b/spring-batch-core/src/main/java/org/springframework/batch/core/configuration/xml/AbstractStepParser.java
index e710240..4fdd09f 100644
--- a/spring-batch-core/src/main/java/org/springframework/batch/core/configuration/xml/AbstractStepParser.java
+++ b/spring-batch-core/src/main/java/org/springframework/batch/core/configuration/xml/AbstractStepParser.java
@@ -81,7 +81,7 @@
 		List<Element> taskletElements = (List<Element>) DomUtils.getChildElementsByTagName(stepElement, TASKLET_ELE);
 		if (taskletElements.size() == 1) {
 			boolean stepUnderspecified = CoreNamespaceUtils.isUnderspecified(stepElement);
-			parseTasklet(taskletElements.get(0), bd, parserContext, stepUnderspecified);
+			parseTasklet(stepElement, taskletElements.get(0), bd, parserContext, stepUnderspecified);
 		}
 		else if (taskletElements.size() > 1) {
 			parserContext.getReaderContext().error(
@@ -107,7 +107,7 @@
 
 	}
 
-	private void parseTasklet(Element taskletElement, AbstractBeanDefinition bd, ParserContext parserContext,
+	private void parseTasklet(Element stepElement, Element taskletElement, AbstractBeanDefinition bd, ParserContext parserContext,
 			boolean stepUnderspecified) {
 
 		bd.setBeanClass(StepParserStepFactoryBean.class);
@@ -130,8 +130,9 @@
 		}
 		else if (!stepUnderspecified) {
 			parserContext.getReaderContext().error(
-					"Step [" + taskletElement.getAttribute(ID_ATTR) + "] has neither a <" + CHUNK_ELE
-							+ "/> element nor a '" + TASKLET_REF_ATTR + "' attribute.", taskletElement);
+					"Step [" + stepElement.getAttribute(ID_ATTR) + "] has neither a <" + CHUNK_ELE
+							+ "/> element nor a '" + TASKLET_REF_ATTR + "' attribute referencing a Tasklet.",
+					taskletElement);
 		}
 
 		setUpBeanDefinitionForTaskletStep(taskletElement, bd, parserContext);
