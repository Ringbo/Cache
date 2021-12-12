diff --git a/spring-beans/src/main/java/org/springframework/beans/factory/support/DefaultListableBeanFactory.java b/spring-beans/src/main/java/org/springframework/beans/factory/support/DefaultListableBeanFactory.java
index ef1a6d2..eedad5d 100644
--- a/spring-beans/src/main/java/org/springframework/beans/factory/support/DefaultListableBeanFactory.java
+++ b/spring-beans/src/main/java/org/springframework/beans/factory/support/DefaultListableBeanFactory.java
@@ -1136,7 +1136,9 @@
 	}
 
 	/**
-	 * Determine the candidate with the highest priority in the given set of beans.
+	 * Determine the candidate with the highest priority in the given set of beans. As
+	 * defined by the {@link org.springframework.core.Ordered} interface, the lowest
+	 * value has the highest priority.
 	 * @param candidateBeans a Map of candidate names and candidate instances
 	 * that match the required type
 	 * @param requiredType the target dependency type to match against
@@ -1158,7 +1160,7 @@
 								"Multiple beans found with the same priority ('" + highestPriority + "') " +
 										"among candidates: " + candidateBeans.keySet());
 					}
-					else if (candidatePriority > highestPriority) {
+					else if (candidatePriority < highestPriority) {
 						highestPriorityBeanName = candidateBeanName;
 						highestPriority = candidatePriority;
 					}
