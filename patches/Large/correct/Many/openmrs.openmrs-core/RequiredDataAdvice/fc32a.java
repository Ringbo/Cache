diff --git a/api/src/main/java/org/openmrs/aop/RequiredDataAdvice.java b/api/src/main/java/org/openmrs/aop/RequiredDataAdvice.java
index 4979a47..7c47488 100644
--- a/api/src/main/java/org/openmrs/aop/RequiredDataAdvice.java
+++ b/api/src/main/java/org/openmrs/aop/RequiredDataAdvice.java
@@ -123,7 +123,7 @@
 				// if a second argument exists, pass that to the save handler as well
 				// (with current code, it means we're either in an obs save or a user save)				
 				String other = null;
-				if (args.length > 1)
+				if (args.length > 1 && args[1] instanceof String)
 					other = (String) args[1];
 				
 				recursivelyHandle(SaveHandler.class, (OpenmrsObject) mainArgument, other);
