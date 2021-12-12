diff --git a/test/commons/org/codehaus/groovy/grails/validation/ConstraintsEvaluatingPropertyTests.java b/test/commons/org/codehaus/groovy/grails/validation/ConstraintsEvaluatingPropertyTests.java
index a91f519..de3fa6d 100644
--- a/test/commons/org/codehaus/groovy/grails/validation/ConstraintsEvaluatingPropertyTests.java
+++ b/test/commons/org/codehaus/groovy/grails/validation/ConstraintsEvaluatingPropertyTests.java
@@ -26,7 +26,7 @@
         Map constraints = (Map)cp.get(groovyClass.newInstance());
 
         assertNotNull(constraints);
-        assertTrue(constraints.isEmpty());
+        assertFalse(constraints.isEmpty());
     }
 
 
