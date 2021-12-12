diff --git a/spring-context/src/main/java/org/springframework/scheduling/annotation/AsyncAnnotationBeanPostProcessor.java b/spring-context/src/main/java/org/springframework/scheduling/annotation/AsyncAnnotationBeanPostProcessor.java
index 4ef666e..69c969a 100644
--- a/spring-context/src/main/java/org/springframework/scheduling/annotation/AsyncAnnotationBeanPostProcessor.java
+++ b/spring-context/src/main/java/org/springframework/scheduling/annotation/AsyncAnnotationBeanPostProcessor.java
@@ -67,6 +67,7 @@
 	 * The default name of the {@link TaskExecutor} bean to pick up: "taskExecutor".
 	 * <p>Note that the initial lookup happens by type; this is just the fallback
 	 * in case of multiple executor beans found in the context.
+	 * @since 4.2
 	 */
 	public static final String DEFAULT_TASK_EXECUTOR_BEAN_NAME = "taskExecutor";
 
@@ -130,17 +131,16 @@
 			}
 			catch (NoUniqueBeanDefinitionException ex) {
 				try {
-					executorToUse = beanFactory.getBean(DEFAULT_TASK_EXECUTOR_BEAN_NAME, TaskExecutor.class);
+					executorToUse = beanFactory.getBean(DEFAULT_TASK_EXECUTOR_BEAN_NAME, Executor.class);
 				}
 				catch (NoSuchBeanDefinitionException ex2) {
-					throw new IllegalStateException("More than one TaskExecutor bean exists within the context, " +
-							"and none is named 'taskExecutor'. Mark one of them as primary or name it " +
-							"'taskExecutor' (possibly as an alias); or specify the AsyncConfigurer interface " +
-							"and implement getAsyncExecutor() accordingly.", ex);
+					logger.info("More than one TaskExecutor bean found within the context, and none is " +
+							"named 'taskExecutor'. Mark one of them as primary or name it 'taskExecutor' " +
+							"(possibly as an alias) in order to use it for async annotation processing.");
 				}
 			}
 			catch (NoSuchBeanDefinitionException ex) {
-				logger.debug("Could not find default TaskExecutor bean", ex);
+				logger.info("No TaskExecutor bean found for async annotation processing.");
 				// Giving up -> falling back to default executor within the advisor...
 			}
 		}
