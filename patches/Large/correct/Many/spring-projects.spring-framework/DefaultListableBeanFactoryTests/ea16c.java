diff --git a/spring-beans/src/test/java/org/springframework/beans/factory/DefaultListableBeanFactoryTests.java b/spring-beans/src/test/java/org/springframework/beans/factory/DefaultListableBeanFactoryTests.java
index 618ad67..784f0fa 100644
--- a/spring-beans/src/test/java/org/springframework/beans/factory/DefaultListableBeanFactoryTests.java
+++ b/spring-beans/src/test/java/org/springframework/beans/factory/DefaultListableBeanFactoryTests.java
@@ -1399,7 +1399,7 @@
 		lbf.registerBeanDefinition("bd2", bd2);
 		thrown.expect(NoUniqueBeanDefinitionException.class);
 		thrown.expectMessage(containsString("Multiple beans found with the same priority"));
-		thrown.expectMessage(containsString("500")); // conflicting priority
+		thrown.expectMessage(containsString("5")); // conflicting priority
 		lbf.getBean(TestBean.class);
 	}
 
@@ -1613,7 +1613,7 @@
 			// expected
 			assertNotNull("Exception should have cause", ex.getCause());
 			assertEquals("Wrong cause type", NoUniqueBeanDefinitionException.class, ex.getCause().getClass());
-			assertTrue(ex.getMessage().contains("500")); // conflicting priority
+			assertTrue(ex.getMessage().contains("5")); // conflicting priority
 		}
 	}
 
@@ -2887,10 +2887,10 @@
 
 	}
 
-	@Priority(500)
+	@Priority(5)
 	private static class HighPriorityTestBean extends TestBean {}
 
-	@Priority(5)
+	@Priority(500)
 	private static class LowPriorityTestBean extends TestBean {}
 
 
